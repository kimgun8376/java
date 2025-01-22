package come.yedam;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
//	   String[] infoAry = "홍길동-80-85".split(""); //split 구분하기 
//	   System.out.println(infoAry[0]);
//	   System.out.println(infoAry[1]);
//	   System.out.println(infoAry[2]);
		// System.out.println(Integer.parserInt(infoAry[1]));

		/*
		 * String[] strAry = new String[10]; strAry[0] = "홍길동"; String name ="김길동";
		 * for(int i=0; i <strAry.length; i++) { if (strAry[i] == null) { //빈공간에 등록 후
		 * 반복문 종료 strAry[i] = name; break; } }
		 * 
		 * for(int i=0; i <strAry.length; i++) { if (strAry[i] != null) {
		 * System.out.println(strAry[i]); } }
		 */

		
		Scanner scn = new Scanner(System.in);
		System.out.println("이름입력>>");
		String searchName = scn.nextLine();
		System.out.println("박우식".equals(searchName)); // equale 문자 타입에만 쓸쑤 있는 변수 
		
		
		String[] studentAry = new String[100]; // {"","",""}
		studentAry[0] = "홍길동,80";
		studentAry[1] = "김민수,70";
		studentAry[2] = "박우식,80";

		
		boolean run = true;
		int[] scores = new int[3];
		String[] mix = new String[3];

		while (run) {
			System.out.println("1.학생이름,점수 2.최고점수 3.학생입력(한건씩) 4.조회(이름) 9.종료");
			System.out.print("선택하세요>");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("학생과점수를 같이입력하세요.");
					studentAry[i] = scn.nextLine();
				}
				// studentAry[i] = (scn.nextLine());
				// scores[i] = Integer.parseInt(scn.nextLine()); // 2개이상 입력시 for ~ out.print 작성후
				// 2개변수 작성

				System.out.println("등록완료");
				break;

			case 2:
				int max = 0;
				for (int i = 0; i < studentAry.length; i++) { 
					if (studentAry[i] != null) {// 값이 있을 경우.
						int temp = Integer.parseInt(studentAry[i].split(" ")[1]); //
						if (max < temp) {
							max = temp;
						}
					}
				}
				System.out.printf("최고점은 %d입니다.\n", max);
				break;

			case 3: // 학생입력(단건)
				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("학생입력(단건)");
					studentAry[i] = scn.nextLine();
					{

						break;

					}
				}

				/*
				 * int max = 0; for(int i =0; i < studentAry.length; i++) { int temp =
				 * Integer.parseeInt(studentAry[i].split(",")[1]); if (max < temp) { max = temp;
				 * } } System.out.printf("최고점수는 %d\n", max);
				 */
			
			case 4: // 조회(입력)
				System.out.println("이름을 입력하세요.");
				String search = scn.nextLine();
			    
			    for (int i =0; i < studentAry.length; i++) {
			    if(studentAry[i] != null) {
			    	if(studentAry[i].split(" ")[0].equals(searchName)) {
			    		System.out.printf("%s의 점수는 %s입니다.\n",
			    				studentAry[i].split(" ,")[0],
	    				studentAry[i].split(" ,")[1]);
			    		break;
			    	
			    	}
			    }
			    	
            } // end of while.

		System.out.println("end of prog");
			
			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default: // 잘못입력시
				System.out.println("메뉴를 다시선택하세요.");
			}
 
		} // end of while.

		System.out.println("end of prog");

	} // end of main.
} // end of class
