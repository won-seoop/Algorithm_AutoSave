import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        String s = st.nextToken();

        int[] arr = new int[s.length()];

        for (int i=0; i<arr.length; i++){
            arr[i] = (s.charAt(i)-'0');
        }


        for (int i=0; i<arr.length; i++){
            int max=-1;
            int max_idx=i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]>max){
                    max_idx=j;
                    max=arr[j];
                }
            }
            if(max_idx != i){
                int tmp=arr[i];
                arr[i]=arr[max_idx];
                arr[max_idx]=tmp;
            }

        }

        String ans="";
        for(int i=0; i<arr.length; i++){
            ans+=arr[i];
        }

        bw.write(ans);

        bw.flush();
        bw.close();

    }
}
