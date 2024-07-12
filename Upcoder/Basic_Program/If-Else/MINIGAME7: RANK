import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int Gold_VN = scanner.nextInt();
        int Silver_VN = scanner.nextInt();
        int Bronze_VN = scanner.nextInt();
        
        int Gold_TL = scanner.nextInt();
        int Silver_TL= scanner.nextInt();
        int Bronze_TL = scanner.nextInt();
        
        int x = scanner.nextInt();
        
        if(x == 1) {
            if(Gold_VN + Silver_VN + Bronze_VN > Gold_TL + Silver_TL + Bronze_TL) System.out.print("VN");
            else if(Gold_VN + Silver_VN + Bronze_VN < Gold_TL + Silver_TL + Bronze_TL) System.out.print("TL");
            else System.out.print("TIE");
        }
        
        else if(x == 2) {
            if(Gold_VN > Gold_TL) System.out.print("VN");
            else if(Gold_VN < Gold_TL) System.out.print("TL");
            else if (Gold_VN == Gold_TL) {
                
                if(Silver_VN > Silver_TL) System.out.print("VN");
                else if(Silver_VN < Silver_TL) System.out.print("TL");
                else if (Silver_VN == Silver_TL) {
                    
                    if(Bronze_VN > Bronze_TL) System.out.print("VN");
                    else if(Bronze_VN < Bronze_TL) System.out.print("TL");
                    else if (Bronze_VN == Bronze_TL) System.out.print("TIE");
                }
            }
        }
        
        scanner.close();

    }
}
