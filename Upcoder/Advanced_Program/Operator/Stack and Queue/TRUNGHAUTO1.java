import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> precedenceMap = new HashMap<>();
        precedenceMap.put('*', 2);
        precedenceMap.put('/', 2);
        precedenceMap.put('+', 1);
        precedenceMap.put('-', 1);

        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();
        char tmp;

        while (scanner.hasNext()) {
            tmp = scanner.next().charAt(0);

            if (Character.isDigit(tmp)) {
                output.append(tmp).append(" ");
            } else if (stack.isEmpty() || tmp == '(') {
                stack.push(tmp);
            } else if (tmp == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop()).append(" ");
                }
                stack.pop(); // Pop the '(' from the stack
            } else {
                while (!stack.isEmpty() && precedenceMap.getOrDefault(tmp, 0) <= precedenceMap.getOrDefault(stack.peek(), 0)) {
                    output.append(stack.pop()).append(" ");
                }
                stack.push(tmp);
            }
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }

        System.out.println(output.toString().trim());
        scanner.close();
    }
}
