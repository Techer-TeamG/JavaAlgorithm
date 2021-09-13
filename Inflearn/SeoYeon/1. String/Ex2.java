import java.util.*;

class Ex2 {
    public String solution (String str){
        String answer="";
        for (char x : str.toCharArray()){
            // if(Character.isLowerCase(x)){
            //     answer+=Character.toUpperCase(x);
            // }
            // else{
            //     answer+=Character.toLowerCase(x);
            // }
            // 아스키넘버로 할 경우?
            // A 65~90 : 대문자
            // a 97~122: 소문자
            // 소문자에서 -32 => 대문자가 된다.
            if(x>=97 && x<=122) answer+=(char)(x-32);
            else answer += (char)(x+32); 
        }
        return answer;
    }

    public static void main(String [] args){
        Ex2 T = new Ex2();
        Scanner kb= new Scanner(System.in);
        String str=kb.next();
        System.out.print(T.solution(str));
    }
}