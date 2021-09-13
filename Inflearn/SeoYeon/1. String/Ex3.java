import java.util.*;


class Ex3 {
    public String solution(String str){
        String answer ="";
        int m=Integer.MIN_VALUE, pos; // 가장 작은 값으로 초기화
        while ((pos=str.indexOf(" "))!=-1){ //띄어쓰기가 처음으로 발견되는 index리턴
            String tmp=str.substring(0,pos);
            int len = tmp.length();
            if (len>m){ //같다라고 하면 뒷쪽에서 같은 단어를 답으로하게됨.!
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1); //앞에 단어 잘라내고 남은 것만 str로 새로 변경.
        }
        if(str.length()>m) answer=str; //마지막 단어 처리를 꼭 해줘야함.
        // for (String x : s){
        //     int len=x.length();
        //     if(len>m){
        //         m=len;
        //         answer=x;
        //     }
        // }
        return answer;
    }   
    public static void main(String [] args){
        Ex3 T= new Ex3();
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str)); 
    }

}
