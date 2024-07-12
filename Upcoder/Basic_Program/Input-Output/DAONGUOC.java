import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        while(n != 0) {
            int temp = n % 10;
            System.out.print(temp);
            n /= 10;
        }
        scanner.close();
    }
}
