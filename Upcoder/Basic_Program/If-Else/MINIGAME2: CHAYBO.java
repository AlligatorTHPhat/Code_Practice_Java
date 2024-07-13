import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        int ca = scanner.nextInt();

        int t = scanner.nextInt();
        
        int result = t % (ab + bc + ca);
        
        if(result == 0) System.out.print("A");
        else if(result < ab) System.out.print("AB");
        else if(result == ab) System.out.print("B");
        else if(result < ab + bc && result > ab) System.out.print("BC");
        else if(result == ab + bc && result > ab) System.out.print("C");
        else if(result < ab + bc + ca && result > ab + bc) System.out.print("CA");
        scanner.close();
    }
}
