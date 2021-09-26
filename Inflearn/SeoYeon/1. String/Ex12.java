
// 12. 암호
// #은 이진수의 1, *은 이진수의 0
// 해당 2진수를 10진수화 함 -> 아스키 번호

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Ex12 {
    public static int num;
    public static String str;

    public String solution (){
        String answer="";
        for (int i=0; i<num; i++){
            String tmp=str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp, 2); //2진수를 10진수화 시킨다.
            answer += (char)num; //캐스팅하면 아스키넘버에 따라 문자로 바뀐다.
            str=str.substring(7);
        }
        return answer;
    }
    public static void main(String [] args) throws IOException {
        Ex12 T = new Ex12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num=Integer.parseInt(br.readLine());
        str=br.readLine();
        System.out.println(T.solution());

    }
}
