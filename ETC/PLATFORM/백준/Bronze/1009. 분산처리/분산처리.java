import java.io.*;
import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int k = 0; k < n; k++) {
            int a, b;
            int res = 1;

            a = sc.nextInt();
            b = sc.nextInt();

            for (int i = 0; i < b; i++) {
                res = (res * a) % 10;
            }
            if (res == 0) {
                System.out.println(10);
            } else {
                System.out.println(res);
            }
        }

    }


}
