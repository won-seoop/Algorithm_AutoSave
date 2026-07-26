import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0; i<m; i++){
            int sum=0;
            int start,end;

            start = sc.nextInt();
            end = sc.nextInt();

            for(int j=start-1; j<end; j++){
                sum+=arr[j];
            }

            System.out.println(sum);
        }
    }
}
