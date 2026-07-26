import java.util.*;


class Solution {
    public int solution(int[][] jobs) { // [도착시간, 소요시간]
        int count =0;
        int time =0;
        int answer =0;
        int jobsIdx=0;
        
        
        
        // 0. 도착 시간 순으로 정렬
        Arrays.sort(jobs, (o1, o2) -> o1[0]-o2[0]);
        
        // 0. 낮은 소요시간 우선순위 가진 큐 선언
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)->o1[1]-o2[1]);
        
        
        //0. cnt가 jobs.length이전까지 반복
        while(count<jobs.length){
            
        
            // 1. 현재시간보다 이전에 도착한 job들 우선순위 큐에 넣기, 우선순위 큐 처리(time갱신) 될 때마다 반복
            while(jobsIdx<jobs.length && jobs[jobsIdx][0]<=time){
                pq.add(jobs[jobsIdx++]);
            }
        
        
            // 2. 우선순위 큐에 job 존재한다면, 꺼내서 갱신 (현재시간, count, anwser)
            if(!pq.isEmpty()){
                int[] job = pq.poll();
                answer += time + job[1]-job[0];
                time+=job[1];
                count++;
            }
        
            // 3. 우선순위 큐에 job 존재 x, 다음 job(현재 jobsIdx)으로 갱신(현재시간 = 다음 job 도착시간)
            else{
                time=jobs[jobsIdx][0];
            }
        }
            
        return (int)Math.floor(answer/jobs.length);
    }
    
}