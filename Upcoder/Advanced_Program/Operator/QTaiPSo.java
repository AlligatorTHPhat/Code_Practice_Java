import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        
        for(char c : str.toCharArray()) {
            if(c == '*') {
                if(!stack.empty()) {
                    System.out.print(stack.peek());
                    stack.pop();
                }
            } else stack.push(c);
        }
        scanner.close();
        return;
    }
}
