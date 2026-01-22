// 백준 13023

import java.util.*;
import java.io.*;

public class P25 {
    static boolean flag = true;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] vst;
    static int cnt = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N, M;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>(N);

        for (int i =0; i<N; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 0; i < N; i++) {
            if (!flag) break;

            else {
                vst = new boolean[N];
                vst[i] = true;
                DFS(i, 1);
            }
        }


        if (flag) {
            bw.write(0 + "");
        } else {
            bw.write(1 + "");
        }

        bw.flush();
        bw.close();

    }

    static void DFS(int n, int dep) {

        if (!flag) {
            return;
        }
        if (dep == cnt) {
            flag = false;
            return;
        }

        for (int i : graph.get(n)) {
            if (vst[i] == false) {
                vst[i] = true;
                DFS(i, dep + 1);
                vst[i] = false;
            }
        }

    }
}




