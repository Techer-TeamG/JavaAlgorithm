// 07. 회문문자열
// 앞에서 읽을 때나, 뒤에서 읽을 때나 같은 문자열
// 대소문자를 구분하지 않는다.
// input : gooG / output: YES
// i<len/2 까지만 돌면 됨 ex) 문자열 길이 : 5-> 2번만 돌면된다.
// .equals(): 대소문자를 구분한다.
// .equalsIgnoreCase: 대소문자를 구분하지 않는다.

import java.util.*;


class Ex7 {
    public String solution(String str){
        String answer="YES";

        /* 방법 1 */
        String tmp= new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)){
            answer="NO";
            return answer;
        }
        /* 방법 2*/
        // str=str.toUpperCase();
        // int len=str.length();
        // for (int i=0; i<len/2; i++){
        //     if(str.charAt(i) != str.charAt(len-i-1)){
        //         answer="NO";
        //         return answer;
        //     }
        // }
        return answer;
    }

    public static void main(String [] args){
        Ex7 T = new Ex7();
        Scanner kb= new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }
    
}
