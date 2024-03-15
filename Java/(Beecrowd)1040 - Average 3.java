import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float n1, n2, n3, n4, average, finalExam;

        n1 = input.nextFloat(); n2 = input.nextFloat(); n3 = input.nextFloat(); n4 = input.nextFloat();

        average = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;

        System.out.println(String.format("Media: %.1f", average));

        if (average >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (average <= 6.9 && average >= 5.0){
            System.out.println("Aluno em exame.");
            finalExam = input.nextFloat();
            System.out.println(String.format("Nota do exame: %.1f", finalExam));
            average = (average + finalExam) / 2;
            if (average >= 5.0){
                System.out.println("Aluno aprovado.");
            } else{
                System.out.println("Aluno reprovado.");
            }
            System.out.println(String.format("Media final: %.1f", average));
        } else{
            System.out.println("Aluno reprovado.");
        }
    }
}
