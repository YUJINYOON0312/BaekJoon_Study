import java.util.Scanner;

public class BackSort_2750 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr= new int[N];
		int temp=0;
		
		
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
			
		for(int i=0; i<arr.length; i++) {	
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;			
				}
			}	
		}
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
	}	
	
}
