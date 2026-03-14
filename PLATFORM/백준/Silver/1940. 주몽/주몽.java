import java.util.*;

public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,M;
        long cnt=0;

        N=sc.nextInt();
        M=sc.nextInt();

        int[] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int s=0;
        int e=N-1;

        while(s<e){ //  2개를 골라야하니까 같아지면 안됨.
            long sum=arr[s]+arr[e];

            if(sum<M){
                s++;
            }
            else if(sum==M){
                s++; e--;
                cnt++;
            }
            else{
                e--;
            }
        }



        System.out.print(cnt);
    }
}
