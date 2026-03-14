import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int aa = Math.abs(a), bb = Math.abs(b);
            if (aa == bb) return a - b;     // 절댓값 같으면 실제 값이 작은 것 우선
            return aa - bb;                  // 절댓값이 작은 것 우선
        });

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                if (pq.isEmpty()) sb.append('0').append('\n');
                else sb.append(pq.poll()).append('\n');
            } else {
                pq.add(n);
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
