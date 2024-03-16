import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int[] array = {a, b, c};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i] < array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}