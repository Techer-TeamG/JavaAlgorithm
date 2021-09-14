import java.util.*;
public class Main {
	public String solution(String str) {
		String answer ="YES";
		str = str.toLowerCase();
		int len = str.length();
		for (int i=0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-1-i)) {
				answer = "NO";
				return answer;
			}
		}
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}

}
