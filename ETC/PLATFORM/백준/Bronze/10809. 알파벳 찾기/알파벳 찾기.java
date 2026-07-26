import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        
        
        boolean[] vst = new boolean[26];
        int[] arr = new int[26];
        Arrays.fill(arr,-1);
            
        for (int i=0; i<word.length(); i++){
            if(vst[word.charAt(i)-97]==false){
                vst[word.charAt(i)-97]=true;
                arr[word.charAt(i)-97]=i;
            }
        }

        for (int a : arr){
            System.out.print(a+" ");
        }
    }
}