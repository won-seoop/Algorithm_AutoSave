import java.util.*;
import java.io.*;
import java.lang.*;

// sol
// https://velog.io/@halo_3735/%EA%B5%AC%ED%98%84-%EB%B0%B1%EC%A4%80-1051-%EC%88%AB%EC%9E%90-%EC%A0%95%EC%82%AC%EA%B0%81%ED%98%95

public class P1051 {

    static int N, M;
    static int[][] mat;

    public static boolean IsSquareWithEqualCorners(int x, int y, int offset) {
        int[] dx = {0, 0, offset, offset};
        int[] dy = {0, offset, 0, offset};
        int val = mat[x][y];
        for (int i = 0; i < 4; i++) {
            if (x + dx[i] < N && y + dy[i] < M) {
                if (mat[x + dx[i]][y + dy[i]] == val) {

                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int max = 1;
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        mat = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                mat[i][j] = line.charAt(j) - '0';
            }
        }

        for (int offset = 1; offset <= Math.min(N, M); offset++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (IsSquareWithEqualCorners(i, j, offset)) {
                        max = Math.max(max, (int) Math.pow(offset + 1, 2));
                    }
                }
            }
        }

        System.out.println(max);
    }
}
