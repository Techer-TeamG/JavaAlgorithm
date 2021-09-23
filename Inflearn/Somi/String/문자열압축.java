import java.io.*;
import java.util.*;

public class Main {
	public static String solution(String str) {
		String answer = "";
		int count=1;
		
		for(int i=0; i<str.length()-1; i++) {
			char x = str.charAt(i);

			if(str.charAt(i+1)!=x) {
				answer+=x;
				if(count!=1) {
					answer+=count;
				}
				count = 1;
			}
			else count++;
		}
		
		answer+= str.charAt(str.length()-1);
		if(count!=1) answer+=count;
		
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.println(solution(str));
		
	}
}
