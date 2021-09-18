
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1764 {
    public static int N,M;
    public static HashSet<String> hs= new HashSet<String>(); //듣도못한 이름 집어넣을 hasset(집합)
    public static ArrayList<String> ans=new ArrayList<String>(); //정답 넣을 Arraylist

    public static void main(String [] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백으로 끊어 읽기
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        for (int i=0;i<N;i++){
            hs.add(br.readLine());
        }
        for (int i=0; i<M;i++){
            String s=br.readLine();
            if(hs.contains(s)){
                ans.add(s);
            }
        }
        Collections.sort(ans);
        System.out.println(ans.size());
        for (int i=0 ;i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
