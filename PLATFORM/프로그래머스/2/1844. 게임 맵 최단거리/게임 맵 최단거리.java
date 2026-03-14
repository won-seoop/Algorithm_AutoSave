import java.util.*;

class Solution {
    static int[] dx = new int[]{-1,1,0,0};
    static int[] dy = new int[]{0,0,-1,1};

    
    public int solution(int[][] maps) {
        Queue<int[]> que = new LinkedList<>();
        
        int[][] visited = new int[maps.length][maps[0].length];
        
        que.add(new int[]{0,0});
        visited[0][0]=1;
        
        while(!que.isEmpty()){
            int[] pos = que.poll();
            for(int i=0; i<4; i++){
                int nx=dx[i]+pos[0];
                int ny=dy[i]+pos[1];
                
                if(nx>=0 && ny>=0 && nx<maps.length && ny<maps[0].length){
                    if(maps[nx][ny]==1 && visited[nx][ny] ==0){
                        if(nx==maps.length-1 && ny==maps[0].length-1){
                            return visited[pos[0]][pos[1]]+1;
                        }
                        visited[nx][ny]=visited[pos[0]][pos[1]]+1;
                        que.add(new int[]{nx,ny});
                    }
                }
            }
        }
        
        
        if(visited[maps.length-1][maps[0].length-1] == 0){
            return -1;
        }
        else{
            return visited[maps.length-1][maps[0].length-1];
        }
        
    }
}