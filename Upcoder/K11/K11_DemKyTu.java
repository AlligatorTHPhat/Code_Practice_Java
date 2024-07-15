import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine(); 
        String c = scanner.nextLine();
        
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c.charAt(0)) {
                count++;
            }
        }
        System.out.print(count);
    } 
}
