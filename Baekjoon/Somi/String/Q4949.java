import java.io.*;
import java.util.*;
public class Q4949 {
	public static String solution(String str) {
		Stack<Character> stack = new Stack<>();
	
		for(int i =0 ;i <str.length(); i++) {
			char x = str.charAt(i);
			
			if(x=='(' || x=='[') stack.push(x);
			else if(x==')') {
				if(stack.empty() || stack.pop()!='(') return "no";
			}
			else if(x==']') {
				if(stack.empty() || stack.pop()!='[') return "no";
			}
		}
	
		if(stack.empty()) return "yes";
		else return "no";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) break;
			System.out.println(solution(str));
		}
	}

}
