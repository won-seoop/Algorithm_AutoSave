import java.util.*;
import java.io.*;


public class P1206 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N;
        int[][] mat;
        int[] arr;
        int width, heigh;
        int[] dx = {-1, -2, 1, 2};
        int res = 0;
        for (int n = 0; n < 3; n++) {


            N = sc.nextInt();

            mat = new int[256][N + 1];
            arr = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 1; i < 256; i++) {
                for (int j = 3; j <= N - 1; j++) {
                    if (i >= (256 - arr[j])) {
                        mat[i][j] = 1;
                    }
                }
            }
//            for (int i = 1; i < mat.length; i++) {
//                for (int j = 1; j < mat[i].length; j++) {
//                    System.out.print(mat[i][j] + " ");
//                }
//                System.out.println();
//            }

            for (int i = 1; i < mat.length; i++) {
                for (int j = 3; j < mat[i].length; j++) {
                    if (mat[i][j] == 1) {
                        boolean isJomang = true;
                        for (int k = 0; k < 4; k++) {
                            if (mat[i][j + dx[k]] == 1) {
                                isJomang = false;
                                break;
                            }
                        }
                        if (isJomang) {
                            res++;
                        }
                    }
                }
            }
            System.out.println("#" + (n + 1) + " " + res);
            res = 0;
        }
    }
}
