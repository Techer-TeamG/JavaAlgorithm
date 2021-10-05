import java.io.*;
import java.util.*;

public class Ex6 {
	public static boolean isPrime(int num) {
		if(num==1) return false;
		for(int i=2; i<num; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
	
	public static ArrayList<Integer> solution(String[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			String rev = new StringBuilder(arr[i]).reverse().toString();
			int tmp = Integer.parseInt(rev);
			if(isPrime(tmp)) answer.add(tmp);
		}
		
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] ch = new String[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N;i++)
			ch[i]=st.nextToken();
		
		for(int x: solution(ch))
			System.out.print(x+" ");
	}
}




