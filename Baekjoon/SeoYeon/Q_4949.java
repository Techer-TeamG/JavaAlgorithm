package JavaAlgorithm.Baekjoon.SeoYeon;
// 백준 https://www.acmicpc.net/problem/4949


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_4949{
    public static String solution(String str){

        Stack<Character> stack=new Stack<>();

        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            // 여는 괄호일 경우 스택에 PUSH
            if(c=='(' || c=='['){
                stack.push(c);
            }

            //닫는 괄호  ) ,]
            else if (c==')'){
                // 스택이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우
                if(stack.empty() || stack.peek()!='('){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }
            else if(c==']'){
                //스택이 비어있거나 pop 할 원소가 대괄호랑 매칭이 안되는 경우
                if(stack.empty() || stack.peek() !='['){
                    return "no";
                }
                else{
                    stack.pop();
                }
            }

            // 그 외의 경우에는 불필요한 문자들이기에 skip 한다.

        }
        // 스택에 모든 괄호들이 매칭되어 꺼내졌기 때문,
        if (stack.empty()){
            return "yes";
        }
        else{
            return "no";
        }

    }
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        String s;

        while (true){
            s=br.readLine();

            if(s.equals(".")){
                break; // 종료 조건문
            }

            sb.append(solution(s)).append('\n');

        }
        System.out.println(sb);
        
    }
}
