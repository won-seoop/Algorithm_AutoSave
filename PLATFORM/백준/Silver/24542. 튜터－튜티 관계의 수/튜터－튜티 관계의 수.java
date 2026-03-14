import java.util.*;
import java.io.*;

public class Main {

    // 부모노드 찾는 함수
    public static int GetParent(int[] parent, int idx) {
        if (parent[idx] == idx) {
            return idx;
        }
        return GetParent(parent, parent[idx]);
    }

    public static void UnionParent(int[] parent, int a, int b) {
        a = GetParent(parent, a);
        b = GetParent(parent, b);
        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    static boolean FindParent(int[] parent, int a, int b) {
        a = GetParent(parent, a);
        b = GetParent(parent, b);
        if (a == b) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int a, b;
        long res = 1;
        int[] parent = new int[N + 1];
        Map<Integer, Integer> hashMap = new HashMap<>();
        Iterator<Integer> iter;


        for (int i = 0; i <= N; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            UnionParent(parent, a, b);
        }

        for (int i = 1; i <= N; i++) {
            int root = GetParent(parent, i);
            if (!hashMap.containsKey(root)) {
                hashMap.put(root, 1);
            } else {
                hashMap.put(root, hashMap.get(root) + 1);
            }
        }

        iter = hashMap.keySet().iterator();
        while (iter.hasNext()) {
            int key = iter.next();
            int value = hashMap.get(key);

            res = (res * value) % 1000000007;
        }

        bw.write(res + "\n");
        bw.flush();
        bw.close();
    }
}
