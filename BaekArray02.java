import java.util.Scanner;

public class BaekArray02 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int[] num = new int[9];
		int max = 0;
		int no = 0;
		for(int i=0; i<9 ; i++) {
			num[i] = sc.nextInt();
			if(max < num[i]) {
				max = num[i];
				no = i+1; // 0부터 시작하므로 순서는 +1
			}
		}
		
		System.out.println(max);
		System.out.println(no);
	}

}
