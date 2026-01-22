import java.util.*;
import java.io.*;

public class P23 {
    static int cnt=0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N,M;

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[][] graph = new int[N+1][N+1];
        boolean[] vst = new boolean[N+1];

        for (int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        BFS(vst, graph);

        bw.write(cnt+"");
        bw.flush();

        bw.close();
    }

    static void BFS(boolean[] vst, int[][] graph){

        Queue<Integer> que = new LinkedList<>();

        for (int i=1; i<vst.length; i++){
            if(!vst[i]){
                que.add(i);
                while(!que.isEmpty()){
                    int n = que.poll();
                    for (int j=1; j<vst.length; j++){
                        if (graph[n][j] == 1 && !vst[j]  ){
                            que.add(j);
                            vst[j]=true;
                        }
                    }
                }
                cnt++;
            }
        }
    }
}
