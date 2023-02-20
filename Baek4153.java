package baekjoon;

import java.util.Scanner;

public class Baek4153 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int temp=0;
			
			if(a==0 && b==0 && c==0) {
				break;
			}
			//abc 입력 순서에 상관없이 직각삼각형임을 밝혀야함
			if(a>b && a>c) {
				temp=a;
				a=c;
				c=temp;
			}
			if(b>a && b>c) {
				temp=b;
				b=c;
				c=temp;
			}
			
			if((a*a)+(b*b)== (c*c)) {
				System.out.println("right");
			}else System.out.println("wrong");
		}
		
	}

}
