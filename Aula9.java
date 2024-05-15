import java.util.Scanner;

public class Aula9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos você deseja? ");
        int numeroDeAlunos = scanner.nextInt();

        for (int i = 0; i < numeroDeAlunos; i++) {
            scanner.nextLine();

            System.out.print("Digite o nome do aluno: ");
            String nomeDoAluno = scanner.nextLine();

            System.out.print("Digite a nota mínima para aprovação: ");
            double notaMinima = scanner.nextDouble();

            System.out.print("Quantas notas o aluno tem? ");
            int numeroDeNotas = scanner.nextInt();

            double somaDasNotas = 0;
            double somaDosPesos = 0;

            for (int j = 0; j < numeroDeNotas; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                double nota = scanner.nextDouble();

                System.out.print("Digite o peso da nota " + (j + 1) + ": ");
                double peso = scanner.nextDouble();

                somaDasNotas += nota * peso;
                somaDosPesos += peso;
            }

            double media = somaDasNotas / somaDosPesos;
            System.out.println("A média do aluno " + nomeDoAluno + " é: " + media);

            if (media >= notaMinima) {
                System.out.println("O aluno " + nomeDoAluno + " está aprovado.");
            } else {
                System.out.println("O aluno " + nomeDoAluno + " está reprovado.");
            }
        }

        scanner.close();
    }
}