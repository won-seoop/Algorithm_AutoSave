import java.util.*;
import java.io.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int cnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dfs(0);

        bw.write(cnt+"");
        bw.flush();
        bw.close();

    }
    public static void dfs(int dep){
        if(dep==N){
            cnt++;
            return;
        }

        for(int i=0; i<N; i++){
            arr[dep] =i;

            if(canPut(dep)){
                dfs(dep+1);
            }
        }
    }
    public static boolean canPut(int dep) {
        for (int i = 0; i < dep; i++) {
            if (arr[i] == arr[dep]) {
                return false;
            }

            else if (Math.abs(arr[i] - arr[dep]) == Math.abs(i - dep)) {
                return false;
            }
        }
        return true;
    }

}
