import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos você deseja cadastrar? ");
        int numeroDeAlunos = scanner.nextInt();

        for (int i = 0; i < numeroDeAlunos; i++) {
            scanner.nextLine();

            System.out.print("Digite o nome do aluno: ");
            String nomeDoAluno = scanner.nextLine();

            System.out.print("Digite a nota mínima para aprovação: ");
            double notaMinima = scanner.nextDouble();

            double media;

            do {
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

                media = somaDasNotas / somaDosPesos;
                System.out.println("A média do aluno " + nomeDoAluno + " é: " + media);

                System.out.print("As notas e pesos estão corretos? (s/n): ");
                scanner.nextLine();
                String resposta = scanner.nextLine();

                if (resposta.equalsIgnoreCase("s")) {
                    break;
                } else {
                    System.out.println("Digite novamente as notas e pesos.");
                }

            } while (true);

            if (media >= notaMinima) {
                System.out.println("O aluno " + nomeDoAluno + " está aprovado.");
            } else {
                System.out.println("O aluno " + nomeDoAluno + " está reprovado.");
            }
        }

        scanner.close();
    }
}
