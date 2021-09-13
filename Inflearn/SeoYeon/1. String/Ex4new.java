import java.util.*;

// 직접 뒤집기
public class Ex4new{
    public ArrayList<String> solution(int n, String [] str){
        ArrayList<String> answer= new ArrayList<>();
        // 직접 뒤집기
        for (String x : str){
            // string이 chart 배열로 만들어짐. 
            char []  s= x.toCharArray();
            int lt= 0, rt=x.length()-1;
            while(lt<rt){
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            // 다시 chararray=> string
            // String.valueof(s): static 메소드. class. 메소드라고 접근해도 됨.
            // valueOf: char array를 string 객체로 바꿔줌.
            String tmp= String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }
    public static void main(String [] args){
        Ex4 T= new Ex4();
        Scanner kb=new Scanner(System.in);
        int n= kb.nextInt();
        String [] str= new String[n];
        for (int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for (String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
    
}
