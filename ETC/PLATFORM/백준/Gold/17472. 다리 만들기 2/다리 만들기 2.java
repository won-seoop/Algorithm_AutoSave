import java.util.*;

public class Main {
    static class Node {
        public int x;
        public int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Edge implements Comparable<Edge> {
        public int v1;
        public int v2;
        public int weight;

        Edge(int v1, int v2, int weight) {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }

    static int N, M;
    static int weight_sum = 0;
    static int[][] mat;
    static boolean[][] vst;
    static int space_num = 1;


    static PriorityQueue<Edge> pq = new PriorityQueue<>();
    static Queue<Node> que;
    static ArrayList<Node>[] nodes = new ArrayList[7];
    static int[] parent = new int[7];


    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        mat = new int[N][M];
        vst = new boolean[N][M];

        //nodes 초기화
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new ArrayList<>();
        }

        // mat 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // 1. bfs로 영역 숫자
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (mat[i][j] != 0 && !vst[i][j]) {
                    bfs(i, j, space_num);
                    space_num += 1;
                }
            }
        }


        // 2. 재귀로 다리 구하기
        for (int i = 1; i < nodes.length; i++) {
            for (int j = 0; j < nodes[i].size(); j++) {
                Node n = nodes[i].get(j);
                for (int dir = 0; dir < 4; dir++) {
                    int now_node = i;
                    findBridge(n.x, n.y, dir, now_node, -1);
                }
            }
        }

        // 3. kruscal MST

        for (int i = 1; i < parent.length; i++) {
            parent[i] = i;
        }

        while (!pq.isEmpty()) {
            Edge e = pq.poll();

            if (find(e.v1) != find(e.v2)) {
                union(e.v1, e.v2);
                weight_sum += e.weight;
            }
        }
        int num = find(1);
        boolean flag = true;
        for (int i = 2; i < space_num; i++) {
            if (num != find(i)) {
                System.out.println(-1);
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(weight_sum);
        }


    }

    static void bfs(int x, int y, int space_num) {
        Queue<Node> que = new LinkedList<>();
        Node node = new Node(x, y);
        que.offer(node);
        nodes[space_num].add(node);
        vst[x][y] = true;

        while (!que.isEmpty()) {
            Node v = que.poll();
            mat[v.x][v.y] = space_num;


            for (int i = 0; i < 4; i++) {
                int nx = v.x + dx[i];
                int ny = v.y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (!vst[nx][ny] && mat[nx][ny] != 0) {
                        Node nv = new Node(nx, ny);
                        que.offer(nv);
                        nodes[space_num].add(nv);

                        vst[nx][ny] = true;
                    }
                }
            }
        }

    }

    static void findBridge(int x, int y, int dir, int now_node, int len) {
        if (mat[x][y] != 0 && mat[x][y] != now_node) {
            if (len >= 2) {
                pq.offer(new Edge(now_node, mat[x][y], len));
            }
            return;
        }

        int nx = x + dx[dir];
        int ny = y + dy[dir];

        if (nx < 0 || ny < 0 || nx >= N || ny >= M) return;
        if (mat[nx][ny] == now_node) return;
        findBridge(nx, ny, dir, now_node, len + 1);
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



