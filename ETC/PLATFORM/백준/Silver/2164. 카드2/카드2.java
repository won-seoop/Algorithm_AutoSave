import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        {
            Deque<Integer> deque = new LinkedList<>();

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for (int i=1; i<=n; i++){
                deque.addLast(i);
            }

            while(deque.size()!=1){
                deque.pollFirst();
                deque.addLast(deque.pollFirst());
            }

            System.out.println(deque.peek());
        }
    }
}
