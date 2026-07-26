import java.util.*;

// 피로도>=0
// 최소 필요 피로도 : 탐험 전 가지고 있어야할 피로도
// 소모 피로도 : 던전 탐험 후 소모되는 피로도

// 던전은 하루에 한번만 탐험 가능
//

// [입력]
// 현재 피로도 : 1 <= k <= 5000
// [던전 입장 최소 필요 피로도, 던전 소모 피로도] : dungeons, 
// 1. 던전 최대 개수 8
// 2. 최소 필요도 >= 소모 필요도 (1 <= 둘다 <= 1000)
// 3. 던전 중복 존재 가능

// 유저 탐험 간ㅇ 최대 던전 수

// 풀이
// 1. dungeons[0] 은 입장 확인 체크 키
// 2. dungeons[1] 은 던전나오고 피로도 - 해주는 값
// 3. 던전을 나오고 다음 던전 탐험할 시, 입장확인 체크키(dungeons[0]) 보다 높아야 다음 던전 탐험할 수 있는게 관건
// 4. 



class Solution {
    static boolean[] vst=new boolean[9];
    static int max_dep=0;
    void dfs(int[][] dungeons, int k, int dep){
        if(dep>max_dep){
            max_dep=dep;
        }
        
        for (int i=0; i<dungeons.length; i++){
            if (vst[i]==false && k>=dungeons[i][0]){
                vst[i]=true;
                dfs(dungeons,k-dungeons[i][1],dep+1);
                vst[i]=false;
            }
        }

    }
    
    
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        dfs(dungeons, k, 0);
        
        
        
        return max_dep;
    }
}