class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int move = len - 1;

        for (int i = 0; i < len; i++) {
            // 상하 이동 계산
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            // 좌우 이동 최소값 계산
            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }

            // 현재 위치 기준으로 뒤로 돌아가는 경우 고려
            move = Math.min(move, i * 2 + len - next);
            move = Math.min(move, (len - next) * 2 + i);
        }

        answer += move;
        return answer;
    }
}
