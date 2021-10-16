package Array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ8958 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        for (int i=0 ;i<N ;i++){
            String str = br.readLine();
            System.out.println(solution(str));
        }

    }

    static int solution (String s){
        int answer =0;
        int pointer=0;
        for (int i=0 ;i <s.length() ;i++){
            if(s.charAt(i)=='O'){
                pointer++;
                answer+=pointer;
            }
            else{
                pointer=0;
            }
        }

        return answer;
    }
}