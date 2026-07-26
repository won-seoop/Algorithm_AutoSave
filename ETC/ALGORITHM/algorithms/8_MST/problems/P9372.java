import java.util.*;
import java.io.*;
import java.lang.*;

public class P9372 {


    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T;
        int node_cnt, edge_cnt;
        int tmp;

        T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            node_cnt = sc.nextInt();
            edge_cnt = sc.nextInt();
            for (int j = 0; j < edge_cnt; j++) {
                tmp = sc.nextInt();
                tmp = sc.nextInt();
            }
            System.out.println(node_cnt - 1);
        }

    }
}
