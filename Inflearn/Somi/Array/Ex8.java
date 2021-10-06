import java.io.*;
import java.util.*;

public class Ex8 {
    public static int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        int cnt=1;

        for(int i=0; i<n; i++){
            cnt = 1;
            for(int j=0; j<n; j++){
                if(arr[i]<arr[j]) cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for(int x: solution(N, arr)){
            System.out.print(x+" ");
        }

    }
}
