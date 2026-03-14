import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i=0; i<nums.length;i++){
            map.put(nums[i],1);
        }
        
        for (int i=0;i<nums.length/2;i++){
            if(!map.isEmpty()){
                Map.Entry<Integer,Integer> entry = map.entrySet().iterator().next();
                map.remove(entry.getKey(), entry.getValue());
                answer++;
            }
            else{
                break;
            }
        }
        
        
        
        
        
        return answer;
    }
}