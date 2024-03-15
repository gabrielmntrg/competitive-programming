import java.util.Scanner;

public class Main{
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int oddsSum, odds;
        int n = input.nextInt();
        
        for (int i=0; i<n; i++){
            int x = input.nextInt(); int y = input.nextInt();
            
            oddsSum = 0;
            odds = 0;
            while (odds < y){
                if (x % 2 != 0){
                    oddsSum += x;
                    odds += 1;
                }
                x += 1;
            }
            System.out.println(oddsSum);
        }
        
    }
    
}