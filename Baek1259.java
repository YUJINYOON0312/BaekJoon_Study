package baekjoon;

import java.util.Scanner;

public class Baek1259 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			int a=sc.nextInt();
		if(a==0) {
			break; //0이 입력되면 while문 탈출해서 종료
		}
		else {
			String A=Integer.toString(a); //문자열로 변환
			
			int b=0;
			int c=0;
			String temp="yes";
			
			for(int k=0; k<(A.length())/2; k++) {
				//문자열길이 절반만큼만 비교 할 것
				
				for(int i=k; i<=k; i++) {
					b=A.charAt(i); //첫번째부터
				}
				for(int j=A.length()-k; j<=A.length()-k; j++) {
					c=A.charAt(j-1); //마지막부터	
				}
				if(b==c && temp=="yes") {
					temp="yes";
				}else{temp="no";}
			}
			
			System.out.println(temp);
			}
		}
	}

}
