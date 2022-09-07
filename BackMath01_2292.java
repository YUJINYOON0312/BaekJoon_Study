import java.util.Scanner;

public class BackMath01_2292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		for(int i=0; i<10000000 ; i++) {
		
			if(n <= 1+i*(3*(i+1))) {
				result = i+1;
				break; // break 위치는 if 조건을 만족하여 result 값이 확정되면 for문이 멈춰야 하므로
			}

		}
		System.out.println(result);

	}

}
