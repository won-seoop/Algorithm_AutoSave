import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int num = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        String[] req = sc.nextLine().split("-");

        for (int i = 0; i < req.length; i++) {
            String[] addition = req[i].split("\\+");

            sum = 0;
            for (String j : addition) {
                sum += Integer.parseInt(j);
            }
            req[i] = Integer.toString(sum);
        }

        int res = Integer.parseInt(req[0]);
        for (int i = 1; i < req.length; i++) {
            res -= Integer.parseInt(req[i]);
        }

        System.out.println(res);


    }
}
