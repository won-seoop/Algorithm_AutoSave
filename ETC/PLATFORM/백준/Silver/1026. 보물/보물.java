import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];
        Integer res = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A, (a, b) -> a - b);
        Arrays.sort(B, (a, b) -> b - a);

        for (int i = 0; i < N; i++) {
            res += A[i] * B[i];
        }

        System.out.println(res);
    }
}
