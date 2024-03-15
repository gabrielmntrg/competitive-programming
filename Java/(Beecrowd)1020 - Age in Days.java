import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int agd = input.nextInt();
        
        System.out.println(String.format("%d ano(s)", agd / 365));
        agd = agd % 365;
        System.out.println(String.format("%d mes(es)", agd / 30));
        agd = agd % 30;
        System.out.println(String.format("%d dia(s)", agd));
    }
    
}