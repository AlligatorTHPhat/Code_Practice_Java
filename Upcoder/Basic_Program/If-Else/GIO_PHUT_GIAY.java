import java.util.Scanner;

public class Main {
    public static boolean check_time(int hour, int minute, int second) {
        if(0 <= hour && hour <= 23 && 0 <= minute && minute <= 59 && 0 <= second && second <= 59 ) {
            return true;
        } 
        else return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();
        
        if(check_time(hour, minute, second)) {
            second += 1;
            if(second == 60) {
                minute += 1; second = 0;
            }
            
            if(minute == 60) {
                hour += 1; minute = 0; second = 0;
            }
            
            if(hour == 24) {
                hour = 0;  minute = 0; second = 0;
            } 
            
            System.out.print("YES\n" + hour + ":" + minute + ":" + second);
        } else System.out.print( "NO");
        
        return;
    }
}
