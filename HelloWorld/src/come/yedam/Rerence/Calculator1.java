package come.yedam.Rerence;

public class Calculator1 {
	// 1월달 출력.
	public void showCalendar() {

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri" };
		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println("\n====================");
		// 공백,말일 계산.
	}
}    
        
