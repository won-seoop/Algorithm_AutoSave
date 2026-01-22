import java.util.*;

public class P4 {
    public static void main(String[] args) {
        int N, M;
        int[][] A, DP;
        Scanner sc = new Scanner(System.in);

        N=sc.nextInt();
        M=sc.nextInt();
        A = new int[N+1][N+1];
        DP = new int[N+1][N+1];

        for (int i=1; i<=N; i++){
            for (int j=1; j<=N; j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<=N; i++){
            for (int j=1; j<=N; j++){
                DP[i][j] =DP[i-1][j] + DP[i][j-1] - DP[i-1][j-1] + A[i][j];
            }
        }

        for (int i=0; i<M; i++){
            int x1,x2,y1,y2;
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();


            int ans = DP[x2][y2] - DP[x2][y1-1] - DP[x1-1][y2] + DP[x1-1][y1-1];
            System.out.println(ans);
        }


    }
}
