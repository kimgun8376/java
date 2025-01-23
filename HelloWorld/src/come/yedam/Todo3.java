package come.yedam;

import java.util.Scanner;

public class Todo3 {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);

	String[][] friendAry = new String[100][3];
	friendAry[0] = new String[] {"홍길동1", "010-1111-1111", "남"};
	friendAry[1] = new String[] {"홍길동2", "010-2222-2222", "남"};
	friendAry[2] = new String[] {"홍길동3", "010-3333-3333", "남"};
	friendAry[3] = new String[] {"홍길동4", "010-4444-4444", "남"};


	boolean _run = true;

	while (_run) {
		System.out.println("1.이름 2.등록 3. 조회(성별) 4.삭제 5.수정(이름): 연락처 수정 0.종료");
		System.out.print("메뉴를 선택하세요>");
		int menu = Integer.parseInt(scn.nextLine());

		switch (menu) {

		case 1:

			System.out.println("이름, 연락처, 성별을 입력하세요");

			System.out.println("-------------------------------------------------------------------");

			for (int i = 0; i < friendAry.length; i++) {

				if (friendAry[i][0] != null) {
                     
					System.out.printf("%s %s %s\n",friendAry[i][0]
					                   , friendAry[i][1], friendAry[i][0]);
					break;

				}

			}

			System.out.println("-------------------------------------------------------------------");

			break;

		case 2:
			System.out.println("이름을 입력>>");
	    	String name = scn.nextLine();
	    	System.out.println("연락처를 입력>>");
	    	String phone = scn.nextLine();
	    	System.out.println("성별을 입력>>");
	    	String gender = scn.nextLine();
			
	    	//등록하기
	    	for (int i = 0; i <friendAry.length; i++) {
	    	   //빈값을 판단하기.
	    		if (friendAry[i][0] == null) {
	    		//	System.out.println("i의 값[" + i + "]=> " + friendAry[i]);
	    	    	friendAry[i]= new String[] {name, phone, gender};
	    			break;

	    		}
	    	
	    	}


		case 3: //조회(성별)
			System.out.print("조회할 성별 입력 > ex)남 or 여");
			gender = scn.nextLine();
			
			System.out.println("이름   연락처    성별");
			System.out.println("=================");
			for (int i = 0; i < friendAry.length; i++) {
				//값을 담고 있는 요소만 출력
			 if (friendAry[i][0] != null && friendAry[i][2].equals(gender)) {
				  System.out.printf("%s %s %s\n", friendAry[i][0]
				   , friendAry[i][1], friendAry[i][2]);
			
			 }
			}


			

		case 4:

			System.out.println("ㅡㅡ삭제ㅡㅡ");

			String _c = scn.nextLine();

			for (int i = 0; i < friendAry.length; i++) {

				if (friendAry[i] != null && _c.equals(friendAry[i][0].split(",")[0])) {

					System.out.println(friendAry[i]);

					System.out.println("정말로 삭제하시겠나요? (yes: 1/ no: 2)");

					String tmp = scn.nextLine();

					if (tmp.equals("1")) {

						friendAry[i] = null;

						break;

					} else if (tmp.equals("2")) {

						break;

					}

					friendAry[i][0].split(",")[2] = scn.nextLine();

				} else {

					System.out.println("존재하지 않습니다.");

					break;

				}

			}

			break;

		case 5:

			System.out.println("ㅡㅡ수정(이름)ㅡㅡ");

			String _d = scn.nextLine();

			for (int i = 0; i < friendAry.length; i++) {

				System.out.println(friendAry[i][0].split(",")[0]);

				if (friendAry[i] != null && _d.equals(friendAry[i][0].split(",")[0])) {

					System.out.println(friendAry[i]);

					System.out.println("연락처: ");

					friendAry[i][0] = friendAry[i][0].split(",")[0] + "," + friendAry[i][0].split(",")[1] + ","
							+ scn.nextLine();

					break;

				} else {

					System.out.println("존재하지 않습니다.");

					break;

				}

			}

			break;

		case 0:

			System.out.println("종료되었습니다.");

			_run = false;

			break;

		default:

			System.out.println("메뉴를 다시 선택하세요");

			break;

		}

	}

}

}
