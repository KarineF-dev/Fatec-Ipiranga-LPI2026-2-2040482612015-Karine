 import java.util.Scanner;

public class LP_Atividade_01_06_2040482612015 {
 

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String texto;
        boolean valido; 


        System.out.print("Informe o nome de usuário: ");
        texto = scanner.nextLine();

    
        
        valido = texto != null && texto.length() > 0; // O Uso do &&  --> (curto-circuito): se "texto != null" já  der false, o java já para antes de avaliar se texto.length() > 0

        if (valido) {
            System.out.println("Usuário válido fornecido: " + texto);
        } else {
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
        }

    

        scanner.close();
    }
}

// Se  caso nós usássemos  &  no lugar do && o java sempre avaliaria os dois lados da expressão, mesmo q "texto != null" já tivesse dado false. Isso significa que ele geraria um NullPointerException
