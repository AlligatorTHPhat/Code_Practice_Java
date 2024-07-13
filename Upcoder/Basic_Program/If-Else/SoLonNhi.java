import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int values[] = new int[4];
        
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            if(values[i] > 100) return;
        }
        
        int max = -1;
        for(int i = 0; i < values.length; i++) {
            if(max < values[i]) max = values[i];
        }
        
        int cnt = 0, second = -1;
        for(int i = 0; i < values.length; i++) {
            if(values[i] > second && values[i] < max) {second = values[i]; cnt++;}
        }
        
        if(cnt == 0) System.out.print(-1);
        else System.out.print(second);
        
        return;
    }
}
