import java.io.*;
import java.util.*;

public class Q4358 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //TreeMap을 사용하면 바로 정렬
        HashMap<String, Integer> map = new HashMap<>(); 
        
        String word=br.readLine();
        double total=0;

        while(word!=null && word.length()!=0){
            map.put(word, map.getOrDefault(word, 0)+1);
            total++;
            word = br.readLine();
        } 

        Object[] keyArr = map.keySet().toArray();
        Arrays.sort(keyArr);

        for(int i=0; i<keyArr.length; i++){
            int value = map.get(keyArr[i]);
            double percent = (double)value / total * 100;
            bw.write(keyArr[i]+ " "+ String.format("%.4f", percent)+"\n");
        }

        bw.flush();
        bw.close();

	}
}
