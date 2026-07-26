import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int cnt =0;
        int left=0;
        int right = people.length-1;
        Arrays.sort(people);
        
        while(left<right){
            if(people[left]+people[right]<=limit){
                left++;
                right--;
                cnt++;
            }
            else{
                right--;
            }
        }
            
            
        
        return people.length - cnt;
    }
}