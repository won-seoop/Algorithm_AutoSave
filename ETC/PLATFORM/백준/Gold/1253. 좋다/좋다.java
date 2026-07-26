import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        long[] arr;
        long cnt=0;

        N = sc.nextInt();
        arr = new long[N];


        // Todo 1. 배열을 함수 형으로 받는 법 알아 보기
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int k=0; k<N; k++){
            int s=0;
            int e=N-1;
            long sum=0;

            while(s<e){
                sum=arr[s]+arr[e];

                if(sum==arr[k] ){
                    if(s !=k && e!=k){
                        cnt++;
                        break;
                    }
                    else if(s==k){
                        s++;
                    }
                    else if(e==k){
                        e--;
                    }
                }
                else if(sum>arr[k]){
                    e--;
                }
                else{
                    s++;
                }
            }



        }


        System.out.println(cnt);

    }
}
