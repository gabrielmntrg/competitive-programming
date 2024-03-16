import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float n = input.nextFloat();
        
        if (n < 0.0 || n > 100) {
            System.out.println("Fora de intervalo");
        } else {
            if (n <= 25.0) {
                System.out.println("Intervalo [0,25]");
            } else if (n <= 50.0) {
                System.out.println("Intervalo (25,50]");
            } else if (n <= 75.0) {
                System.out.println("Intervalo (50,75]");
            } else {
                System.out.println("Intervalo (75,100]");
            }
        }
    }
}