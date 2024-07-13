import java.util.Scanner;
import java.util.Stack;

public class Main {
    static boolean is_matching(char open, char close) {
        return (open == '{' && close == '}') ||
            (open == '[' && close == ']') ||
            (open == '(' && close == ')');
    }
    
    static boolean is_balance(String str) {
        Stack<Character> stk = new Stack<>();

        for(char c : str.toCharArray()) {
            if(c == '{' || c == '[' || c == '(') {
                stk.push(c);
            } else if(c == '}' || c == ']' || c == ')') {
                if(stk.empty() || !is_matching(stk.peek(),c)) {
                    return false;
                }
                stk.pop();
            }
        } return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine();
        
        System.out.print((is_balance(str)) ? "yes" : "no");
    }
}
