import java.util.Scanner;

public class Main {
    public static boolean check(int n) {
        int k = (int) Math.sqrt(n);
        return k * k == n;
    }
    
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       
       int n = scanner.nextInt();
       
       System.out.println(check(n) ? "yes" : "no");
       
        scanner.close();
    }
}
