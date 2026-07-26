import java.util.*;

public class P1806 {
    static int N, S;
    static int[] arr;
    static int res;
    static long sum;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();

        arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int start = 0, end = 0;
        res = N + 1;
        sum = 0;

        while (true) {
            if (sum >= S) {
                res = Math.min(res, end - start);
                sum -= arr[start++];
            } else if (end == N) {
                break;
            } else {
                sum += arr[end++];
            }
        }

        System.out.println(res == N + 1 ? 0 : res);
    }
}
