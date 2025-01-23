package come.yedam;

import java.util.Scanner;

/*

친구 정보 관리 앱 v1

이름, 연락처, 성별(남/여) => 홍길동, 010-1234-1234, 남

1.목록(이름,연락처,성별) 2.등록 4. 조회(성별) 5.삭제 6.수정(이름): 연락처 수정 0.종료

String[] friendAry 크기는 100개;

*/

public class Todo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] friendAry = new String[100];

		boolean _run = true;

		while (_run) {

			System.out.println("-------------------------------------------------------------------");

			System.out.println("1.목록(이름,연락처,성별) 2.등록 3. 조회(성별) 4.삭제 5.수정(이름): 연락처 수정 0.종료");

			System.out.println("-------------------------------------------------------------------");

			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {

			case 1:

				System.out.println("이름\t연락처\t성별");

				System.out.println("-------------------------------------------------------------------");

				for (int i = 0; i < friendAry.length; i++) {

					if (friendAry[i] != null) {

						System.out.println(friendAry[i]);

					}

				}

				System.out.println("-------------------------------------------------------------------");

				break;

			case 2:

				System.out.println("ㅡㅡ등록ㅡㅡ");

				String _a = sc.nextLine();

				for (int i = 0; i < friendAry.length; i++) {

					if (friendAry[i] == null) {

						friendAry[i] = _a;

						break;

					}

				}

				break;

			case 3:

				System.out.println("ㅡㅡ조회ㅡㅡ");

				String _b = sc.nextLine();

				System.out.println("-------------------------------------------------------------------");

				for (int i = 0; i < friendAry.length; i++) {

					if (friendAry[i] != null && (_b.equals(friendAry[i].split(",")[2]))) {

						System.out.println(friendAry[i]);

						break;

					} else {

						System.out.println("존재하지 않습니다.");

						break;

					}

				}

				System.out.println("-------------------------------------------------------------------");

				break;

			case 4:

				System.out.println("ㅡㅡ삭제ㅡㅡ");

				String _c = sc.nextLine();

				for (int i = 0; i < friendAry.length; i++) {

					if (friendAry[i] != null && _c.equals(friendAry[i].split(",")[0])) {

						System.out.println(friendAry[i]);

						System.out.println("정말로 삭제하시겠나요? (yes: 1/ no: 2)");

						String tmp = sc.nextLine();

						if (tmp.equals("1")) {

							friendAry[i] = null;

							break;

						} else if (tmp.equals("2")) {

							break;

						}

						friendAry[i].split(",")[2] = sc.nextLine();

					} else {

						System.out.println("존재하지 않습니다.");

						break;

					}

				}

				break;

			case 5:

				System.out.println("ㅡㅡ수정(이름)ㅡㅡ");

				String _d = sc.nextLine();

				for (int i = 0; i < friendAry.length; i++) {

					System.out.println(friendAry[i].split(",")[0]);

					if (friendAry[i] != null && _d.equals(friendAry[i].split(",")[0])) {

						System.out.println(friendAry[i]);

						System.out.println("연락처: ");

						friendAry[i] = friendAry[i].split(",")[0] + "," + friendAry[i].split(",")[1] + ","
								+ sc.nextLine();

						break;

					} else {

						System.out.println("존재하지 않습니다.");

						break;

					}

				}

				break;

			case 0:

				System.out.println("종료되었습ㅇ니다.");

				_run = false;

				break;

			default:

				System.out.println("메뉴를 다시 선택하세요");

				break;

			}

		}

	}

}
