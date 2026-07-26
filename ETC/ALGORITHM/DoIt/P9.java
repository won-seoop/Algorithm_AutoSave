import java.util.*;


// [A, C, G, T]
// 문자열 길이, 윈도우 길이
// 문자열
// AGCT 정보
public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 0. cnt
        long cnt=0;
        boolean flag=true;

        // 1. 문자열 길이 입력
        int N = sc.nextInt();

        // 2. 윈도우 길이 입력
        int sizeOfWindow = sc.nextInt();

        // 3. 문자열 정보 저장
        String str = sc.next();

        // 4. 아미노산 정보 저장
        int[] info = new int[4];

        for (int i=0; i<4; i++){
            info[i]=sc.nextInt();
        }


        //5. 슬라이딩 윈도우 초기값 설정
        // GA
        int[] check = new int[4];

        for(int i=0; i<sizeOfWindow; i++){
            char tmp = str.charAt(i);

            switch(tmp){
                case 'A':
                    check[0]++;
                    break;
                case 'C':
                    check[1]++;
                    break;
                case 'G':
                    check[2]++;
                    break;
                case 'T':
                    check[3]++;
                    break;
            }
        }
//        System.out.println("check[A, C, G, T] : " + Arrays.toString(check));

        for (int i=0; i<4; i++){
            if(info[i]!=0){
                if(check[i]<info[i]){
                    flag=false;
                }
            }
        }

        if(flag){
            cnt++;
        }





        // 6. 순회
        // str.len = 4
        // i = (1~ 4-2) -> (1~ str.len-sizeOfWindow)





        for (int i=1; i<= str.length()-sizeOfWindow; i++){
            int poll = i-1;
            int add = i+sizeOfWindow-1;

            switch(str.charAt(poll)){
                case 'A':
                    check[0]--;
                    break;
                case 'C':
                    check[1]--;
                    break;
                case 'G':
                    check[2]--;
                    break;
                case 'T':
                    check[3]--;
                    break;
            }

            switch(str.charAt(add)){
                case 'A':
                    check[0]++;
                    break;
                case 'C':
                    check[1]++;
                    break;
                case 'G':
                    check[2]++;
                    break;
                case 'T':
                    check[3]++;
                    break;
            }

            boolean flag2=true;

            for (int k=0; k<4; k++){
                if(info[k]!=0){
                    if(check[k]<info[k]){
                        flag2=false;
                    }
                }
            }

            if(flag2){
                cnt++;
            }
        }

//        System.out.println("cnt: "+ cnt);
        System.out.println(cnt);
    }
}
