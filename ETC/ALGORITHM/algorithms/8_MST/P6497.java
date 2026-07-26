import java.util.*;

public class P6497 {

    static Scanner sc = new Scanner(System.in);

    static String[] line;
    static int M, N;
    static int x, y, w;
    static PriorityQueue<Edge> pq = new PriorityQueue<>();
    static int[] parent;
    static double weight_sum = 0;
    static double weight_all = 0;

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

    public static void main(String args[]) {

        while (true) {
            N = sc.nextInt();
            M = sc.nextInt();

            if (N == 0 && M == 0) {
                break;
            }

            pq.clear();
            weight_sum = 0;
            weight_all = 0;

            parent = new int[M + 1];
            for (int i = 0; i < parent.length; i++) {
                parent[i] = i;
            }

            for (int i = 0; i < M; i++) {
                x = sc.nextInt();
                y = sc.nextInt();


                w = sc.nextInt();
                weight_all += w;

                pq.offer(new Edge(x, y, w));
            }

            while (!pq.isEmpty()) {
                Edge e = pq.poll();

                if (find(e.v1) != find(e.v2)) { // 부모노드 같은지 체크 = 연결 체크
                    union(e.v1, e.v2);
                    weight_sum += e.weight;
                }
            }
            System.out.printf("%.0f", weight_all - weight_sum);
            System.out.println();
        }


    }


    static int find(int v) {
        if (parent[v] == v) {
            return v;
        }
        return parent[v] = find(parent[v]);
    }

    static void union(int v1, int v2) {
        v1 = find(v1);
        v2 = find(v2);

        if (v1 < v2) {
            parent[v2] = v1;
        } else {
            parent[v1] = v2;
        }
    }
}
