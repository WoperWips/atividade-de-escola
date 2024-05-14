import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota minima necessária: ");
        double notaMinima = scanner.nextDouble();

        System.out.println("Digite a nota do aluno: ");
        double notaAluno = scanner.nextDouble();

        if ( notaAluno < notaMinima) {
            System.out.println("Aluno Reprovado.");
        } else {
            System.out.println("Aluno Aprovado.");
        }
        scanner.close();
    }
}
