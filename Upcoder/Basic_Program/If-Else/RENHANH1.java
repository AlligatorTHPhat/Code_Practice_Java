import java.util.Scanner;

public class Main {
    public static boolean check(int n) {
        return n <= Math.pow(10,4);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        if(!check(n)) return;
        
        if(n % 3 == 0) System.out.print(n + " chia het cho 3");
        else System.out.print(n + " chia 3 du " + (n%3));
        return;
    }
}
