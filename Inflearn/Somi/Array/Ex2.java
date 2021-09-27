import java.io.*;
import java.util.*;

public class Main {
	
	public static int solution(int n, int[] arr) {
		int answer = 1;
		int max = arr[0];
		
		for(int i=1; i<n; i++) {
			if(arr[i]>max) {
				max = arr[i];
				answer++;
			}
		}
		
		return answer;
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[N];
		
		for(int i=0; i<N; i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(solution(N, num));
		
	}
}




