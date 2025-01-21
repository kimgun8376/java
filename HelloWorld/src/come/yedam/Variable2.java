package come.yedam;

public class Variable2 {
	public static void main(String[] args) { // 컨트롤 스페이스 
		for(int j=2; j<=7; j++) {
		     int num = j;
			for (int i =1; i <= 9; i++) {
			//System.out.println(num + "*" + i+  "="+ num*i+"\n");
			System.out.printf("%d *%d = %d\n", num,i, num*i); // `${num} * ${i} = ${num*i}`
		    }
		}
		System.out.println("end of prog");
	}
}