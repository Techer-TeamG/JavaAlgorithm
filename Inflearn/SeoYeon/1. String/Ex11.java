// 11. 문자열 압축

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;


public class Ex11 {
    public String solution(String str){
        String answer="";
        int cnt=1;
        for (int i=0; i<str.length()-1; i++){
            if (str.charAt(i)==str.charAt(i+1)){
                cnt++;
            }
            else{
                answer +=str.charAt(i);
                if(cnt!=1){
                    answer +=Integer.toString(cnt); //String.valueOf(cnt);
                }
                cnt=1;
            }
        }
        return answer;
    }
    public static void main(String [] args) throws IOException{
        Ex11 T = new Ex11();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine()+' ';
        System.out.println(T.solution(str));
    }
}

