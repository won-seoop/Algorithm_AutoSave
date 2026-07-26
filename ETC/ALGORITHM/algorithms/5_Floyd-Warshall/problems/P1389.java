import java.io.*;
import java.util.*;

public class P1389 {
    public static void main(String args[]) throws Exception {
        // 두사람이 최소 몇단계 만에 이어질 수 있는지 계산하는 게임
        // 각 사람마다 최단거리 구해서
        // 그 중에서 제일 작은거 Pick

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N, M;
        int[][] dp;
        int inf = 100000000;
        int[] kevin_arr;
        int min_kevin = 100000000;
        int result_man = 101;
        PriorityQueue<Integer> que;


        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dp = new int[N + 1][N + 1];


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            dp[a][b] = 1;
            dp[b][a] = 1;
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (dp[i][j] == 0 && i != j) {
                    dp[i][j] = inf;
                }
            }
        }


        for (int n = 1; n < N + 1; n++) {
            for (int i = 1; i < N + 1; i++) {
                for (int j = 1; j < N + 1; j++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][n] + dp[n][j]);
                }
            }
        }

        kevin_arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                kevin_arr[i] += dp[i][j];
            }
        }


        que = new PriorityQueue<>();
        // min_kevin = 1000000 (init)
        // result_man = 101 (init)
        for (int i = 1; i <= N; i++) {
            if (min_kevin >= kevin_arr[i]) {
                min_kevin = kevin_arr[i];
            }
        }

        for (int i = 1; i <= N; i++) {
            if (kevin_arr[i] == min_kevin) {
                que.add(i);
            }

        }

        bw.write(que.peek() + "\n");

        bw.flush();
        bw.close();
    }
}
