import java.util.Scanner;

public class BackArray02 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int[] num = new int[9];
		int max = 0;
		int no = 0;
		for(int i=0; i<9 ; i++) {
			num[i] = sc.nextInt();
			if(max < num[i]) {
				max = num[i];
				no = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(no);
	}

}
