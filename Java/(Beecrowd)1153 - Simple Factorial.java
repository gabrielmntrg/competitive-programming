import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int f = 1;
        int n = input.nextInt();
        
        for (int i=n; i>=1; i--){
            f *= i;
        }
        
        System.out.println(f);
    }
    
}