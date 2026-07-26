import java.io.IOException;
import java.util.*;

public class P14 {
    public static void main(String[] args) throws IOException {
        {
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
                if(Math.abs(a)==Math.abs(b)){
                    return a-b;
                }
                return Math.abs(a)- Math.abs(b);


            });


            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

            for (int i=0; i<N; i++){
                int n = sc.nextInt();

                if(n==0){
                    if(pq.isEmpty()){
                        System.out.println(0);
                    }
                    else{
                        System.out.println(pq.poll());
                    }
                }
                else{
                    pq.add(n);
                }
            }



        }
    }
}
