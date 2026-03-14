import java.util.*;
import java.io.*;

public class Main {

    static class Node {
        public double x;
        public double y;

        Node(double x, double y) {
            this.x = x;
            this.y = y;
        }

    }

    static class Edge implements Comparable<Edge> {
        public int v1;
        public int v2;
        public double weight;

        Edge(int v1, int v2, double weight) {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge e) {
            return Double.compare(this.weight, e.weight);
        }

    }

    static double GetDistance(Node a, Node b) {
        return Math.sqrt(Math.pow(Math.abs(a.x - b.x), 2) + Math.pow(Math.abs(a.y - b.y), 2));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N;
        double x, y;
        double w_sum = 0;
        Node[] node_arr;
        PriorityQueue<Edge> que = new PriorityQueue<>();
        int[] parent;

        N = sc.nextInt();
        node_arr = new Node[N];
        parent = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < N; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();

            node_arr[i] = (new Node(x, y));
        }

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (i != j) {
                    Edge e = new Edge(i, j, GetDistance(node_arr[i], node_arr[j]));
                    que.add(e);
                }
            }
        }


        while (!que.isEmpty()) {
            Edge e = que.poll();

            if (find(parent, e.v1) != find(parent, e.v2)) {
                union(parent, e.v1, e.v2);
                w_sum += e.weight;
            }
        }

        System.out.printf("%.2f", w_sum);
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
