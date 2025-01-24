package come.yedam.Rerence;

public class Calculator1 {
	// 1월달 출력.
	public void showCalendar() {
        int space = 3;
        int lastDate = 31;
        String[] dateAry = new String[spaces.];
		//배열에 값 채우기
        for(int i = 0; i < dateAry.length; i++);
        if (i < spaces) {
        	dateAry[i] = "";    	
        } else {
        	dateAry[i] = "" + (i + 1 - spaces);
        }
		
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri" };
		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println("\n====================");
		// 공백,말일 계산.
	}
}    
        
