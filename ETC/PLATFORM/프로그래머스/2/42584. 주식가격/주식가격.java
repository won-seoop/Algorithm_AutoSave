import java.util.*;

class Solution {
    public Queue<Integer> solution(int[] prices) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> answer = new LinkedList<>();

        for (int i = 0; i < prices.length; i++) {
            que.add(prices[i]);
        }

        while (que.size() > 1) {  // 마지막 원소 전까지 처리
            int v = que.poll();
            int undrop = 0;

            for (int a : que) {
                undrop++;
                if (v > a) break;  // 떨어지면 멈춤
            }
            answer.add(undrop);
        }

        answer.add(0);  // 마지막 가격은 비교할 대상이 없으니 0초 유지

        return answer;
    }
}
