import java.util.*;

class Solution {
    
    boolean canChange(String w1, String w2){
        int cnt=0;

        for(int i=0; i<w1.length(); i++){
            if(w1.charAt(i) != w2.charAt(i)){
                cnt++;
            }
            if(cnt==2){
                return false;
            }
        }
        return true;
        
    }
    
    public int solution(String begin, String target, String[] words) {
        
        int answer = 0;
        
        if(!Arrays.asList(words).contains(target)){
            return 0;
        }
        
        Queue<Integer> que = new LinkedList<>();
        int[] dist = new int[words.length];
        
        
        // 큐에 미리 하나 넣어놓기 첫번째 후보군들
        for(int i=0; i<words.length; i++){
            if(canChange(words[i],begin)){
                dist[i]=1;
                que.add(i);
            }
        }
        
        
        while(!que.isEmpty()){
            int word_idx = que.poll();
            
            for(int i=0; i<words.length; i++){
                if(dist[i] == 0 && canChange(words[i],words[word_idx])){
                    que.add(i);
                    dist[i]=dist[word_idx]+1;
                    if(words[i].equals(target)){
                        return dist[i];
                    }
                    
                }
            }
            
        }
        
        
        
        
        return dist[Arrays.asList(words).indexOf(target)];
    }
}

/*


*/