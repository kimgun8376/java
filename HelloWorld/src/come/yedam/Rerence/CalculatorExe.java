package come.yedam.Rerence;

public class CalculatorExe {
	public static void main(String[] args) {
		Book[] bookRepo = {new Book("이것이 자바다.","신용권","한빛미디어", 1000)
				,new Book("자바스크립트 기초", "김자바", "자바출반사",15000)
				,new Book("혼자공부하는 자바", "혼공자", "한빛미디어",20000)

				};	
		Calculator cal = new Calculator();
		String title = "자바스크립티 기초";
		Book temp = cal.getBookInfo(title,bookRepo);
				if (temp != null)  { //조회하기 ! = null
					temp.showDetailInfo();
		}   else {
			System.out.println("조회결과 있음"); // book author.getBooktitle()+ ","		} else {
			//
		}
			System.out.println("조회결과 없음");
		
		
		int[] randomA = cal.randomAry(5);
		for (int num : randomA) {
			System.out.println(num);
		}
		System.out.println(cal.sum(randomA)); // 랜덤숫자 생성

		
		
		int[] ary1 = { 14, 23, 11, 14, 24 };
		int[] ary2 = { 33, 23, 6, 12, 9 };

		int max = cal.getMax(cal.sum(ary1), cal.sum(ary2));
		System.out.println("배열의 합이 큰값은" + max); //가장 큰 값 생성 

		// cal.printStar(5);
		// cal.printStar(3, "＊"); //매개값.

		double n1 = 10.5;
		double n2 = 20.5;
		double result = cal.sum(n1, n2);

		// double > float > long . int > short > byte
		result = cal.sum(new int[] { 10, 20, 30, 40 });
		System.out.println("결과:" + result);
		System.out.println(10);

	}
}
