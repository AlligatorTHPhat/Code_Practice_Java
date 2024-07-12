import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int n = scanner.nextInt();
        int sum = 0;
        
        while(n != 0) {
            int tmp = n % 10;
            sum += tmp;
            n /= 10;
        }
        
        System.out.print(sum);
    }
}
