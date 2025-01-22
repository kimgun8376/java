package come.yedam;

import java.util.Scanner;

/*
 * 친구정보관리 앱 v.1
 * 이름,연락처,성별(남/여)=> 홍길동, 010-1234-5678,남
 * 1.목록 (이름,연락처,성별) 2.등록 3.조회(성별) 4.삭제(이름)5.수정(이름):연락처를 수정 9.종료
 * String[] friendAry 크기는 100개;
 *  
 */
public class Todo2 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		String[] studentAry = new String[10];

		while (run) {
			System.out.println("1.목록(이름,연락처,성별 2.등록. 3조회(성별) 4.삭제(이름). 5수정(연락처 수정) 9.종료");
			System.out.print("선택하세요>");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				for (int i = 0; i < studentAry.length; i++) {
					System.out.print("이름과연락처,성별을 같이 입력하세요.");
					studentAry[i] = scn.nextLine();
				}
				break;

			case 2: //입
				System.out.print("정보입력> ex) 홍길동,010-1111-2222,남");
				
			case 3:
				System.out.println("성별을 입력하세요.");
				String search = scn.nextLine();
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i].split(" ")[2].equals(search)) {
                   Sysyem.out.printf()
					}

				}

			case 4:

			case 5:

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}

		}

	}

}
