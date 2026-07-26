import java.util.Scanner;

//https://velog.io/@halo_3735/11053

// dp
// 0 0 0 0 0 0 0

// arr
// 10 20 10 30 20 50


//public class Main {
public class P11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // 6
        int[] arr = new int[N+1];   // 10 20 10 30 20 50
        int[] dp = new int[N+1];

        for (int i=1;i<=N;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=1;i<=N;i++){
            dp[i]=1;
        }




        for (int i=2; i<=N;i++){
            int v = arr[i];
            for (int j=1;j<i;j++){
                int pv = arr[j];
                if (v>pv){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int max_num=0;
        for (int i=1;i<=N;i++){
            if (max_num <dp[i]){
                max_num=dp[i];
            }
        }
        System.out.print(max_num);


    }
}



// 만약 현재 값이 max보다 크다면
//d[i]=dp[i-1]

//else
//dp[i]=dp[i-1]