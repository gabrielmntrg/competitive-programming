import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int posit = 0;
        for (int i=0; i<6; i++){
            float x = input.nextFloat();
            
            if (x > 0){
                posit += 1;
            }
        }
        
        System.out.println(posit + " valores positivos");
    }
    
}