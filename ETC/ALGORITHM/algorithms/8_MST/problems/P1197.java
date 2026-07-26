import java.util.*;
import java.io.*;

public class P1197 {
    static class Edge implements Comparable<Edge> {
        public int v1;
        public int v2;
        public int weight;


        public Edge(int v1, int v2, int weight) {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }


    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        int V, E;
        long w_sum = 0;
        PriorityQueue<Edge> que = new PriorityQueue<>();
        int[] parent;

        V = sc.nextInt();
        E = sc.nextInt();

        parent = new int[V + 1];
        for (int i = 1; i < parent.length; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < E; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            que.add(new Edge(v1, v2, weight));
        }

        while (!que.isEmpty()) {
            Edge e = que.poll();

            if (find(parent, e.v1) != find(parent, e.v2)) {
                union(parent, e.v1, e.v2);
                w_sum += e.weight;
            }
        }


        System.out.println(w_sum);
    }

    static int find(int[] parent, int v) {
        if (parent[v] == v) {
            return v;
        }
        return parent[v] = find(parent, parent[v]);
    }

    static void union(int[] parent, int v1, int v2) {
        v1 = find(parent, v1);
        v2 = find(parent, v2);

        if (v1 < v2) {
            parent[v2] = v1;
        } else {
            parent[v1] = v2;
        }
    }
}
