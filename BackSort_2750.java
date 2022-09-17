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
					temp =arr[i]; // 현재순서 숫자가 다음순서 숫자보다 크면 현재숫자를 임시로 담아둠
					arr[i]=arr[j]; // 현재순서 숫자를 다음순서에 저장
					arr[j]=temp;/ // 다음순서는 임시공간에 저장 따라서 오름차순으로 정렬됨		
				}
			}	
		}
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
	}	
	
}
