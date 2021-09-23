import java.io.*;
import java.util.*;

public class Main {
	public static int[] solution(String str, char c) {
		int[] answer = new int[str.length()];
		int p = 1000;
		
		for(int i=0; i<str.length(); i++) {
			char x = str.charAt(i);
			if(x==c) {
				p=0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
		}
		p=1000;
		for(int i=str.length()-1; i>=0; i--) {
			char x = str.charAt(i);
			if(x == c) p=0;
			else {
				p++;
				answer[i] = Math.min(p, answer[i]);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String str = st.nextToken();
		char c = st.nextToken().charAt(0);
		for(int x : solution(str, c))
			System.out.print(x+" ");
	}
}
