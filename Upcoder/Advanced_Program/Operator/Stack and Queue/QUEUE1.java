import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Queue<Character> queue = new LinkedList<>();
        
        String str = scanner.nextLine();
        
        for(char c : str.toCharArray()) {
            if(c == '*') {
                if(!queue.isEmpty()) {
                    System.out.print(queue.peek());
                    queue.poll();
                } 
            } else { queue.add(c); }
        }
        
        scanner.close();
    }
}
