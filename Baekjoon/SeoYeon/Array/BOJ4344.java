package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class BOJ4344 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N= Integer.parseInt(br.readLine());
        int [] arr;

        for (int i=0 ;i<N; i++){
            st = new StringTokenizer(br.readLine()," ");    // 학생 수  및 성적 입력 (공백으로 끊어 읽기)
            int num= Integer.parseInt(st.nextToken());      // 학생 수
            arr=new int[num];   
            double sum=0;                                   // 성적 누적 합 변수

            for ( int j=0 ; j<num; j++){
                int val= Integer.parseInt(st.nextToken());  // 성적 저장
                arr[j]=val;                                 
                sum+=val;                                   // 성적 누적 합
            }
            double mean = (sum / num);
            double count = 0 ;                              // 평균 넘는 학생 수 변수

            for (int j=0 ;j< num; j++){
                if(arr[j]>mean){
                    count++;
                }
            }
            // 출력 포맷터 사용 (%f : float 형식으로 출력, %.3f%->소수점 셋째짜리까지 출력해라)
            System.out.printf("%.3f%%\n",(count/num)*100);
        }

    }
 
    
}
