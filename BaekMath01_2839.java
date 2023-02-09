import java.util.Scanner;

public class BackMath01_2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		
		while(N%5!=0) {		
			N-=3;
			a++;
		}
		if(N<0) {
			System.out.println(-1); // 아무리 3을 빼도 5로 나눠지지 않아서 결국 음수가 될 때
		}
		
		else{
			System.out.println(N/5+a);
			}
		
	}
	
}
