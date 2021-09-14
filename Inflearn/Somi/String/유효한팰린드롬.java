import java.util.*;
public class Main {
	public String solution(String str) {
		String answer ="YES";
		String tmp = "";
		for(char x : str.toLowerCase().toCharArray())
			if(x>= 'a' && x<= 'z') tmp+=x;
		int len = tmp.length();
		for (int i=0; i<len/2; i++) {
			if(tmp.charAt(i)!=tmp.charAt(len-1-i)) {
				answer = "NO";
				return answer;
			}
		}
		return answer;
	}
	
	//Á¤±Ô½Ä
	public String solution2(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer="YES";
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}

}
