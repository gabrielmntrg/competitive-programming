import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double value = input.nextDouble();
        int notes, coins;
        
        System.out.println("NOTAS:");
        notes = (int)value / 100;
        value = value % 100;
        System.out.println(notes + " nota(s) de R$ 100.00");
        notes = (int)value / 50;
        value = value % 50;
        System.out.println(notes + " nota(s) de R$ 50.00");
        notes = (int)value / 20;
        value = value % 20;
        System.out.println(notes + " nota(s) de R$ 20.00");
        notes = (int)value / 10;
        value = value % 10;
        System.out.println(notes + " nota(s) de R$ 10.00");
        notes = (int)value / 5;
        value = value % 5;
        System.out.println(notes + " nota(s) de R$ 5.00");
        notes = (int)value / 2;
        value = value % 2;
        System.out.println(notes + " nota(s) de R$ 2.00");
    
        System.out.println("MOEDAS:");
        coins = (int) value / 1;
        value = value % 1;
        System.out.println(coins + " moeda(s) de R$ 1.00");
        coins = (int) (value / 0.50);
        value = value % 0.50;
        System.out.println(coins + " moeda(s) de R$ 0.50");
        coins = (int) (value / 0.25);
        value = value % 0.25;
        System.out.println(coins + " moeda(s) de R$ 0.25");
        coins = (int) (value / 0.10);
        value = value % 0.10;
        System.out.println(coins + " moeda(s) de R$ 0.10");
        coins = (int) (value / 0.05);
        value = value % 0.05;
        System.out.println(coins + " moeda(s) de R$ 0.05");
        coins = (int) (value / 0.01 + 0.001);
        System.out.println(coins + " moeda(s) de R$ 0.01");
    }
    
}