package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Baek2751 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);//오름차순 정렬
		
		for(int i=0;i<arr.length; i++) {
			
			bw.write(arr[i]+"\n");
		}
		bw.flush();
		bw.close();
		
	}

}
