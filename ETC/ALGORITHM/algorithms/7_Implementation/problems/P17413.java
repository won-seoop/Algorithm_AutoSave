import java.util.*;
import java.io.*;
import java.lang.*;

// 풀이
// https://velog.io/@halo_3735/bj17413sol

public class P17413 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String tmp = "";
        String[] sample;
        boolean IsParApper = false;

        for (int i = 0; i < input.length(); i++) {


            if (input.charAt(i) == '<') {
                IsParApper = true;
                if (!tmp.isEmpty()) {
                    sample = tmp.split(" ");
                    for (int j = 0; j < sample.length; j++) {
                        StringBuffer sb = new StringBuffer(sample[j]);
                        System.out.print(sb.reverse().toString());
                        if (j != sample.length - 1) {
                            System.out.print(" ");
                        }
                    }
                    tmp = "";
                }
            }
            if (!IsParApper) {
                tmp += input.charAt(i);
            } else {
                if (input.charAt(i) == '>') {
                    IsParApper = false;
                }
                System.out.print(input.charAt(i));
            }
        }

        if (!tmp.isEmpty()) {
            sample = tmp.split(" ");
            for (int j = 0; j < sample.length; j++) {
                StringBuffer sb = new StringBuffer(sample[j]);
                System.out.print(sb.reverse().toString());
                if (j != sample.length - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
