import java.util.*;


class Solution {
    static int res;
    static int real_res;
    
    static String res_word="";
    static char[] arr = {'A','E','I','O','U'};
    void dfs(String word, int dep){
        res++;
        
        if(word.equals(res_word)){
            real_res=res;
            return;
        }
        if(dep==5){
            return;
        }
        
        for (int i=0; i<arr.length; i++){
            
            dfs(word+arr[i], dep+1);
        }
        
    }
    public int solution(String word) {
        int answer = 0;

        res_word=word;
        dfs("",0);
        return real_res-1;
    }
}