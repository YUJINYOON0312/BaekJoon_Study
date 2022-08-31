import java.util.Scanner;

public class BackArray01 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    int min = 1000000;
		    int max = -1000000;
		    int n = sc.nextInt(); 
		    int[] num = new int[n]; 

		     for(int i=0; i<n; i++){ 
		         num[i] = sc.nextInt();
		         if(max<num[i]) {
		             max = num[i];  //입력값 차례대로 max에 저장 후 다음 입력값과 비교
		         }    
		         if(min>num[i]) {
		             min = num[i];
		         }        
		
	          }
		    System.out.println(min);	
			System.out.println(max);
	}
}
