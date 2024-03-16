import java.util.Scanner;

public class Main {
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        int y = input.nextInt();
        float total = 0;
        
        switch (x) {
            case 1:
                total = (float) 4 * y;
                break;
            case 2:
                total = (float) 4.5 * y;
                break;
            case 3:
                total = (float) 5 * y;
                break;
            case 4:
                total = (float) 2 * y;
                break;
            case 5:
                total = (float) 1.5 * y;
                break;
        }
        
        System.out.println(String.format("Total: R$ %.2f", total));
    }
}