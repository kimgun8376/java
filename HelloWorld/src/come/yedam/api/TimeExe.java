package come.yedam.api;

public class TimeExe {
	public static void main(String[] args) {
		// ?분 ?초 합은? 출력
		// 1부터 10000000000 까지 250의 배수의 합을 구하는.
		long sum = 0;
		long start, end = 0;
		start = System.currentTimeMillis();
		for (long i = 1; i <= 10000000000l; i++) {
			if (i % 250 == 0)
				sum += i;
		}
		end = System.currentTimeMillis();
		long jobTime = (end - start) / 1000;
		long min = jobTime / 60;
		long sec = jobTime % 60;
		System.out.printf("%d분 %초 합: %d\n", min, sec, sum);

		System.currentTimeMillis(); // 현재시간 long반환.
		long n = 2147483648L; // 범위초과시 L자 붙임

		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Long.MAX_VALUE); // 9223372036854775807

	}

	private static int jobTime(long l) {
		// TODO Auto-generated method stub
		return 0;
	}

	void test() {

	}

}
