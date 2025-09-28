import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static void quickSort(int[] arr){
        if(arr.length==1){
            return;
        }
        quickSort(arr, 0, arr.length-1);
    }

    static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr,start,end); // part2 : 두번째 배열의 첫번째 idx
        if(start+1<part2){
            quickSort(arr,start,part2-1);
        }
        if(part2<end){
            quickSort(arr,part2,end);
        }

    }
    static int partition(int[] arr, int start, int end){
        int pivot = arr[(start+end)/2];

        while(start<=end){
            while(arr[start]<pivot) start++;
            while(arr[end]>pivot) end--;
            if(start<=end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        return start;       // 두 번째 파티션의 첫 번째 index를 결국 start가 end를 넘어서 반환
    }

    static void swap(int[] arr, int start, int end){
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr);
        bw.write((arr[M-1])+"");

        bw.flush();
        bw.close();

    }
}
