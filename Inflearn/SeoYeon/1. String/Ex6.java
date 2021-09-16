import java.util.*;

// input : ksekkset

class Ex6 {
    public String solution(String str){
        String answer="";
        for (int i=0; i<str.length(); i++){
            // indexOf: 여러개 있어도 가장 앞에 있는 문자를 return
            // System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)))
            if(str.indexOf(str.charAt(i)) == i){
                // 처음 나오는 문자일때만
                answer+=str.charAt(i);
            }
            
        }

        return answer;
    }
    
    public static void main(String [] args){
        Ex6 T= new Ex6();
        Scanner kb= new Scanner(System.in);
        String str= kb.next();
        System.out.print(T.solution(str));
    }
}
