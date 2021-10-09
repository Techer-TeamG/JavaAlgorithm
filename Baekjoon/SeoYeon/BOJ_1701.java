import java.io.*;

public class BOJ_1701 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = str.length(), max = 0;
        // 입력받은 문자열에서 하나씩 줄여가며, 가장큰 부분문자열의 길이 구하기.
		for(int i = 0; i < n; i++) {
			max = Math.max(max, getMax(str.substring(i, n)));
		}
		System.out.println(max);
	}

	// 문자열 s에서 최대 부분 문자열의 길이를 출력하는 문제
	static int getMax(String s) {
		int j = 0, n = s.length(), max = 0;
		int pi[] = new int[n];
		for(int i = 1; i < n; i++) {
			// 부분 문자열 찾기를 실패했을 때, 이전에 성공했던 지점으로 돌아가기.
			while(j > 0 && s.charAt(i) != s.charAt(j)) j = pi[j-1];
			if(s.charAt(i) == s.charAt(j)) max = Math.max(max, pi[i] = ++j);
		}
		return max;
	}
}