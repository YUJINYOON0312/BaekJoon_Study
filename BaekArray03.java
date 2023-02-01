import java.util.Scanner;

public class BaekArray03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int count = 0;
		
		for(int i=0; i<10; i++) { 
			num[i] = sc.nextInt()%42;
		}		
			
			for(int i=0; i<10; i++) { //10개 중복된 값 확인
				int tmp = 0;
				for(int j=i+1; j<10; j++) { //i와 i+1을 비교, 같으면 tmp 증가
					if(num[i]==num[j]) {
						tmp++;
					}
				}
				if(tmp==0) { //i와 i+1이 같지 않으면 count를 더해준다.
					count++;
				}
				
			}	
			System.out.println(count);
		}

	}


