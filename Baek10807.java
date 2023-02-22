package baekjoon;

import java.util.Scanner;

public class Baek10807 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] A= new int[n];
		
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
			
		}
		int v=sc.nextInt();
		int result=0;
		
		for(int i=0; i<n; i++) {
			if(A[i] == v) {	
				result +=1;
			}
		}
		System.out.println(result);
	}

}
