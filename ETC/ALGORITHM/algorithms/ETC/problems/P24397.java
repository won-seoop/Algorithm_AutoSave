import java.io.*;
import java.util.*;

public class P24397 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N;
        int x, y, z;
        double res;
        String s;
        String[] arr = new String[2];

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            z = Integer.parseInt(st.nextToken());
            res = Math.pow(x, y) / z;
            s = Double.toString(res);
            arr = s.split("\\.");

            if (arr[0].length() >= 3) {
                bw.write(arr[0].substring(arr[0].length() - 3) + ".");
            } else if (arr[0].length() == 2) {
                bw.write(arr[0].substring(arr[0].length() - 2) + ".");
            } else if (arr[0].length() == 1) {
                bw.write(arr[0].substring(arr[0].length() - 1) + ".");
            }

            if (arr[1].length() >= 3) {
                bw.write(arr[1].substring(0, 3) + "\n");
            } else if (arr[1].length() == 2) {
                bw.write(arr[1].substring(0, 2) + "\n");
            } else if (arr[1].length() == 1) {
                bw.write(arr[1].substring(0, 1) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
