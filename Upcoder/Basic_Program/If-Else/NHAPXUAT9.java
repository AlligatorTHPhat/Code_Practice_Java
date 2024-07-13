import java.util.Scanner;

public class Main {
    public static boolean check(int n) {
        return n >= 1000;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        System.out.print((check(n)) ? n / 1000 % 10 : -1);
        
        return;
    }
}
