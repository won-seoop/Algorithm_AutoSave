import java.util.*;

public class Main {
    static class Edge implements Comparable<Edge> {
        public int v1;
        public int v2;
        public double w;

        Edge(int v1, int v2, double w) {
            this.v1 = v1;
            this.v2 = v2;
            this.w = w;
        }

        public int compareTo(Edge e) {
            return Double.compare(this.w, e.w);
        }
    }

    static class Node {
        public int x;
        public int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static double getDistance(Node v1, Node v2) {
        int x = v1.x - v2.x;
        int y = v1.y - v2.y;

        double pow_x = Math.pow(x, 2);
        double pow_y = Math.pow(y, 2);

        return Math.sqrt(pow_x + pow_y);
    }

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N, M, X, Y;
        double w_sum = 0;
        int[] parent;
        PriorityQueue<Edge> que = new PriorityQueue<>();
        Node[] nodes;

        N = sc.nextInt();
        M = sc.nextInt();

        nodes = new Node[N + 1];

        parent = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            parent[i] = i;
        }

        for (int i = 1; i < N + 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            nodes[i] = new Node(x, y);
        }


        for (int i = 0; i < M; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            union(parent, v1, v2);

        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (i != j) {
                    que.add(new Edge(i, j, getDistance(nodes[i], nodes[j])));
                }
            }
        }

        while (!que.isEmpty()) {
            Edge e = que.poll();

            if (find(parent, e.v1) != find(parent, e.v2)) {
                union(parent, e.v1, e.v2);
                w_sum += e.w;
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
