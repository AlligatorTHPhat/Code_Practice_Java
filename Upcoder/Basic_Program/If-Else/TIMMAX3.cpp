import java.util.Scanner;

public class Main {
    public static boolean check(int n) {
        return n >= Math.pow(10,5);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int values[] = new int[5];
        for(int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
            if(check(values[i])) return;
        }
        
        int max = values[0];
        for(int i = 1; i < 5; i++) {
            if(max < values[i]) max = values[i];
        }
        
        System.out.print(max);
        
        return;
    }
}
