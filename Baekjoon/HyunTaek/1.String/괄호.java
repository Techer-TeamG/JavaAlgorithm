import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(solution(input.next()));
        }
    }

    public static String solution (String s){
        Stack <Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }
        if( stack.empty()) {
            return "YES";
        } else {
            return "NO" ;
        }
    }

}
