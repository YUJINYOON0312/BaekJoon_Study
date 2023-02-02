import java.util.Scanner;

public class BaekMath01_1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = 0; 

		if(C-B<=0) {	
			result = -1;
			System.out.println(result);
		}
		else {
			result = A/(C-B);	//손익분기점시 개수
			System.out.println(result+1);
		}
		
	}

}
