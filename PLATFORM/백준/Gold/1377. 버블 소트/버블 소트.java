import java.io.*;
import java.util.*;

public class Main {

    static class Data implements Comparable<Data>{
        public int idx;
        public int val;

        Data(int idx, int val){
            this.idx=idx;
            this.val =val;
        }

        @Override
        public int compareTo(Data d){
            return this.val-d.val;
        }


    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;



        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Data[] arr = new Data[N];

        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int val =  Integer.parseInt(st.nextToken());
            arr[i] = new Data(i,val);
        }

        Arrays.sort(arr);
        int max=0;

        for (int i=0; i<N; i++){
            int gap = arr[i].idx-i;             // 수정 필요

            if(max<gap){
                max=gap;
            }
        }




        bw.write(max+1+"");
        bw.flush();
        bw.close();
    }
}
