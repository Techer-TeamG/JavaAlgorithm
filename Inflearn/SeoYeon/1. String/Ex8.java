// 07 . 팰린드롬
// 알파벳만 가지고 검사
// 앞, 뒤 똑같은 문자열
// 알파벳만 남기고 -> stringbuilder reverse해서 검사

import java.util.*;

class Ex8 {
    public String solution(String str){
        String answer="NO";
        //replaceALl()에는 정규식을 쓸수있다.
        //알파벳 A-Z가 아니면, ""
        str=str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            answer="YES";
            return answer;
        }

        return answer;
    }
    public static void main(String [] args){
        Ex8 T= new Ex8();
        Scanner kb= new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
    
}
