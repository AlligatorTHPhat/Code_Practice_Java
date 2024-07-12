
import java.util.Scanner;

public class Main {
    public static boolean check(int T, long P, long C) {
        return (1 <= T && T <= 2 && 1 <= P && P <= Math.pow(10,9) && 1 <= C && C <= Math.pow(10,9)); 
    }
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       
       int T = scanner.nextInt();
       long P = scanner.nextLong();
       long C = scanner.nextLong();
       
       long result;
        
        if(check(T,P,C)) {
            if(T == 1) {
                System.out.print(P * C);
            } else if(T == 2) {
                System.out.print(((P / 2) + (P % 2)) * C);
            }
        }  else System.out.print("Error");
        
        scanner.close();
    }
}
