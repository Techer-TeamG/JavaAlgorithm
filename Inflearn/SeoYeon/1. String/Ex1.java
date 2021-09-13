import java.util.*;

class Ex1 {
    public int solution (String str, char t){
        int answer=0;
        str=str.toUpperCase(); //string을 모두 대문자로
        t=Character.toUpperCase(t); //char을 모두 대문자로 

        // System.out.println(str+" "+t);
        // for (int i=0; i<str.length(); i++){
        //     if(str.charAt(i)==t) answer++;
        // }

        //toCharArray : 문자열을 문자 배열로 바꿔주는 메소드
        for (char x : str.toCharArray()){
            if (x==t) answer++;
        }
        return answer;
    }

    public static void main(String [] args){
        Ex1 T =new Ex1();
        Scanner kb= new Scanner(System.in);
        String str=kb.next(); //문자열 받아오는 것. 
        char c = kb.next().charAt(0); //문자 하나만 받아오는 것.

        System.out.print(T.solution(str,c));
    }
}