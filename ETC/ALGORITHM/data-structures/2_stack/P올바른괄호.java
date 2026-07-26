import java.util.*;

class P올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char v = s.charAt(i);

            if (v == '(') {
                stack.add(v);
            } else {
                if (!stack.isEmpty()) {
                    char top = stack.peek();
                    if (top == '(') {
                        stack.pop();
                    } else {
                        answer = false;
                        break;
                    }
                } else {
                    answer = false;
                    break;
                }

            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }
}