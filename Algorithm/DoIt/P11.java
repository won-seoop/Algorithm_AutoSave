import java.util.*;

public class P11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        Deque<Character> deque = new LinkedList<>();
        int N = sc.nextInt();
        int cnt=0;
        int val = sc.nextInt();

        for (int i=1; i<=N; i++){

            s.push(i);
            deque.add('+');

            while(!s.isEmpty() && s.peek()==val){
                s.pop();


                cnt++;
                deque.add('-');
                if(cnt!=N){
                    val=sc.nextInt();
                }
            }



        }



        if(s.isEmpty()){
            for (char a : deque){
                System.out.println(a);
            }
        }
        else{
            System.out.println("NO");

        }





    }
}
