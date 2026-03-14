import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left, right, mid;
        long sum = 0;
        left = 0;
        right = arr[N - 1];
        mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            sum = 0;
            for (int i : arr) {
                if (mid < i) {
                    sum += i - mid;
                }
            }
            if (sum >= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        bw.write(right + "\n");

        bw.flush();
        bw.close();


    }
}
