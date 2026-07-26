import java.util.Arrays;
import java.util.Scanner;


public class P11399 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int res = 0;
        int N = sc.nextInt();
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> a - b);


        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                res += arr[j];

            }
        }

        System.out.println(res);
    }
}
