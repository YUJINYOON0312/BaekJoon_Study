package baekjoon;

import java.util.Scanner;

public class Baek4344 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		
		for(int i=0; i<c; i++) {
			int n=sc.nextInt();
			int[] num=new int[n];
			int sum=0;
			
			for(int j=0; j<n; j++) {
				num[j]=sc.nextInt();
				sum+=num[j];
			}
			double avg= sum/(double)n;
			double rate=0;
			int cnt=0;
			for(int k=0; k<n ;k++) {
				if(num[k]>avg) {
					cnt+=1;
				}
			}
			rate= (cnt/(double)n)*100;
			System.out.println(String.format("%.3f", rate)+"%"); 
		}
		
	}

}
