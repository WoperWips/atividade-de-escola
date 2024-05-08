import java.util.Scanner;

public class Aula8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas notas são necessária: ");
         double numNotas = scanner.nextDouble();

         double somaNotas = 0;
         double somaPesos = 0;

        for (int i = 1; i <= numNotas; i++){
            System.out.printf("Digite a nota d% (em %): ", i);
            double nota = scanner.nextDouble();

            System.out.printf("Digite o peso da nota %d (em %):", i);
            double peso = scanner.nextDouble();

            somaNotas += (nota * peso);
            somaPesos += peso;
        
        if (somaPesos > 100){
            System.out.println("Error: A soma não pode ser maior que 100%. Por Favor Reniciar o Progama");
            
            scanner.close();
            return;
        }

        }
            double notaFinal = (somaNotas /  somaPesos);
            System.out.printf("Nota final do aluno: %.2f\n",notaFinal);

            scanner.close();

     }    
}
