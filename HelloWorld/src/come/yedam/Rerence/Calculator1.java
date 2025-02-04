package come.yedam.Rerence;

public class Calculator1 {
    // 1월달 출력.
    public void showCalendar() {
        int space = 3;  // 첫 번째 날짜가 시작되는 위치(예: 3번째 칸부터)
        int lastDate = 31;  // 1월의 마지막 날짜
        String[] dateAry = new String[lastDate + space];  // 공간을 포함한 날짜 배열 크기 설정

        // 배열에 값 채우기
        for (int i = 0; i < dateAry.length; i++) {
            if (i < space) {
                dateAry[i] = "";  // 첫 번째 칸은 공백
            } else {
                dateAry[i] = "" + (i - space + 1);  // 날짜 배열 채우기
            }
        }

        String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };  // 7일로 수정

        // 요일 출력
        for (String day : days) {
            System.out.printf("%4s", day);
        }
        System.out.println("\n====================");

        // 날짜 출력
        for (int i = 0; i < dateAry.length; i++) {
            if (i % 7 == 0 && i != 0) {
                System.out.println();  // 한 줄이 끝나면 줄 바꿈
            }
            System.out.printf("%4s", dateAry[i]);  // 날짜 출력
        }
        System.out.println();  // 마지막 줄바꿈
    }
}