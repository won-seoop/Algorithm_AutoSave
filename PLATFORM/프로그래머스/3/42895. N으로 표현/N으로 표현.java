import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if (number == N) return 1;
        
        List<HashSet<Integer>> list= new ArrayList<>();
        
        for (int i=0; i<9; i++){
            list.add(new HashSet<Integer>());
        }
        
        list.get(1).add(N);
        
        for (int n=2; n<=8; n++){
            for (int i=1;i<n;i++){
                int j=n-i;
                
                for(int a : list.get(i)){
                    for(int b : list.get(j)){
                        list.get(n).add(a+b);
                        list.get(n).add(a-b);
                        list.get(n).add(a*b);
                        if(a!=0 && b!=0){
                            list.get(n).add(a/b);
                        }
                    }
                }
            }
            list.get(n).add(Integer.parseInt(String.valueOf(N).repeat(n)));
            
            if(list.get(n).contains(number)){
                return n;
            }
        }
        
        
        
        return -1;
    }
}