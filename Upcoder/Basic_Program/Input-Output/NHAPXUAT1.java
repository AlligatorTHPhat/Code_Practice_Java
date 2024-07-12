import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        System.out.println(n % 10);
        System.out.println(n / 100);
        System.out.print((n / 10) % 10);
    }
}
