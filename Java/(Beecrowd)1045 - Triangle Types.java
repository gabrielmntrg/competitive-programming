import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double array[] = {a, b, c};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i] > array[j]) {
                    double aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        a = array[0];
        b = array[1];
        c = array[2];

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}