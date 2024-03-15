import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a, b, c, g;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        g = (a+b+Math.abs(a-b)) / 2;
        
        if (c > g){
            System.out.println(c + " eh o maior");
        } else{
            System.out.println(g + " eh o maior");
        }
        
    }
    
}