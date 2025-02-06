package come.yedam.api;

public class StringExm {
	public static void main(String[] args) {
       // 문제호출
		no1();
	}

	static void 연습() {
		String str = "HELLO";
		String str1 = "World";
	}

	static void no1() {
      String ssn1 = "999999199999";
      String ssn2 = "999999 299999";
      String ssn3 = "999999-199999";
		StringUtil.dddd(ssn1);
		StringUtil.dddd(ssn2);
		StringUtil.dddd(ssn3);

	}

	static void no2() {
      //파일경로와 파일명
		// subString, indexof
		String file1 = "C:temp/flower.jpg";
		String file2 = "D:/web/project/guide.mp3";
		StringUtil.checkExtesion(file1);

	}
	static void no3() {
	      //문자의갯수를 반환.
			String str1 = "suggest";
			String str2 = "currently";
			String str3 = "particular";
			StringUtil.getLength(str1);

		}

}
