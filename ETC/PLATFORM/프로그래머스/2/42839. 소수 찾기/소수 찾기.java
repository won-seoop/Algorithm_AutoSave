import java.util.*;
class Solution {
    static Set<Integer> set;
    static boolean[] vst;
    
    void dfs(String numbers, String s, int dep) {
        if(dep==numbers.length()){
            return;
        }
        
        for (int i=0; i<numbers.length(); i++){
            if(!vst[i]){
                vst[i]=true;
                
                //여기서 그냥 넣어버림 set에 한자리 수라도
                set.add(Integer.valueOf(s+numbers.charAt(i)));
                dfs(numbers,s+numbers.charAt(i),dep+1);
                vst[i]=false;
            }
        }
    }
    
    
    boolean isPrime(int n){
        
        if (n<=1){
            return false;
        }
        for (int i=2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    
    
    public int  solution(String numbers) {
        int answer = 0;
        set=new HashSet<>();
        vst=new boolean[numbers.length()];
        int cnt=0;
        
        dfs(numbers, "",0);
        
        List<Integer> list = new ArrayList<>(set);
        
        for (Integer i : list){
            if(isPrime(i)){
                cnt++;
            }
        }
        
        
        return cnt;
        
        
    }

}
