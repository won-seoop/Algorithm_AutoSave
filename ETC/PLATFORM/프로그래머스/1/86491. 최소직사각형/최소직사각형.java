import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        Integer[][] _sizes=new Integer[sizes.length][];
        
        for (int i=0; i<sizes.length; i++){
            _sizes[i] = new Integer[sizes[i].length];
            for (int j=0; j<sizes[i].length; j++){
            _sizes[i][j]=sizes[i][j];
            }
        }
        
                
        for (int i=0; i<sizes.length; i++){
            Arrays.sort(_sizes[i],(a,b)->b-a);
        }
        
        int max_raw=0;
        int max_col=0;
        
        for (int i=0; i<_sizes.length; i++){
            max_raw=Math.max(max_raw,_sizes[i][0]);
            max_col=Math.max(max_col,_sizes[i][1]);
        }
        
        return max_raw*max_col;
    }
}