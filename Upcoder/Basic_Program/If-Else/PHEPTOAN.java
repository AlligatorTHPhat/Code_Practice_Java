import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        char c = scanner.next().charAt(0);
        
        if (c == '+') System.out.print(a + b);
        else if (c == '-') System.out.print(a - b);
        else if (c == '*') System.out.print(a * b);
        else if (c == '%') System.out.print(a % b);
        
        scanner.close();
    }
}
