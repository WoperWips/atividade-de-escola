import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    System.out.print(" Quantos alunos deseja calcular a nota? ");
    int quantidadesdeAlunos = scanner.nextInt();
    scanner.nextLine();
    
    for (int i = 1; i < quantidadesdeAlunos; i++) {
        System.out.print(" Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print(" Quantas notas sera inseridas: " + nome + " ? " );
        int quantidadeNotas = scanner.nextInt();
        scanner.nextLine();

        double somanotas = 0;
        double somapesos = 0;

        for (int j = 0; j < quantidadeNotas; j++) {
            System.out.print(" Digite a nota: " );
            double nota = scanner.nextDouble();

            System.out.print("Digite o peso da nota: ");
            double peso = scanner.nextDouble();

            somanotas += nota * peso;
            somapesos += peso;
        
        double mediaFinal = somanotas / somapesos;

        System.out.println(" Alunos: " + nome);
        System.out.println(" Média final: " + mediaFinal);
}

        if (mediaFinal >= 0 && mediaFinal <= 2) {
            System.out.println(" Condição: Reprovado ");
        } else if (mediaFinal > 2 && mediaFinal <= 4.9) {
            System.out.println(" Condição: Substitutiva ");
        } else {
            System.out.println("Condição: Aprovado");
        }
        System.out.println();
    }
        scanner.close();
    }
}