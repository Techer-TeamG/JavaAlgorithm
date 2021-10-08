import java.io.*;
import java.util.*;

public class Q11656 {
	public static String[] solution(String str) {
		String[] answer = new String[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			answer[i] = str.substring(i);
		}
		
		Arrays.sort(answer);
		
		return answer;
	}

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for(String x : solution(str)) {
			System.out.println(x);
		}
	}
}
