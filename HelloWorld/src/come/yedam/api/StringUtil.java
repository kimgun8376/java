package come.yedam.api;

import java.util.Scanner;

public class StringUtil {
	static void dddd(String ssn) {
		ssn = ssn.replace(" ", "");
		ssn = ssn.replace("-", "");
		char chr = ssn.charAt(6);
		switch (chr) {
		case '1' :
		case '3' :
                 System.out.println("남자입니다.");
                 break;
		case '2' :
		case '4' :
            System.out.println("여자입니다.");

		}

		// 성별을 출력, "남자입니다" 또는 "여자입니다."
	}

	static void checkExtesion(String file) {
		// 파일의 확장자는 jpg(또는 mp3,http)입니다.
	String ext = file.substring(file.indexOf(".")+1);
    System.out.println("파일의 확장자는 %s 입니다.");
	
	}

	static void getLength(String str) {
		// 문자열 길이 문자의 길이는 7글자 입니다
	      
		int len = str.trim().length();
	      System.out.printf("문장의 길이는 %d 글자입니다.");

	      
	
	}

}
