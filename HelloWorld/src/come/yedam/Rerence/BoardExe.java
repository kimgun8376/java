package come.yedam.Rerence;

import java.util.Scanner;

/*
 * 
 * 실행 클래스.
 * 1. 글 목록 2. 글등록 3. 삭제 9.종료 
 *
 */

public class BoardExe {
	static Board[] boardRepo = new Board[100]; // 게시글 등록 배열.
	static Scanner scn = new Scanner(System.in); // Scanner 객체 선언
    static String loginId;	

	public static void initDate() throws ParseException {
		// 배열의 샘플데이터.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		// 1페이지 : 0~ 4, 2페이지 : 5 ~ 9
		boardRepo[0] = new Board("게시글제목1", "내용입니다1", "user01", sdf.parse("2025-01-20"));
		boardRepo[1] = new Board("게시글제목2", "내용입니다2", "user02", sdf.parse("2025-01-21"));
		boardRepo[2] = new Board("게시글제목3", "내용입니다3", "user03", sdf.parse("2025-01-22"));
		boardRepo[3] = new Board("게시글제목4", "내용입니다4", "user04", sdf.parse("2025-01-23"));
		boardRepo[4] = new Board("게시글제목5", "내용입니다5", "user05", sdf.parse("2025-01-24"));
		boardRepo[5] = new Board("게시글제목6", "내용입니다6", "user06", sdf.parse("2025-01-25"));
		boardRepo[6] = new Board("게시글제목7", "내용입니다7", "user07", sdf.parse("2025-01-26"));
		boardRepo[7] = new Board("게시글제목8", "내용입니다8", "user08", sdf.parse("2025-01-27"));
		boardRepo[8] = new Board("게시글제목9", "내용입니다9", "user09", sdf.parse("2025-01-28"));
		boardRepo[9] = new Board("게시글제목10", "내용입니다10", "user10", sdf.parse("2025-01-29"));
		boardRepo[10] = new Board("게시글제목11", "내용입니다11", "user11", sdf.parse("2025-01-31"));
		boardRepo[11] = new Board("게시글제목12", "내용입니다12", "user12", sdf.parse("2025-02-01"));
		boardRepo[12] = new Board("게시글제목13", "내용입니다13", "user13", sdf.parse("2025-02-05"));

	}

	public static void boardList() {
			// 글목록.
			
		// 1페이지 : 0~ 4, 2페이지 : 5~9, 3페이지 : 10 ~ 14
		 int page = 1; 
		 int lastPage = (int) Math.ceil(getMaxCount() / 5.0); // 13/5 => 2.6
		while (true) {	
			// 1page: 1~5, 2page: 6~10, 3page: 11~15......

		int endCnt = page * 5; // 5,10,15....
			int startCnt = endCnt - 5;// 0, 5, 10
			int loopCnt = 0; // 반복횟수 저장
			System.out.println(" 글 제목   내용               작성자    작성일시");
			System.out.println(" -----------------------------------------");
			for (int i = 0; i < boardRepo.length; i++) {
				if (boardRepo[i] != null) { // null이 아닌경우만 카운트.
					loopCnt++;
					if (loopCnt > startCnt && loopCnt <= endCnt) {
						System.out.println(loopCnt + " " + boardRepo[i].showBoard());
					}
				}
			} // end of for.

			// 5건씩 출력이 되도록.??

			System.out.println(" (이전페이지:p, 이후페이지:n, 종료 : q) ");
			String paging = scn.nextLine();
			if (paging.equals("n")) { // 이후페이지: n
				// 마지막페이지보다는 작은값.
				if (page < lastPage) {
					page++;
				} else {
					System.out.println("마지막페이지입니다.");
				}
			} else if (paging.equals("p")) { // 이전페이지:p
				// 1보다는 큰 페이지.
				if (page > 1) {
					page--;
				} else {
					System.out.println("첫페이지입니다.");
				}
			} else if (paging.equals("q")) { // 종료: q
				return;
			}
		} // end of while.
	} // end of boardList().
		// 배열을 매개값으로 전달하면 건수가 몇건 반환 메소드.

	public static int getMaxCount() {
		int count = 0; // 전체건수.
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null) {
				count++;
			}
		}
		return count; // 건수반환.
	}
	// 글등록.
// 제목 : 5글자 이상 ~ 15글자 이하. 콘솔출력("등록불가능합니다.");
	// 똑같은 글제목이 있으면 콘솔출력("이미 있는 제목입니다.");

	public static void addBoard() {
		System.out.print("제목을 입력>>");
		String title = scn.nextLine();
		System.out.print("내용을 입력>>");
		String content = scn.nextLine();
	//	System.out.print("작성자를 입력>>");
	//	String writer = scn.nextLine();
	//	System.out.print("작성일시를 입력>>");
	//	String writeDate = scn.nextLine();
		// 배열의 빈공간에 등록
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] == null) {
				boardRepo[i] = new Board(title, content, loginId, new Date());
				System.out.println("등록완료");
				break; // 한건만 등록
			}
		}
	} // end of addBoard();

	public static void removeBoard() {
		// 글삭제. 글제목을 입력 => 삭제는 null 대입하면 삭제.
		System.out.print("제목을 입력>>");
		String title = scn.nextLine();
         // 제목검색
		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null
					&& boardRepo[i].getTitle().equals(title)) {
				 boardRepo[i]= null; // 삭제 
				System.out.println("삭제완료");
				break; 
			}
			System.out.println("삭제완료");

		}
	} // end of removerBoard();

	public static void main(String[] args) {
		MemberExe exe = new MemberExe();

		while (true) {
			// id, password 일치하면 글목록기능 사용.
			System.out.print("아이디 입력>>");
			String id = scn.nextLine();
			System.out.print("비밀번호 입력>>");
			String pw = scn.nextLine();

			String name = exe.login(id, pw);
			if (name != null) {
				// 환영메시지 !! "홍길동님, 환영합니다."
				loginId = id; // 여러메소드 공용사용.
				System.out.println(name + "님, 환영합니다.");
				break; // while 반복 종료.
			} else {
				System.out.println("아이디와 비번을 확인하세요");
			}
		} // end of while.

		boolean run = true;
		try {
			initDate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 // 초기데이터 생성.

		while (run) {
			System.out.println("1.글목록 2.글등록 3.삭제 9.종료");
			System.out.print("선택>");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 목록
				boardList();
				break;
			case 2: // 등록.
				addBoard();
				break;
			case 3: // 삭제.
				removeBoard();
				break;
			case 9: // 종료.
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default: // 1,2,3,9, 외의 경우
				System.out.println("메뉴를 확인하세요.");
			}
		} // end of while.
		System.out.println("end of prog.");
	} // end of main.
}
