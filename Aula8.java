import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas notas são necessárias: ");
        int numNotas = scanner.nextInt();

        double somaNotas = 0;
        double somaPesos = 0;

        for (int i = 1; i <= numNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();

            System.out.print("Digite o peso da nota " + i + ": ");
            double peso = scanner.nextDouble();

            somaNotas += (nota * peso);
            somaPesos += peso;

            if (somaPesos > 100) {
                System.out.println("Erro: A soma dos pesos não pode ser maior que 100%. Por favor, reinicie o programa.");
                scanner.close();
                return;
            }
            
        double notaFinal = somaNotas / somaPesos;
        System.out.println("A nota final é: " + notaFinal);

        System.out.print("Qual é a média mínima: ");
        double mediaMinima = scanner.nextDouble();

        if (notaFinal >= 0 && notaFinal <= 10) {
            if (notaFinal < 2) {
                System.out.println("Aluno está reprovado.");
            } else if (notaFinal >= 2 && notaFinal <= 4.9) {
                System.out.println("Aluno precisa fazer substitutiva.");
            } else if (notaFinal >= 5 && notaFinal < mediaMinima) {
                System.out.println("Aluno está reprovado.");
            } else if (notaFinal >= mediaMinima) {
                System.out.println("Aluno está aprovado.");
            }
        } else {
            System.out.println("Nota inválida. Por favor, digite notas e pesos válidos.");
        }

        scanner.close();
    }
}
}
