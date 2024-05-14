import java.util.Scanner;

public class Aula10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a quantidade de alunos
        System.out.print("Quantos alunos terão suas notas calculadas? ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        for (int i = 0; i < numAlunos; i++) {
            // Solicitar o nome do aluno
            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = scanner.nextLine();

            // Solicitar a quantidade de notas
            System.out.print("Quantas notas serão inseridas para " + nomeAluno + "? ");
            int numNotas = scanner.nextInt();

            double somaNotas = 0;
            double somaPesos = 0;

            for (int j = 0; j < numNotas; j++) {
                boolean notaCorreta;

                do {
                    notaCorreta = true;

                    // Solicitar a nota
                    System.out.print("Digite a nota " + (j + 1) + ": ");
                    double nota = scanner.nextDouble();

                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
                        notaCorreta = false;
                    } else {
                        // Solicitar o peso da nota
                        System.out.print("Digite o peso da nota " + (j + 1) + ": ");
                        double peso = scanner.nextDouble();

                        // Calcular a soma das notas ponderadas e a soma dos pesos
                        somaNotas += nota * peso;
                        somaPesos += peso;
                    }

                } while (!notaCorreta);
            }

            // Calcular a média ponderada
            double mediaFinal = somaNotas / somaPesos;

            // Determinar a condição do aluno
            String condicao;
            if (mediaFinal >= 0 && mediaFinal <= 2) {
                condicao = "Reprovado";
            } else if (mediaFinal > 2 && mediaFinal <= 4.9) {
                condicao = "Substitutiva";
            } else {
                condicao = "Aprovado";
            }

            // Exibir o resultado para o aluno corrente
            System.out.println("Nome do aluno: " + nomeAluno);
            System.out.println("Média final: " + mediaFinal);
            System.out.println("Condição: " + condicao);

            // Consumir a nova linha restante do scanner
            scanner.nextLine();
        }

        scanner.close();
    }
}
