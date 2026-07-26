import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
         Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int totalWeight = 0;
        int idx = 0;

        // 다리 길이만큼 0으로 초기화 (빈 공간)
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        while (idx < truck_weights.length) {
            time++;

            // 다리 끝 도착한 트럭(또는 빈 공간) 제거
            totalWeight -= bridge.poll();

            // 다음 트럭이 들어올 수 있는지 확인
            if (totalWeight + truck_weights[idx] <= weight) {
                bridge.offer(truck_weights[idx]);
                totalWeight += truck_weights[idx];
                idx++;
            } else {
                bridge.offer(0);  // 트럭 못 들어오면 빈 공간 유지
            }
        }

        // 마지막 트럭이 다리를 다 건너는 시간까지 추가
        return (time + bridge_length);
    }
}
