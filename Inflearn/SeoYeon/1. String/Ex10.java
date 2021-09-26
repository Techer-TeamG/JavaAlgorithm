// 10. 가장 짧은 문자거리
// 한 개의 문
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Ex10 {
    public static String str;
    public static char c;
    public static int p=1000;

    public int [] solution(){
        int [] answer = new int [str.length()];
        for (int i=0 ; i<str.length() ; i++){
            if (str.charAt(i) == c){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for (int i= str.length()-1; i>=0 ; i--){
            if (str.charAt(i)==c) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i],p); //더 작은값으로
            }
        }

        return answer;
    }
    public static void main(String [] args) throws IOException{
        Ex10 T = new Ex10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백으로 끊어 읽기
        str=st.nextToken();
        c= st.nextToken().charAt(0);

        for (int x : T.solution()){
            System.out.print(x+" ");
        }
    }
}
