import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        int ca = scanner.nextInt();
        
        int t = scanner.nextInt();
        
        int res = t % (ab + bc + ca);
        
        if(res == 0) System.out.print("A");
        else if(res < ab) System.out.print("AB");
        else if(res == ab) System.out.print("B");
        else if(res < bc + ab && res > ab) System.out.print("BC");
        else if(res == bc + ab) System.out.print("C");
        else if(res < ca + bc + ab && res > bc + ab) System.out.print("CA");
        
        
        scanner.close();

    }
}
