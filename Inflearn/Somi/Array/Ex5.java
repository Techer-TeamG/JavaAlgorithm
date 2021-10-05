import java.io.*;
import java.util.*;

public class Main {
	
	public static int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n; j+=i) ch[j]=1;  //배수를 모두 1로 check
			}
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(solution(N));
	}
}




