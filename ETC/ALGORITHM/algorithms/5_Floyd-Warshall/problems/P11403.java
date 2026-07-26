import java.util.*;
import java.io.*;

// 풀이
// https://velog.io/@halo_3735/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-11403-%EA%B2%BD%EB%A1%9C%EC%B0%BE%EA%B8%B0
public class P11403 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][N];
        int tmp;
        int inf = 100000000;

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                tmp = Integer.parseInt(st.nextToken());
                arr[i][j] = tmp;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                tmp = arr[i][j];
            }
        }
    }
}
