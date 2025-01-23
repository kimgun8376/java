package come.yedam;

import java.util.Scanner;

public class Variable3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//in 입력장치 , out 출력장치
		int balance = 0;  // 예금액. 54000 .50000 : 10만원초과 메시지 :"초과금액입니다", "잔액을 확인하세요"
		int money=0;
		
		while(true) {
		System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
		System.out.print("메뉴를 선택하세요>");
		int num = Integer.parseInt(scn.nextLine()); // 문자타입반환. -> int 변환
		
		if(num ==1) { //입금.
			System.out.print("입금액을 입력>");
<<<<<<< HEAD
			money = Integer.parseInt(scn.nextLine());
            if (balance + money > 100000) {
            	System.out.print("금액초과입니다..");
            } else {
            	balance += money;
            	System.out.print("입금완료.");
            }

	} else if (num ==2 ) { //출금.
			System.out.print("출금액을 입력>");
			money = Integer.parseInt(scn.nextLine());
            if (balance < money) {
            	System.out.print("잔액을 확인하세요.");
            } else {
            	balance -= money;
            	System.out.print("출금완료.");
            }
=======
            balance = Integer.parseInt(scn.nextLine()); 
		} else if (num ==2 ) { //출금.
			System.out.print("출금액을 입력>");
            balance = Integer.parseInt(scn.nextLine()); 
>>>>>>> refs/remotes/origin/master
		} else if (num ==3 ) { //잔액조회.		     		
		   System.out.printf("현재 잔액은 %d입니다.\n", balance);
		} else if (num ==4 ) { //종료.		
<<<<<<< HEAD
			System.out.print("프로그램을 종료합니다.");
		     break;
=======
      	   elrat()
>>>>>>> refs/remotes/origin/master
		}
		
		
		/* else if (num > 100000) { //초과금액입니다.
	     System.out.print("초과금액입니다.");
	    balance += Integer.parseInt(scn.nextLine());  
		} */
		  
		}
	//	System.out.printf("end of prog\n");
		
		
	}
}