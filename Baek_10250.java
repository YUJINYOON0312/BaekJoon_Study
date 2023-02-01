package study;

import java.util.Scanner;

public class Baek_10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int h = 0, w = 0 , n = 0;
		
		for(int i=0 ; i<a ; i++) {
			h= sc.nextInt();
			w= sc.nextInt();
			n= sc.nextInt();
		
			int A= (n % h)*100;
			int B= (n / h)+1;
			
			//String BB= String.format("%20d", B);
			
			if(n % h ==0) {
				A = h * 100;
				B = n / h; //01호
			}
			System.out.println(A+B);
		
		}

		sc.close();
	}

}
