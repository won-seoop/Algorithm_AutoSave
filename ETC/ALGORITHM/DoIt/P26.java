import java.util.*;
import java.io.*;

// 1 ,2, 3, 4, 5 ... N
//

public class P26 {
    static int N,M;
    static boolean[] vst;
    static int[][] graph;
    static long cnt=0;
    static Stack<Integer> stack;


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st;


        st = new StringTokenizer(br.readLine());

        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());


        for (int i=1; i<=N; i++){
            vst = new boolean[N+1];
            stack = new Stack<>();
            vst[i]=true;
            stack.push(i);
            dfs(i,1);
            vst[i]=false;
        }

        bw.flush();
        bw.close();
    }

    static void dfs(int num, int dep) throws IOException{
        if(dep==M){
            stackString(stack);
            bw.write("\n");
            return;
        }

        for (int i=1; i<=N; i++){
            if(!vst[i]){
                vst[i]=true;
                stack.push(i);
                dfs(i,dep+1);
                vst[i]=false;
                stack.pop();
            }
        }
    }

    static public void stackString(Stack<Integer> s) throws IOException{
        for (int i : s){
            bw.write(i+" ");
        }
    }
}
