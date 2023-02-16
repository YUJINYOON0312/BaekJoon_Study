package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//입력
		int t = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < t; i++) {
			
			StringTokenizer st=new StringTokenizer(bf.readLine()); //입력
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int ans = A+B;

			bw.write(ans+"\n");
		}
		bf.close();
		
		bw.flush();
		bw.close();

	}

}
