import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int x = scanner.nextInt();
        
        if(x == 0) System.out.print("KHONG");
        else if (x > 0) System.out.print("DUONG");
        else if (x < 0) System.out.print("AM");
        else System.out.print("SO KHONG HOP LE");
        
        scanner.close();
    }
}
