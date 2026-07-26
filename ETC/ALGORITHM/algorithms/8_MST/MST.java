import java.util.*;
import java.io.*;
import java.lang.*;

public class MST {
    static Scanner sc = new Scanner(System.in);

    static class Edge implements Comparable<Edge> {
        int n;
        int m;
        int weight;

        Edge(int n, int m, int weight) {
            this.n = n;
            this.m = m;
            this.weight = weight;
        }


        @Override
        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }


    public static void main(String args[]) throws IOException {
        PriorityQueue<Edge> que = new PriorityQueue<>();
        int node_cnt;
        int edge_cnt;
        int[] parent;
        int w_sum = 0;

        node_cnt = sc.nextInt();
        edge_cnt = sc.nextInt();

        parent = new int[node_cnt + 1];

        for (int i = 0; i <= node_cnt; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < edge_cnt; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int w = sc.nextInt();

            que.add(new Edge(n, m, w));
        }

        while (!que.isEmpty()) {
            Edge e = que.poll();
            if (find(parent, e.n) != find(parent, e.m)) {
                union(parent, e.n, e.m);
                w_sum += e.weight;
            }
        }


        System.out.println(w_sum);

    }

    static void union(int[] parent, int a, int b) {
        a = find(parent, a);
        b = find(parent, b);

        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    static int find(int[] parent, int n) {
        if (parent[n] == n) {
            return n;
        }

        return parent[n] = find(parent, parent[n]);
    }
}
