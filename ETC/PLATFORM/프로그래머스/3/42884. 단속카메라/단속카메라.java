import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a,b)->(a[1]-b[1]));
        
        int last_camera_pos=routes[0][1];
        int camera_cnt=1;
        for (int i=1; i<routes.length; i++){
            if(last_camera_pos<routes[i][0]){
                camera_cnt++;
                last_camera_pos=routes[i][1];
            }
        }
        return camera_cnt;
    }
}