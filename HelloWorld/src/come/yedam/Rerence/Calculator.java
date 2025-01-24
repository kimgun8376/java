package come.yedam.Rerence;

public class Calculator {

	public Book getBookInfo(String btitle, Book[] BookAry) {
	/*	Book[] bookRepo = {new Book("이것이 자바다.","신용권","한빛미디어", 1000)
		,new Book("자바스크립트 기초", "김자바", "자바출반사",15000)
		,new Book("혼자공부하는 자바", "혼공자", "한빛미디어",20000)

		}; */
	   //배열검색;
		for(int i=0; i < BookAry.length; i++) {
			if(BookAry[i].BookName().equals(btitle)) {
				return BookAry[i];
			}
		}
	   return null; // book일경우 null값
	}
	
	        
	// 1 ~ 100사이의 임의값을 n개 반환.
	public int[] randomAry(int n) {
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * 100) + 1;
		}
		return result;
	}
	// 랜덤숫자 생성

	// 두 숫자중에서 큰 값을 반환.
	public int getMax(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
		// return num1;
	}

	// *
	// **
	// ***
	// ****

	public void printStar(int times) { // times 몇번출력
		for (int i = 1; i <= times; i++) {
			printStar(i, "＊"); // 반복문
			System.out.println(4);
		}
	}

	// 별 출력하는 메소드.
	public void printStar(int times, String types) { // 매개변수.
		for (int i = 1; i <= times; i++) {
			System.out.print(types);

		}
	}

	// 두수의 합을 반환.
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	// 동일한 메소드명을 중복정의 : overloading.
	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	public int sum(int[] intAry) {
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		return sum;
	}
}