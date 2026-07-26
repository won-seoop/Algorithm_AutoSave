import java.util.*;

public class P2470 {
    static int N;
    static long[] arr;
    static int start, end;
    static long res_start_val, res_end_val;
    static long value_close_0 = Long.MAX_VALUE;


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);
        start = 0;
        end = N - 1;

        while (start < end) {
            long start_val = arr[start];
            long end_val = arr[end];
            long sum = start_val + end_val;
            long sum_abs = Math.abs(sum);

            if (sum_abs <= value_close_0) {
                res_start_val = start_val;
                res_end_val = end_val;
                value_close_0 = sum_abs;
                if (sum <= 0) {
                    start++;
                } else {
                    end--;
                }
            } else {
                if (start_val + end_val > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }

        if (res_start_val < res_end_val) {
            System.out.println(res_start_val + " " + res_end_val);
        } else {
            System.out.println(res_end_val + " " + res_start_val);
        }
    }

}
