import java.util.*;
import java.io.*;


public class P24 {
    static int N;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   // 4

        int[] sosus=new int[]{2,3,5,7};
        for (int i:sosus){
            DFS(i,1);
        }
        bw.flush();

        bw.close();
    }
    public static boolean isSosu(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void DFS(int n, int dep) throws IOException{

        if (dep==N && isSosu(n)){
            bw.write(n+"\n");
            return;
        }

        for (int i=1; i<=9; i++){
            int num = Integer.parseInt(n+""+i);
            if(isSosu(num)){
                DFS(num, dep+1);
            }
        }
    }
}
