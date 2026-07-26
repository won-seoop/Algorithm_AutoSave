import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P16953 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 1;

        while (A <= B) {

            if (A == B) {
                break;
            }
            // 홀수
            if (B % 2 == 1) {
                String s_B = (Integer.toString(B));
                if (s_B.substring(s_B.length() - 1).equals("1")) {
                    B = Integer.parseInt(s_B.substring(0, s_B.length() - 1));
                } else {
                    break;
                }
            }
            // 짝수
            else {
                B /= 2;
            }

            cnt++;
        }

        if (A == B) {
            System.out.println(cnt);
        } else {
            System.out.println(-1);
        }

    }
}
