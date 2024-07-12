import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        if(a != 0) System.out.printf("%.2f",-b / a);
        else if(a == 0) {
            if(b != 0) System.out.print("VN");
            else if(b == 0) System.out.print("VSN");
        }
        
        scanner.close();
    }
}
