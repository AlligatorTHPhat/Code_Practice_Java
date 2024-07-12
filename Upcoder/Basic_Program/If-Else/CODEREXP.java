import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int basic = scanner.nextInt();
        int normal = scanner.nextInt();
        int advanced = scanner.nextInt();
        int hard = scanner.nextInt();
        
        int point = (basic*10) + (normal*20) + (advanced*30) + (hard*40); 
        
        if(point < 1) System.out.print(point + "\nCoder So Sinh");
        else if(point < 49) System.out.print(point + "\nCoder Lop Mam");
        else if(point < 99) System.out.print(point + "\nCoder Lop Choi");
        else if(point < 499) System.out.print(point + "\nCoder Lop La");
        else if(point < 999) System.out.print(point + "\nCoder Tieu Hoc");
        else if(point < 1499) System.out.print(point + "\nCoder THCS");
        else if(point < 1999) System.out.print(point + "\nCoder THPT");
        else if(point < 2499) System.out.print(point + "\nCoder Trung Cap");
        else if(point < 3499) System.out.print(point + "\nCoder Cao Dang");
        else if(point < 4199) System.out.print(point + "\nCoder Dai Hoc");
        else if(point < 5499) System.out.print(point + "\nCoder Thac Si");
        else if(point < 6999) System.out.print(point + "\nCoder Tien Si");
        else if(point >= 7000) System.out.print(point + "\nCoder Giao Su");
        
                scanner.close();

    }
}
