package easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([}}])";
        boolean result = true;

        if (s.length() % 2 == 1) result = false;

        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if ((c == '(') || (c == '[') || (c == '{')) {
                stack.push(c); // Кладем объект на вершину стека

            } else if ((c == ')') && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop(); // Если стек не пустой и наверху находится ) то закрываем пару,
                // удаляя верхнее значение стека

            } else if ((c == '}') && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();

            } else if ((c == ']') && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                result = false;
                break;
            }
        }
        if (result) {
            result = stack.isEmpty();
        }
        System.out.println(result);

    }
}