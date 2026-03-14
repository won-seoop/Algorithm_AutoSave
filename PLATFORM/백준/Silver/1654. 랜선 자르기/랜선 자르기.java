import java.util.*;
import java.io.*;

// N개의 랜선 필요
//

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        long right = 0;

        for (int i = 0; i < K; i++) {
            if (right < arr[i]) {
                right = arr[i];
            }
        }

        long left = 1;
        long mid = 0;
        long sum = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            sum = 0;
            for (int i = 0; i < K; i++) {
                sum += (arr[i] / mid);
            }
            if (sum < N) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(right);
        bw.flush();
        bw.close();
    }
}
