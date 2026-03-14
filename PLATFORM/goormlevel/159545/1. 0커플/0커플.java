import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		int res=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		
		
		int[] check = new int[200001];
			
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<N; i++){
			int num = Integer.parseInt(st.nextToken());
			arr[i]=num;
			check[Math.abs(num)]+=1;
		}

		for (int i=0; i<arr.length; i++){
			if(check[Math.abs(arr[i])]==1){
				res+=arr[i];
			}
		}
						System.out.println(res);				
		
	}

}