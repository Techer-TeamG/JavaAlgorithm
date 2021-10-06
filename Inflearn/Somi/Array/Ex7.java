import java.io.*;
import java.util.StringTokenizer;

public class Ex7 {
    public static int solution(int n, int[] arr){
        int score=0;
        int tmp=0;

        for(int i=0; i<n; i++){
            if(arr[i]==1){
                tmp++;
                score+=tmp;
            }
            else tmp=0;
        }

        return score;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, arr));
        }
}
