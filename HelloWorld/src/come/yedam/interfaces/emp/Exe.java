package come.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

import come.yedam.inheritance.ComFriend;
import come.yedam.inheritance.Friend;
import come.yedam.Rerence.Student;

/*
 * String[] strAry;
 * Collection 1) List 2) Set 3) Map 
 */
public class Exe {
	public static void main(String[] args) {
		System.out.println("홍길동".indexOf("길동")); //-1보다 큰값.
		
		
		// 학생정보를 저장하는 컬렉션(ArrayList) 선언.
		// 3명 추가.
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("홍길동", 80, 83));
		students.add(new Student("김민수", 84, 87));
		students.add(new Student("박성용", 79, 91));

		// 출력. 이름만 출력하기.
		for (int i = 0; i < students.size(); i++) {
			System.out.println("이름: " + students.get(i).getStudentName());
		}

	}

	void method() {
		String[] strAry = new String[10]; // 배열.
		List<String> strList = new ArrayList<String>(); // 컬렉션.
		List<Friend> friends = new ArrayList<Friend>(); //

		friends.add(new Friend("홍길동", "010-111"));
		friends.add(new ComFriend("김길동", "010-2222", "국민은행", "신용보증팀"));

		friends.remove(new Friend("홍길동", "010-111"));
		System.out.println("friends크기: " + friends.size());

		System.out.println(friends.get(1).getFriendName());

		// 추가.
		strList.add("안녕하세요");
		strList.add("Hello");
		strList.add("반갑습니다");
		System.out.println("strList크기: " + strList.size());

		// 삭제.
//		strList.remove(0);
//		strList.remove("Hello");
		System.out.println("strList크기: " + strList.size());

		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
}
