import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int hours = input.nextInt();
        int velocity = input.nextInt();
        
        System.out.println(String.format("%.3f", hours*velocity / 12.0));    
    }
    
}