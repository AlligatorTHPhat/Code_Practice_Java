import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int result = 0;
        if(n < 17) {
            result = n * 7000;
        } else if(n >= 17 && n < 51) {
            result = (16 * 7000) + ((n-16) * 8500);
        } else result = (16 * 7000) + ((34) * 8500) + ((n - 50) * 100000);
        
        System.out.print(result);
    }
}
