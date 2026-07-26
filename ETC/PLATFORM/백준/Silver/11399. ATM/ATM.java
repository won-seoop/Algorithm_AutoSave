import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] sum = new int[N];


        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=1; i<N; i++){
            for (int j=0; j<=i-1; j++){
                if(arr[j]>=arr[i]){
                    int tmp=arr[i];
                    for(int k=i; k>=j+1; k--){
                        arr[k]=arr[k-1];
                    }
                    arr[j]=tmp;
                    break;

                }
            }
        }

        sum[0]=arr[0];

        for(int i=1; i<N; i++){
            sum[i]=arr[i]+sum[i-1];
        }

        bw.write(Arrays.stream(sum).sum()+"");
        bw.flush();
        bw.close();


    }
}
