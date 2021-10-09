import java.io.*;
import java.util.*;

public class Ex3 {
	
	public static String solution(int n, int[] A, int[] B) {
		String answer = "";
		
		for(int i=0; i<n; i++) {
			if(A[i] == B[i]) answer+="D";
			else if(A[i]==1 &&B[i]==3) answer+="A";
			else if(A[i]==2 && B[i]==1) answer+="A";
			else if(A[i]==3 && B[i]==2) answer+="A";
			else answer+="B";
		}
		
		return answer;
	}
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer stt = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(stt.nextToken());
		}
			
		
		for(char x : solution(N, A, B).toCharArray())
			System.out.println(x);
		
	}
}




