import java.util.Scanner;

class Main {
	public int solution(int n, int m, int[] arr){
		int answer = 0;
		
		int lt = 0;
		int sum = 0;
		
		for(int rt=0; rt<n; rt++) {
			sum = sum + arr[rt];
			if(sum == m) answer++;
			while(sum >= m) {
				sum = sum - arr[lt++];
				if(sum == m ) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, m, arr));
	}
}