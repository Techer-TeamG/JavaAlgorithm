// 보이는 학생
// N 명의 학생
// 일렬로 서있을 때, 제일 앞에서 봤을 때 보이는 학생이 몇명 있는가?
// 어떤 학생이 자기 앞에 서 있는 학생들보다 크면 그 학생은 보이고, 작거나 같으면 보이지 않는다.


import java.util.*;

public class Ex2 {
    public int solution(int[] arr){
        int answer=1;
        int max=arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i]> max){
                max=arr[i];
                answer++;
            }
        }
        return answer;
    }
    public static void main(String [] args){
        Ex2 T = new Ex2();
        Scanner kb= new Scanner(System.in);
        int n=kb.nextInt();
        int [] arr=new int [n];
        for (int i=0; i<n ; i++){
            arr[i]=kb.nextInt();
        };
        System.out.println(T.solution(arr));
    }
}
