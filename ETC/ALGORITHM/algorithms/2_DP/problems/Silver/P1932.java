import java.util.Scanner;

//public class Main {
public class P1932 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max_val=0;
        int[][] item = new int[N+1][N+1];
        int[][] dp = new int[N+1][N+1];

        for (int i=1;i<=N;i++){
            for (int j =1;j<=i;j++){
                item[i][j] = sc.nextInt();
            }
        }

        // TS 1
        dp[1][1]=item[1][1];


        for (int i=1;i<=N-1;i++) {
            for (int j = 1; j <= i; j++) {
                dp[i+1][j]=Math.max(dp[i+1][j],dp[i][j]+item[i+1][j]);
                dp[i+1][j+1]=Math.max(dp[i+1][j+1], dp[i][j]+item[i+1][j+1]);
            }
        }

        for (int i=1;i<=N;i++){
            max_val=Math.max(dp[N][i],max_val);
        }

        System.out.print(max_val);
    }
}


