import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double r = input.nextDouble();
        double v = (4.0/3.0) * 3.14159 * (r*r*r);
        
        System.out.println(String.format("VOLUME = %.3f", v));
    }
    
}