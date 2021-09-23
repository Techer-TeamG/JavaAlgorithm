import java.io.*;
import java.util.*;
public class Main {
	public static int solution(String str) {
		String s = "";
		for(int i =0 ;i <str.length(); i++) {
			char x = str.charAt(i);
			if(x>='0'&&x<='9') s+=x;
		}
		int answer = Integer.parseInt(s);
	
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.println(solution(str));
	
	}
}
