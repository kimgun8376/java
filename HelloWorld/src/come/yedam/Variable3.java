package come.yedam;

import java.util.Scanner;

public class Variable3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//in 입력장치 , out 출력장치
		int balance = 0;  // 예금액.
		while(true) {
		System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
		System.out.print("메뉴를 선택하세요>");
		int num = Integer.parseInt(scn.nextLine()); // 문자타입반환. -> int 변환
		
		if(num ==1) { //입금.
			System.out.print("입금액을 입력>");
            balance = Integer.parseInt(scn.nextLine()); 
		} else if (num ==2 ) { //출금.
			
		} else if (num ==3 ) { //잔액조회.		     		
		   System.out.printf("현재 잔액은 %d입니다.\n", balance);
		} else if (num ==4 ) { //종료.		
      	
		}
		
		}
	//	System.out.printf("end of prog\n");
		
		
	}
}