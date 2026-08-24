[LP_Atividade_01_03_2040482612015.java]
import java.util.Scanner;

//https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
//https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
public class LP_Atividade_01_03_2040482612015 {
    public static void main (String args[]){
        Scanner scanner = new Scanner (System.in);

        Integer idade = null; 
        int novaIdade = scanner.nextInt();
        int proximoAno;
        int proximoAnoValido;

       
      System.out.println("Tentando realizar operação aritmética com Integer nulo...");
      
try {
    proximoAno = idade + 1; 
    System.out.println("Idade no próximo ano: " + proximoAno);
}
 catch (NullPointerException e) {
    System.out.println("Erro Capturado com sucesso: Não foi possível calcular porque a idade não foi informada (null).");
    System.out.println("Detalhe da exceção: " + e);
}


    System.out.print ("Informe uma idade válida: ");
    novaIdade = scanner.nextInt();
    System.out.println("Reatribuindo valor válido para a variável...");

    idade = novaIdade;  
    proximoAnoValido = idade + 1;
System.out.println("Operação bem-sucedida! Idade atual: " + idade + " | Idade no próximo ano: " + proximoAnoValido);

scanner.close();

    }
}
