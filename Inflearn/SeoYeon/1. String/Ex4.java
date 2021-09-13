import java.util.*;
class Ex4 {
    public ArrayList<String> solution(int n, String [] str){
        ArrayList<String> answer= new ArrayList<>();
        for (String x : str){
            // StringBuilder 객체를 만들고, reverse 해서 string으로 만들어서 tmp에 넣어줌.
            // String은 string끼리 더하거나, 수정이 안됨 (immutabel-새로운 객체가 생성됨)
            // StringBuilder 는 기존에 생성된 객체를 수정할 수 있음 (immutabel- 메모리 낭비가 없음)
            String tmp = new StringBuilder(x).reverse().toString();
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
