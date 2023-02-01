import java.util.Scanner;

public class BaekArray_8958 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			int count=0; //주의: for문 안에서 초기화 하며 선언해줘야함
			int sum=0;   
			
			String correct = sc.next();
			
			for(int j=0; j<correct.length(); j++) {
				if(correct.charAt(j)== 'O') {
					count++;
					sum+=count;					
				}
				else{count=0;}

			}
			System.out.println(sum);
			
		}

	}

}
