import java.util.Scanner;

public class BackMath02_1978 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		
	
		for(int i=0; i<n; i++){
	
		    int num = sc.nextInt(); 
		    
		    for(int j=2; j<=num; j++){// 2부터 num까지 나눔
		        
		    	if(j==num) { // 만약 j하고 num이 같으면 자기 자신까지 온 거니까 cnt++
		            cnt++; // j가 num하고 같지 않으면 밑으로 내려감
		        }
		        
		        if(num%j==0){// 만약 num을 j나눈 나머지가 0이되면 빠져 나옴
		            break;
		        }
		    }
		}
		System.out.println(cnt);
	}
	
	
}	
