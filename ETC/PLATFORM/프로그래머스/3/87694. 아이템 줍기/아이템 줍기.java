import java.util.*;

class Solution {
    static int[][] mat;
    static int[][] dist;
    
    void fill(int[] r){
        int x1 = r[0];
        int y1 = r[1];
        int x2 = r[2];
        int y2 = r[3];
        
        for(int i=2*y1 ; i<=2*y2; i++){
            for(int j=2*x1; j<=2*x2; j++){
                if(mat[i][j]==2) continue;
                mat[i][j]=2;
                if(i==2*y1 || i==2*y2 || j==2*x1 || j==2*x2){
                    mat[i][j]=1;
                }
            }
        }
        
    }
    
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        Queue<int[]> que = new LinkedList<>();
        mat=new int[102][102];
        dist=new int[102][102];
        
        int[] dy = new int[]{-1,1,0,0};
        int[] dx = new int[]{0,0,-1,1};
        
        
        for(int[] r :rectangle){
            fill(r);
        }
        
        //BFS
        que.add(new int[]{2*characterY,2*characterX});
        
        while(!que.isEmpty()){
            int[] pos = que.poll();
            for(int i=0; i<4; i++){
                int ny = pos[0]+dy[i];
                int nx = pos[1]+dx[i];
                
                if(mat[ny][nx]==1 && dist[ny][nx]==0){
                    que.add(new int[]{ny,nx});
                    dist[ny][nx]=dist[pos[0]][pos[1]]+1;
                    
                    
                    if(nx==2*itemX && ny == 2*itemY){
                        
                        return dist[ny][nx]/2;
                    }
                }
            }
        }
        
        
        
        
        
        return dist[2*itemY][2*itemX]/2;
    }
}