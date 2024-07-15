import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.nextLine(); 
        String b = scanner.nextLine();
        
        int min_length = Math.min(a.length(), b.length());
        
        for(int i = 0; i < min_length; i++) {
            if(a.codePointAt(i) > b.codePointAt(i)) {
                System.out.print(a); return;
            } else if (a.codePointAt(i) < b.codePointAt(i)) {
                System.out.print(b); return;
            } else if(a.codePointAt(min_length) == b.codePointAt(min_length)) { 
                System.out.print("Hai xau bang nhau"); return; 
            }
        }
        
        
    } 
}
