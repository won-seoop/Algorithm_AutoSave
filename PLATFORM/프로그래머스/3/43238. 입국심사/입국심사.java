import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long mid, left, right;
        Arrays.sort(times);

        left=0;
        right=(long)times[times.length-1]*n;

        
        while(left <= right){
            mid=(left+right)/2;
            long num=0;
            for(int i=0; i<times.length; i++){
                num+=mid/times[i];
            }
            
            if(num>=n){
                answer=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }        
        
        
        
        
        
        return answer;
        
    }
}