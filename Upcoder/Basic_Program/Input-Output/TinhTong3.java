import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        
        System.out.print((n % 10) + (m % 10));
    }
}
