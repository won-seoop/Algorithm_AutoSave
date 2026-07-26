import java.util.*;

public class P1715 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            que.add(sc.nextInt());
        }

        int res = 0;

        while (que.size() != 1) {
            int n1 = que.poll();
            int n2 = que.poll();

            res += n1 + n2;
            que.add(n1 + n2);
        }

        System.out.println(res);
    }
}
