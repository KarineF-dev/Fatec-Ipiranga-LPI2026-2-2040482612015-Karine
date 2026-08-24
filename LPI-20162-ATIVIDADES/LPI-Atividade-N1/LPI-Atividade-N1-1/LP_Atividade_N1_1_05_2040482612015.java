import java.util.Scanner;

public class LP_Atividade_01_05_2040482612015 {
	public static void main (String args[]) {
		Scanner scanner= new Scanner(System.in);

		//variaveis
		int estoque;
		int qtdEntrada;
		int qtdSaida1;
		int qtdSaida2;
		int estoqueMinimo;
		int tamanhoLote;
		int resto;
		boolean resto2;

		System.out.println ("Informe o estoque inicial");
		estoque = scanner.nextInt();
		System.out.println ("Estoque inicial: " + estoque + " unidades.");

		System.out.println ("Quantidade de entrada: ");
		qtdEntrada =scanner.nextInt();
		estoque += qtdEntrada;
		System.out.println ("Após entrada (+" + qtdEntrada + "): " + estoque + " unidades.");


		System.out.print ("Quantidade de saída 1: ");
		qtdSaida1 = scanner.nextInt();
		estoque -= qtdSaida1;
		System.out.println ("Após saída (-" + qtdSaida1 + "): " + estoque + " unidades.");

		System.out.print ("Quantidade de saída 2: ");
		qtdSaida2 = scanner.nextInt();
		estoque -= qtdSaida2;
		System.out.println ("Após outra saída (-" + qtdSaida2 + "): " + estoque + " unidades.");


		System.out.print ("Estoque mínimo: ");
		estoqueMinimo = scanner.nextInt();
		System.out.print("O nível de estoque atual (" + estoque + ") está abaixo do mínimo (" + estoqueMinimo + ")? ");
		System.out.println(estoque < estoqueMinimo);

		System.out.print ("Tamanho do lote (caixa): ");
		tamanhoLote = scanner.nextInt();
		resto = estoque % tamanhoLote ;
		System.out.println ("Unidades fora de caixas fechadas de 12: " + resto);

		resto2 = resto == 0 ;

		System.out.println("O estoque está perfeitamente fracionado em caixas completas? " + resto2 );

	}
}
