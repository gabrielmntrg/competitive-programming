import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h, m, s;
        
        s = input.nextInt();
        h = s / 3600;
        s = s % 3600;
        
        m = s / 60;
        s = s % 60;
        
        System.out.println(String.format("%d:%d:%d", h, m, s));
    }
    
}