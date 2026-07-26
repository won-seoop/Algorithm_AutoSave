import java.util.*;
import java.io.*;
import java.lang.*;

public class P7568 {
    public static void main(String args[]) {
        int num = 0;
        int N;
        int arr[][];
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            num = 0;
            int now_w = arr[i][0];
            int now_h = arr[i][1];

            for (int j = 0; j < N; j++) {
                if (i != j) {
                    int other_w = arr[j][0];
                    int other_h = arr[j][1];
                    if (now_w < other_w && now_h < other_h) {
                        num++;
                    }
                }
            }
            System.out.println(num + 1);

        }
    }
}
