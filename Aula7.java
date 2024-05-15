import java.util.Scanner;

public class Aula7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual é a média mínima: ");
        double mediaMinima = scanner.nextDouble();

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 0 && nota < mediaMinima) {
            if (nota <= 2) {
                System.out.println("Aluno está reprovado.");
            } else if (nota > 2 && nota <= 4.9) {
                System.out.println("Aluno precisa fazer substitutiva.");
            } else {
                System.out.println("Aluno está reprovado.");
            }
        } else if (nota >= mediaMinima && nota <= 10) {
            System.out.println("Aluno está aprovado.");
        } else {
            System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
        }

        scanner.close();
    }
}
