package come.yedam.Rerence;

import java.util.Scanner;

public class ReferenceEx3 {
     public static void main(String[] args) {
    	 exe();
     } //end of main.
    public static void exe() {
    	Scanner scn = new Scanner(System.in);    	//이름, 연락처, 성별 => 100개 공간.
    	String[][] firends = new String[100][3]; // 100개의 공간에도 3개의 정보를 담는다.
    	firends[0][0] = "홍길동";
    	firends[0][1] = "010-1111-2222";
    	firends[0][2] = "남";
    	firends[1]= new String[] {"김민수", "010-4564-4641", "남"};
        
    	System.out.println("이름을 입력>>");
    	String name = scn.nextLine();
    	System.out.println("연락처를 입력>>");
    	String phone = scn.nextLine();
    	System.out.println("성별을 입력>>");
    	String gender = scn.nextLine();
    	
    	firends[2][0] = name;
    	firends[2][1] = phone;
    	firends[2][2] = gender;
    	firends[2] = new String[] {name, phone, gender} ;
    	
//    	friends[5] = {null,null,null};
    	
    	for (int i = 0; i < firends.length; i++) {
    		if (firends[i] !=null) {
    			System.out.printf("이름은 %s, 연락처는 %s\n",firends[i][0], firends[i][1]);
    		}
    	}

     }


}
