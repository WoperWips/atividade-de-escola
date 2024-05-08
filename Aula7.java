import java.util.Scanner;

public class Aula7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota minima necessária: ");
        double notaMinima = scanner.nextDouble();

        System.out.print("Digite a nota do aluno: ");
        double notaAluno = scanner.nextDouble();

        if ( notaAluno < notaMinima) {
            System.out.printf("Aluno Reprovado.\n",notaAluno);

        } else if (notaAluno >= notaMinima && notaAluno <= 4.9) {
            System.out.printf("Aluno precisa fazer a substitutiva.\n",notaAluno);
        } else {
            System.out.printf("Aluno Aprovado.\n",notaAluno);
        }
        scanner.close();
    }
}