import java.util.Scanner;

public class Aula10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos terão suas notas calculadas? ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numAlunos; i++) {
            boolean dadosCorretos;

            do {
                dadosCorretos = true;
                System.out.print("Digite o nome do aluno: ");
                String nomeAluno = scanner.nextLine();

                System.out.print("Quantas notas serão inseridas para " + nomeAluno + "? ");
                int numNotas = scanner.nextInt();

                double somaNotas = 0;
                double somaPesos = 0;

                for (int j = 0; j < numNotas; j++) {
                    System.out.print("Digite a nota " + (j + 1) + ": ");
                    double nota = scanner.nextDouble();

                    System.out.print("Digite o peso da nota " + (j + 1) + ": ");
                    double peso = scanner.nextDouble();

                    somaNotas += nota * peso;
                    somaPesos += peso;
                }

                double mediaFinal = somaNotas / somaPesos;
                
                String condicao;
                if (mediaFinal >= 0 && mediaFinal <= 2) {
                    condicao = "Reprovado";
                } else if (mediaFinal > 2 && mediaFinal <= 4.9) {
                    condicao = "Substitutiva";
                } else {
                    condicao = "Aprovado";
                }

                System.out.println("Nome do aluno: " + nomeAluno);
                System.out.println("Média final: " + mediaFinal);
                System.out.println("Condição: " + condicao);

                scanner.nextLine();

                System.out.print("Deseja reinserir os dados para este aluno? (s/n): ");
                String resposta = scanner.nextLine();

                if (resposta.equalsIgnoreCase("s")) {
                    dadosCorretos = false;
                }

            } while (!dadosCorretos);
        }

        scanner.close();
    }
}
