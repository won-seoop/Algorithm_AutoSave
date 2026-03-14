import java.util.*;


class Solution {
    public long solution(int n, int[][] edge) {
        int[] dist = new int[n+1];
        boolean[][] graph = new boolean[n+1][n+1];
        Queue<Integer> que = new LinkedList<>();
        int dep=0;
        
        for (int[] e : edge){
            graph[e[0]][e[1]]=true;
            graph[e[1]][e[0]]=true;
        }
        
        que.add(1);
        dist[1]=1;
        
        while(!que.isEmpty()){
            int node = que.poll();  // poll : 맨 앞 (유의어 : head)
            for(int i=1; i<=n; i++){
                if(graph[node][i] == true && dist[i]==0 && node!= i ){
                    que.add(i);
                    dist[i]=dist[node]+1;
                }
            }
        }
        
        int max = Arrays.stream(dist).max().getAsInt();
        
        
        return 
        Arrays.stream(dist).
            filter(x -> x==max).
            count();
    }
}