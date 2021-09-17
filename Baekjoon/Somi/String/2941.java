import java.util.*;
public class Main {
	public int solution(String str) {
		int answer =0;
		String[] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		for(String x : list) {
			if(str.contains(x)) {
				str = str.replaceAll(x, "*");
			}
		}
		answer = str.length();
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
