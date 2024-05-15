import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 0 && nota <= 2) {
            System.out.println("Aluno está reprovado.");
        } else if (nota > 2 && nota <= 4.9) {
            System.out.println("Aluno precisa fazer substitutiva.");
        } else if (nota > 4.9) {
            System.out.println("Aluno está aprovado.");
        } else {
            System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
        }

        scanner.close();
    }
}