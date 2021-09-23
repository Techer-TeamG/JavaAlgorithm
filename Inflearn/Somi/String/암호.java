import java.io.*;
import java.util.*;

public class Main {
	public static char solution(String str) {
		int tmp=0, len = str.length();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c=='#') tmp += Math.pow(2, len-i-1);
		}
		
		char c = (char)tmp;
		return c;
	}
	
	public static char solution2(String str) {
		String tmp = str.replace('#', '1').replace('*','0');
		int num = Integer.parseInt(tmp, 2);
		return (char)num;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		for(int i=0; i<str.length();i+=7) {
			System.out.print(solution2(str.substring(i, i+7)));
		}
		
	}
}
