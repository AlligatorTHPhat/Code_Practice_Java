import java.util.Scanner;

public class Main {
    public static boolean check_leap_year(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if(month < 1 || month > 12) {
            System.out.print("NO");
            return;
        }
        
        int max_day;
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                max_day = 31;
                break;
            case 4: case 6: case 9: case 11:
                max_day = 30;
                break;
            case 2:
                max_day = (check_leap_year(year) ? 29 : 28); 
                break;
            default:
                max_day = 0;
                break;
        }
        
        if(1 <= day && day <= max_day && year >= 1900) {
            System.out.print("YES"); return;
        } else { System.out.print("NO"); return; }
        
    }
}
