import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        
        int min = a;
        if(min > b) min = b;
        if(min > c) min = c;
        System.out.print(max + " " + min);
        
        scanner.close();
    }
}
