// 09. 숫자만 추출
// char x >=48 && x <=57 : 문자 '0': 48 ~문자'9': 57 (문자형 숫자)
// answer= answer *10 + (x-48)

import java.util.*;

class Ex9{
    public int solution(String str){
        int answer=0;
        //for (char x : s.toCharArray())
        for (int i=0; i<str.length() ; i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                answer=answer * 10 + (str.charAt(i)-48);
            }
        }
        return answer;
    }
    public static void main(String [] args){
        Ex9 T= new Ex9();
        Scanner kb= new Scanner (System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}