import java.util.Scanner;

public class Aula6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Nota Minima Necessaria: ");
        double notaMinima = scanner.nextDouble();

        System.out.println("Digite a Nota do Aluno: ");
        double notaAluno = scanner.nextDouble();
        
        if (notaAluno < notaMinima);{
            System.out.printf("A nota do aluno é %, 2f, que é menor que nota minima necessaria./n",notaAluno);
        }
    
        scanner.close();
        
        
    }

}
