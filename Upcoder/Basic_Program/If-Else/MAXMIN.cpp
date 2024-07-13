import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int i = 4, max = 0, min = n;
        while(i != 0) {
            int temp = n % 10;
            if(max < temp) max = temp;
            if(min > temp) min = temp;
            // System.out.println("max:" + max + " ");
            // System.out.println("min:" +  min + " ");
            n /= 10;
            i--;
        }
        System.out.println(max+min);
        return;
    }
}
