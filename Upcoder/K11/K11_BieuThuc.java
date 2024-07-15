import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float x = scanner.nextFloat();
        if (x < 2.5) {
            System.out.println("NHAP SAI");
        } else {
            System.out.println(Math.sqrt(2 * x - 5));
        }
    }
}
