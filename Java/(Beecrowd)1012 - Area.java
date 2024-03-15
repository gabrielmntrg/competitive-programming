import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        System.out.println(String.format("TRIANGULO: %.3f", (a*c) / 2));
        System.out.println(String.format("CIRCULO: %.3f", 3.14159 * (c*c)));
        System.out.println(String.format("TRAPEZIO: %.3f", ((a+b)*c) / 2));
        System.out.println(String.format("QUADRADO: %.3f", b*b));
        System.out.println(String.format("RETANGULO: %.3f", a*b));
    }
    
}