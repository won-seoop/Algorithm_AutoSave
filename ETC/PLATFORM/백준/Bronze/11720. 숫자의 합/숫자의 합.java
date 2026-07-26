import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(br.readLine());
        String tmp = br.readLine(); // 1234
        int sum=0;
        for (int i=0; i<n; i++){
            sum+=tmp.charAt(i)-'0';
        }
        
        System.out.print(sum);
    }
}