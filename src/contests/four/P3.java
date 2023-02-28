package contests.four;

import java.util.Stack;

public class P3 {

    //stack ab - cd

    // performance 88% 7/8

    public String solution(String S) {
        // Implement your solution here
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            Character actualChar = S.charAt(i);

            if (stack.isEmpty()) {
                stack.push(actualChar);
                continue;
            }

            Character topChar = stack.peek();

            if ((topChar.equals('A') && actualChar.equals('B')) ||
                    (topChar.equals('B') && actualChar.equals('A')) ||
                    (topChar.equals('C') && actualChar.equals('D')) ||
                    (topChar.equals('D') && actualChar.equals('C'))) {
                stack.pop();
            } else {
                stack.push(actualChar);
            }
        }
        StringBuilder builder = new StringBuilder();

        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }

        return builder.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println("BDACA");

    }
}
