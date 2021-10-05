import java.io.*;

public class Ex4 {
	
	public static int[] solution(int n) {
		int[] answer = new int[n];
		
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i=2; i<n; i++)
			answer[i] = answer[i-2]+answer[i-1];
		
		return answer;
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int x : solution(N))
			System.out.print(x+" ");
		
	}
}




