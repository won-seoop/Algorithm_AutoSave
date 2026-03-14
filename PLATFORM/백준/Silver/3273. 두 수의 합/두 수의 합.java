import java.util.*;

public class Main {

    static int N;
    static int[] arr;
    static int num;
    static int cnt = 0;
    static int start, end;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        num = sc.nextInt();

        start = 0;
        end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum < num) {
                start++;
            } else if (sum > num) {
                end--;
            } else {
                cnt++;
                start++;
            }
        }

        System.out.println(cnt);
    }

}
