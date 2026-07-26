import java.util.*;
import java.io.*;


//sol
// https://velog.io/@halo_3735/Union-Find-%EB%B0%B1%EC%A4%80-1717-%EC%A7%91%ED%95%A9%EC%9D%98-%ED%91%9C%ED%98%84
public class P1717 {
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

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N, M;
        int[] root;
        int op, a, b;    // op : 연산자
        boolean ck;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        root = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            root[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            op = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (op == 0) {
                Union(root, a, b);
            } else if (op == 1) {
                ck = Find(root, a, b);
                if (ck) {
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }


}
