import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        System.out.print((n > 100) ? (n / 10) % 100 : -1);
        
        scanner.close();
    }
}
