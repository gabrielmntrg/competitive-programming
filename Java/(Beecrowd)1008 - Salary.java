import java.util.Scanner;
 
public class Main{
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int employeeNumber = input.nextInt();
        int workedHours = input.nextInt();
        float receivePerHour = input.nextFloat();
        float salary = workedHours * receivePerHour;
        
        System.out.println("NUMBER = " + employeeNumber);
        System.out.println(String.format("SALARY = U$ %.2f", salary));
    }
 
}