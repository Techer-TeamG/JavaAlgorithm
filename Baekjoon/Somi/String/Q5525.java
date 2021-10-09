import java.io.*;

public class Q5525 {
	
	public static int solution(int n, int m, String s) {
		int answer = 0;
		String p = "";
		
		for(int i=0; i<n; i++) {
			p+="IO";
		}
		p+="I";
		
		for(int i=0; i<m; i++) {
			if(s.startsWith(p)) answer++;
			s=s.substring(1);
		}

		return answer;
	}
	
	
	public static int solution2(int n, int m, String s) {
		int answer=0;
		int cnt =0;
		
		char[] arr = s.toCharArray();
		for(int i=1; i<m-1; i++) {
			if(arr[i-1]=='I' && arr[i]=='O' && arr[i+1]=='I') {
				cnt++;
				if(cnt==n) {
					cnt--;
					answer++;
				}
				i++;
			}else cnt=0;
		}
		
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		System.out.println(solution2(N, M, S));
	}
}




