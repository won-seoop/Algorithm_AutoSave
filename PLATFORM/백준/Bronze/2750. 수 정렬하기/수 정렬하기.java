import java.io.*;
import java.util.*;

// 버블정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i=0; i<N; i++){
            st= new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }



        for (int i=0; i<N-1; i++){
            for (int j=0; j<N-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for (int i:arr){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
