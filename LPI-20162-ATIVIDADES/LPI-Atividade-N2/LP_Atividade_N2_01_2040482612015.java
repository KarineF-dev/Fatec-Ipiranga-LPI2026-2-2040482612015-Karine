import java.util.Scanner;

public class LP_Atividade_N2_01_2040482612015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int quantidadeAlunos;
        double nota;
        double somaTotal = 0;
        double maiorNota = 0;

        System.out.print("Quantidade de alunos na turma: ");
        quantidadeAlunos = scanner.nextInt();


        //Nesse caso, o mais correto é o uso do for pq já sabemos a quantidade de repetições necessarias
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nota do aluno: ");
            nota = scanner.nextDouble();

            somaTotal += nota;
            if (nota > maiorNota) {
                maiorNota = nota;}
            
      

        double media = somaTotal / quantidadeAlunos;

        System.out.println("Soma total das notas: " + somaTotal);
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota da turma: " + maiorNota);

        scanner.close();
    }
}}