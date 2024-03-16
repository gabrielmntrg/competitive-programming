import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float area = ((a + b) * c) / 2;

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println(String.format("Perimetro = %.1f", a + b + c));
        } else {
            System.out.println(String.format("Area = %.1f", area));
        }
    }
}
