import java.util.Scanner;



public class LP_Atividade_01_04_2040482612015 {
   //valores que nao poderao ser alterados -> static final
    public static final int PRAZO_MAXIMO = 14;
    public static final String INSTITUICAO = "FATEC Ipiranga";
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de dias do empréstimo: ");
       //variaveis 
       final int diasEmprestimo;
       diasEmprestimo = scanner.nextInt(); 
       int diasDevolucao = calcularDevolucao (diasEmprestimo);

        System.out.println("Instituição: " + INSTITUICAO);
        System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO + " dias.");
        System.out.println("Dias calculados para devolução: " + diasDevolucao);

     

        scanner.close();
    }

    public static int calcularDevolucao(final int diasEmprestimo) {
        if(diasEmprestimo > PRAZO_MAXIMO){
            System.out.println("Atenção!!!Este prazo é maior que o permitido pela biblioteca!");
        }
        return diasEmprestimo;
        
    }

}