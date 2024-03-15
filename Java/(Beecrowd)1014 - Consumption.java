import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        float y = input.nextFloat();
        
        System.out.println(String.format("%.3f km/l", x/y));
    }
    
}