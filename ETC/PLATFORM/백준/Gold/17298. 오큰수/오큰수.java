import java.util.*;
import java.io.*;

public class Main  {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] NGE = new int[N];
        Stack<Integer> s = new Stack<>();

        NGE[N-1]=-1;

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // core
        for(int i=0; i<=N-2; i++){
            if(arr[i] >= arr[i+1]){
                s.push(i);
            }
            else{
                NGE[i]=arr[i+1];
                while(!s.isEmpty() && arr[s.peek()] < arr[i+1]){
                    NGE[s.pop()]=arr[i+1];
                }
            }
        }

        while(!s.isEmpty()){
            NGE[s.pop()]=-1;
        }

        for (int i=0; i<N; i++){
            bw.write(NGE[i]+" ");
        }

        bw.flush();
        bw.close();
    }
}
