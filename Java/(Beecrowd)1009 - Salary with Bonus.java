import java.util.Scanner;    

public class Main{
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
        double salary = input.nextDouble();
        double sellers = input.nextDouble();
        double total = salary + 0.15 * sellers;
        
        System.out.println(String.format("TOTAL = R$ %.2f", total));
        
    }
 
}