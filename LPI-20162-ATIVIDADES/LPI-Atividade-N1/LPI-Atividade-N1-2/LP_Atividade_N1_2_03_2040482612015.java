import java.util.Scanner;

public class LP_Atividade_N2_03_2040482612015 {    
public static final int Pin_Certo = 1234;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int pinDigitado;
		int numeroTentativas = 0;
	
		//ao contrario do while que encerra assim que encontra o fim do looping digitado pelo usuario, o do while executa o bloco AO MENOS UMA VEZ antes de encerrar
        //nesse caso, queremos que execute no minimo 3 vezes, do while é o tipo ideal para senhas e coisas por tentativa 
		
		
		do {
			System.out.print("Informe o PIN de acesso: ");
			pinDigitado = scanner.nextInt();
			numeroTentativas++;

			if (pinDigitado != Pin_Certo) {
				System.out.println("PIN incorreto. Tente novamente.");
			}
		} while (pinDigitado != Pin_Certo);

		System.out.println("Acesso concedido! Você utilizou " + numeroTentativas + " tentativa(s).");

		scanner.close();
	}
}
