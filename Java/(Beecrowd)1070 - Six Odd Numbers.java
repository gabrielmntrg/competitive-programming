import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int odds = 0;
        
        while (odds < 6){
            if (x % 2 != 0){
                System.out.println(x);
                odds += 1;
            }
            x += 1;
        }
    }
    
}