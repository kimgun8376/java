package come.yedam.Rerence;

public class StudentEXE {
	public static void main(String[] args) {
		Student[] students = new Student[5];

		Student std1 = new Student(); // 인스턴스 생성.
	   std1.StudentName = "홍길동";
		std1.engScore = 80;
		std1.mathScore = 85;

		Student std2 = new Student();
		std2.StudentName = "김민수";
		std2.engScore = 85;
		std2.mathScore = 88;
		
		Student std3 = new Student();
		std3.StudentName = "홍정학";
		std3.engScore = 75;
		std3.mathScore = 90;
		
		Student std4 = new Student();
		std4.StudentName = "김민지";
		std4.engScore = 88;
		std4.mathScore = 92;
		
				

		// 홍정학 75,90

		students[0] = std1;
		students[1] = std2;
		students[2] = std3;
	    students[3] = new Student("김민지", 88, 92);
       // students[3] = std4; 
 
       //학생의 이름을 입력받는 변수:studName
	   // 학생의 평균을 출력하는 프로그램을 작성.

	
	for (int i = 0; i < students.length; i++) {
	if (students[i] !=null // 
			&& students[i].StudentName.equals(studName)) {
		System.out.printf("학생의 평균은 %.2f입니다,\n"
				, students[i].getAverage());
	}
	
	}
	    
	    /*    for (int i = 0; i < students.length; i++) {
			if (students[i] != null  && students[i].getAverage() >=85) {
				students[i].printInfo(); // 학생 ~ 점 이상
			}
		} */

	}

}
