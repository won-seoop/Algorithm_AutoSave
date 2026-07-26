import java.util.*;
import java.io.*;

public class Main {
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
                if (tmp == 0) {
                    arr[i][j] = inf;
                }
            }
        }


        for (int n = 0; n < N; n++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Math.min(arr[i][j], arr[i][n] + arr[n][j]);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == inf) {
                    bw.write(0 + " ");
                } else {
                    bw.write(1 + " ");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
