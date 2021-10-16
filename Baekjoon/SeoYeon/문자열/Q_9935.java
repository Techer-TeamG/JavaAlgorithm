import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


// 1. 한번 순회하면서 비교 문자열을 지우는 작업 -> O(MN) 의 시간 복잡도를 가짐
// 2. 하지만, 어디서 폭말 문자열이 만들어졌는지, 한번만으로는 확인할 수 없기 때문에 계속 O(MN)을 수도 없이 반복해야함.
// 3. 따라서 문자열을 순회하면서 비교 문자열과 바로바로 비교 하는 작업을 병행해야 한다.


public class Q_9935 {
    static String origin;
    static String bomb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        origin = br.readLine();
        bomb = br.readLine();
        
        int oriLen = origin.length();
        int bombLen = bomb.length();
        StringBuilder sb = new StringBuilder(); // StringBUilder : mutable 한 문자열 구조체 생성
        
        for(int i = 0; i < oriLen; i++) {
            char c = origin.charAt(i);
            sb.append(c);
            // 1. sb의 길이가 폭발 문자열과 비교할 만큼의 길이가 되면
            if(sb.length() >= bombLen) {
            // 2. 폭발 문자열과 서브 문자열이 같은지 검사
                boolean isSame = true;
                for(int idx = 0; idx < bombLen; idx++) {
                    char c1 = sb.charAt(sb.length() - bombLen + idx);
                    char c2 = bomb.charAt(idx);
                    if(c1 != c2) {
                        isSame = false;
                        break;
                    }
                }
             // 3. sb 에서 폭발 문자열 만큼을 지운다.
                if(isSame) {
                    sb.delete(sb.length() - bomb.length(), sb.length());
                }
            }
        }
        if(sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb.toString()); //StringBuilder -> String 으로 바꿔서 출력
        }
    }
}