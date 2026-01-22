import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];
        int start =0;
        int end =0;
        long cnt =0;

        for (int i=0; i<N; i++){
            arr[i]=i+1;
        }

        while(start<=end){
            int sum=0;
            for(int i=start; i<=end; i++){
                sum+=arr[i];
            }

            if(sum<N) end++;
            else if(sum==N){
                start++; cnt++;
            }
            else{
                start++;
            }
        }

        System.out.print(cnt);

    }
}
