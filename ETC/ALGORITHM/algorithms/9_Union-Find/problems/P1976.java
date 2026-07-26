import java.io.*;
import java.util.*;

public class P1976 {

    static int GetRoot(int[] root, int n) {
        if (root[n] == n) {
            return n;
        }
        return root[n] = GetRoot(root, root[n]);
    }

    static void Union(int[] root, int a, int b) {
        a = GetRoot(root, a);
        b = GetRoot(root, b);

        if (a < b) {
            root[b] = a;
        } else {
            root[a] = b;
        }
    }

    static boolean Find(int[] root, int a, int b) {
        a = GetRoot(root, a);
        b = GetRoot(root, b);

        if (a == b) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N, M;
//        int[][] mat;
        int[] roots;
        int tmp;
        int root;
        boolean flag = true;
        int[] arr;

        N = sc.nextInt();
        M = sc.nextInt();

        roots = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            roots[i] = i;
        }

//        mat = new int[N + 1][N + 1];
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                tmp = sc.nextInt();
                if (tmp == 1) {
                    Union(roots, i, j);
                }
            }
        }

        root = GetRoot(roots, sc.nextInt());


        for (int i = 1; i < M; i++) {
            int k = sc.nextInt();
            if (GetRoot(roots, k) != root) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

}

