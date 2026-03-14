import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {

        // N : 총 보석 개수
        // K : 상덕이의 가방 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] jwe = new int[N][2];
        int[] bag = new int[K];
        long res = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            jwe[i][0] = Integer.parseInt(st.nextToken());
            jwe[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(jwe, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < K; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bag);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        int j = 0;
        for (int i = 0; i < K; i++) {
            while (j < N && jwe[j][0] <= bag[i]) {
                pq.add(jwe[j][1]);
                j++;
            }
            if (!pq.isEmpty()) {
                res += pq.poll();

            }
        }

        bw.write(res + "\n");
        bw.flush();
        bw.close();
    }
}