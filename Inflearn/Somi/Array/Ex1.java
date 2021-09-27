import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[N];
		
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		bw.write(Integer.toString(num[0])+" ");
		for(int i=1; i<N; i++) {
			if(num[i]>num[i-1]) bw.write(Integer.toString(num[i])+" ");
		}
		
		bw.flush();
		bw.close();
		
	}
}




