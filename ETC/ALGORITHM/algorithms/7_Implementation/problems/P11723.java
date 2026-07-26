import java.util.*;
import java.io.*;
import java.lang.*;

public class P11723 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Scanner sc = new Scanner(System.in);
        String[] line;
        int N;
        HashSet<Integer> set = new HashSet<>();


        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String oper = st.nextToken();

            if (st.countTokens() == 1) {
                int num = Integer.parseInt(st.nextToken());
                if (oper.equals("add")) {
                    set.add(num);
                } else if (oper.equals("remove")) {
                    set.remove(num);
                } else if (oper.equals("check")) {
                    if (set.contains(num)) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");

                    }

                } else if (oper.equals("toggle")) {
                    if (set.contains(num)) {
                        set.remove(num);
                    } else {
                        set.add(num);
                    }
                }
            } else {
                if (oper.equals("all")) {
                    set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
                } else if (oper.equals("empty")) {
                    set.clear();
                }
            }
        }
        bw.flush();
        bw.close();
    }
}