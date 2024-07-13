import java.util.Scanner ;

class Fraction {
    int numer, denom;
    
    public Fraction(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }
    
    public Fraction() {
        this(0,1);
    }
    
    public int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
    
    public void Simplify() {
        int d = GCD(this.numer,this.denom);
        this.numer /= d;
        this.denom /= d;
    }
    
    public Fraction add(Fraction f) {
        Fraction result = new Fraction();
        result.numer = this.numer * f.denom + this.denom * f.numer;
        result.denom = f.denom * this.denom;
        return result;
    }
    
    public boolean Equals(Fraction f) {
        return this.numer * f.denom == this.denom * f.numer;
    }
    
    public boolean Not_Equals(Fraction f) {
        return !this.Equals(f);
    }
    
    public String toString() {
        Simplify();
        return this.numer + "/" + this.denom;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Fraction a = new Fraction();
        a.numer = scanner.nextInt();
        a.denom = scanner.nextInt();
        
        Fraction b = new Fraction();
        b.numer = scanner.nextInt();
        b.denom = scanner.nextInt();
        
        Fraction result = a.add(b);
        
        System.out.print(result);
        
        scanner.close();
        return;
    }
}
