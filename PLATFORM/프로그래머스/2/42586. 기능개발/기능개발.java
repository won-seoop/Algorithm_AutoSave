import java.util.*;

class Solution {
    //public  int[] solution(int[] progresses, int[] speeds) {  //ArrayList<Integer>
    public  ArrayList<Integer> solution(int[] progresses, int[] speeds) {  
        
        int[] days= new int[progresses.length];
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 1. days 구하기
        for (int i=0; i<days.length; i++){
            int day= (100 - progresses[i]) / speeds[i];
            
            if ((100 - progresses[i]) % speeds[i] !=0){
                day++;
            }
            days[i]=day;
        }
        
        // 2.첫번째 작업을 넣는다.
        que.add(days[0]);
        
        
        for (int i=1;i<days.length; i++){
            int front = que.peek();
            int v = days[i];
            
            // 3. 큐의 맨 앞값보다 현재 값이 큰 경우
            
            if (front < v){
                int cnt =0;
                while (!que.isEmpty()){
                    que.poll();
                    cnt++;
                }
                answer.add(cnt);
            }
            que.add(days[i]);
        }
        
        
        // 4. 큐의 맨 앞값보다 현재 값이 작거나 같은 경우
               
        // 5. 마지막에 큐 비우기
        int cnt=0;
        while(!que.isEmpty()){
            que.poll();
            cnt++;
        }
        
        if (cnt !=0){
            answer.add(cnt);
        } 
        
        
        return answer;
        //return days;
    }
}