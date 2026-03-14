import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String[] N;
        int[] arr = new int[10];
        int max = 0;
        int tmp;


        N = sc.nextLine().split("");

        for (int i = 0; i < N.length; i++) {
            arr[Integer.parseInt(N[i])]++;
        }

        if ((arr[6] + arr[9]) % 2 == 0) {
            tmp = (arr[6] + arr[9]) / 2;

        } else {
            tmp = (arr[6] + arr[9]) / 2 + 1;
        }
        arr[6] = tmp;
        arr[9] = tmp;


        for (int i = 0; i < 10; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
