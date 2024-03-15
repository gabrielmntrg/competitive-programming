import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int code1, units1, code2, units2;
        float price1, price2, total;
        
        code1 = input.nextInt(); units1 = input.nextInt(); price1 = input.nextFloat();
        code2 = input.nextInt(); units2 = input.nextInt(); price2 = input.nextFloat();
        total = units1 * price1 + units2 * price2;
        
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }
 
}