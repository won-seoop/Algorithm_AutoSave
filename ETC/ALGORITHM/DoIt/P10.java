import java.util.*;
import java.io.*;

public class P10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Deque<Node> deque = new LinkedList<>();
        int N,L;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++){

            int val = Integer.parseInt(st.nextToken());

            while(!deque.isEmpty() && deque.getLast().val > val){
                deque.removeLast();
            }
            deque.addLast(new Node(i,val));

            if(deque.getFirst().idx <= i-L){
                deque.pollFirst();
            }

            bw.write(deque.getFirst().val+" ");
        }
        bw.flush();
        bw.close();


    }

    public static class Node{
        public int idx;
        public int val;

        Node(int idx, int val){
            this.idx = idx;
            this.val = val;

        }
    }

}

