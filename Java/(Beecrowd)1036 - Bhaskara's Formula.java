import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double a = input.nextDouble(); double b = input.nextDouble(); double c = input.nextDouble();
        
        if (a == 0){
            System.out.println("Impossivel calcular");
        } else{
            double d = (b*b) - 4 * a * c;
            if (d < 0){
                System.out.println("Impossivel calcular");
            } else{
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println(String.format("R1 = %.5f", x1));
                System.out.println(String.format("R2 = %.5f", x2));
            }
        }
    }
    
}