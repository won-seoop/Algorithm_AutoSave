class Solution {
    static int goal_dep;
    static int goal_target;
    static int ans;
   
    void dfs(int[] numbers, int idx, int dep, int sum){
        if(dep==goal_dep){
            if(sum==goal_target){
                ans++;
            }
            return;
            
        }
        
        dfs(numbers, idx+1, dep+1, sum+numbers[idx]);
        dfs(numbers, idx+1, dep+1, sum-numbers[idx]);
            
        
    }
   
    public int solution(int[] numbers, int target) {
        goal_dep = numbers.length;
        goal_target = target;
        dfs(numbers, 0, 0, 0);
        return ans;
    }
}