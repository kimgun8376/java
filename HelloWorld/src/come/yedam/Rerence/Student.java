package come.yedam.Rerence;

public class Student {
   //필드 (속성) : 이름, 영어, 수학.
	String StudentName;
	int engScore;
	int mathScore;
    //생성자: 필드의 초기값을 지정해서 인스턴스 생성.
   Student() { // 기본생성자 : 매개값이 없는 생성자.	   
   }
   
   Student(String StudentName, int engScore) {
	   this.StudentName = StudentName;
	   this.engScore = engScore;
   }
   Student(String StudentName, int engScore, int mathScore) {
	   this.StudentName = StudentName;
	   this.engScore = engScore;
	   this.mathScore = mathScore;
   }
   
   
	//메소드(기능)
	void printInfo() {
		System.out.printf("이름은 %s, 영어점수 %d, 수학점수 %d\n" //
				,StudentName, engScore, mathScore);
				
	}
	// 기능추가 : 평균을 반환.
	double getAverage() {
	return(engScore + mathScore) / 2.0; // (88 + 89) / 2  
	}
}

