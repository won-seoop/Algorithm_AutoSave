import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,M;
        long cnt=0;
        N=sc.nextInt();
        M=sc.nextInt();

        long[] C = new long[M];
        int[] arr = new int[N+1];
        int[] sum = new int[N+1];

        for(int i=1; i<N+1; i++){
            arr[i] = sc.nextInt();
        }

        // 1. M으로 나누기
        for(int i=1; i<N+1; i++){
            sum[i]=(sum[i-1]+arr[i])%M;
            if(sum[i]==0) cnt++;     // 2. 0개수 카운트
            C[sum[i]]++;
        }

        for(long i: C){
            if(i>1){
                cnt+=(i*(i-1))/2;
            }
        }

        System.out.print(cnt);



    }

}
