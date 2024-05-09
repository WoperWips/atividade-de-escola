import java.util.Scanner;

public class aula8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas notas sao necessária: ");
         int numNotas = scanner.nextInt();

         double somaNotas = 0;
         double somaPesos = 0;

        for (int i = 1; i <= numNotas; i++){
            System.out.println("Digite as notas:");
            double nota = scanner.nextDouble();

            System.out.println("Digite os pesos das notas: ");
            double peso = scanner.nextDouble();

            somaNotas += (nota * peso);
            somaPesos += peso;
        
            if (somaPesos > 100){
                System.out.println("Error: A soma não pode ser maior que 100%. Por Favor Reniciar o Progama" );
                
                scanner.close();
                return;
            }

        }

        double notaFinal = (somaNotas / somaPesos );
        System.out.println("A nota final e:"  + notaFinal);

        

        scanner.close();

     }    
}
