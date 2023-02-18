package baekjoon;

import java.util.Scanner;

public class Baek2609 {
	
	
	//최대공약수 최소공배수, 유클리드 호제법
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		int b=Math.min(A, B);
		int a=Math.max(A, B);
		
		System.out.println(gcd(a, b));
		System.out.println(a*b/gcd(a, b));
	}
	//재귀방식
	public static int gcd(int a, int b) {
		
		if(b==0)return a;

		return gcd(b, a%b);
	}
}
