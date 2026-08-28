import java.util.Scanner;
public class LP_Atividade_N1_3_01_2040482612015 {
	public static void main (String args[]) {
		Scanner scanner = new Scanner( System.in);

		int quantidadeLeituras;
		double temperaturaCritica;
		System.out.print("Quantidade de leituras: ");
		quantidadeLeituras = scanner.nextInt();

		double[] vetor = new double [quantidadeLeituras];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Temperatura (°C): ");
			vetor[i] = scanner.nextDouble();

		}
		System.out.println ("-- Leituras Registradas --");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Leitura [" + i + "]: " + vetor[i] + "°C" );
		}

		System.out.println ("-- Acesso Direto --");
		System.out.println ("Primeira leitura (indice 0): " + vetor [0] + "°C");
		System.out.println ("Ultima leitura (indice " + (vetor.length - 1) + "): " + vetor[vetor.length - 1] + "°C");

		System.out.println("-- Busca Linear: Extremos --");

		double maiorTemperatura = vetor[0];
		int indiceMaior = 0;
		double menorTemperatura = vetor[0];
		int indiceMenor = 0;
		for (int i = 1; i < vetor.length; i++) {

			if (vetor[i] > maiorTemperatura) {
				maiorTemperatura = vetor[i];
				indiceMaior = i;

			}
			if (vetor[i] < menorTemperatura) {
				menorTemperatura = vetor[i];
				indiceMenor = i;
			}

		}
		System.out.println("Maior temperatura: " + maiorTemperatura + "°C (indice " + indiceMaior + ")" );
		System.out.println("Menor temperatura: " + menorTemperatura +"°C (indice " + indiceMenor + ")" );
		System.out.print("Temperatura crítica de alerta (°C): ");
		temperaturaCritica = scanner.nextDouble();
		System.out.println("-- Busca Linear: Alerta --");

		int indiceDeAlerta = -1;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] >= temperaturaCritica) {
				indiceDeAlerta = i;
				break;
			}
		}

		if (indiceDeAlerta == -1) {
			System.out.println("Nenhuma leitura atingiu ou ultrapassou a temperatura critica informada.");
		} else {
			System.out.println("Alerta: temperatura critica atingida na leitura de indice " + indiceDeAlerta + " (" + vetor[indiceDeAlerta] + "°C).");
            scanner.close();
		}
	}
}




