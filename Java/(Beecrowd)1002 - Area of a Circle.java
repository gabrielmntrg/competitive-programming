import java.util.Scanner;

public class Main{
    
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        
        double pi = 3.14159;
        double r, a;
        
        r = input.nextDouble();
        a = pi*(r*r);
        
        System.out.println(String.format("A=%.4f", a));
    }
    
}