import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호들을 정렬합니다.
        Arrays.sort(phone_book);

        // 정렬 후 인접한 전화번호들만 비교합니다.
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 전화번호가 다음 전화번호의 접두사인지 확인
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false; // 접두사라면 false 반환
            }
        }

        return true; // 접두사가 없다면 true 반환
    }
}
