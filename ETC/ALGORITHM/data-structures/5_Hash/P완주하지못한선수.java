import java.util.*;


class P완주하지못한선수 {

    static String answer = "";

    public static String solution(String[] participant, String[] completion) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if (!map.containsKey(participant[i])) {
                map.put(participant[i], 1);
            } else {
                map.replace(participant[i], map.get(participant[i]) + 1);
            }
        }

        for (int i = 0; i < completion.length; i++) {
            map.replace(completion[i], map.get(completion[i]) - 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }


        return answer;
    }
}