import java.util.Scanner;

public class LP_Atividade_N1_1_09_2040482612015 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double nFinal;

		System.out.print("Informe a nota final do aluno: ");
		 nFinal = scanner.nextDouble();
		

		System.out.println("--- Abordagem 1: Estrutura Condicional Tradicional (if-else) ---");
		if (nFinal >= 6.0) {
			System.out.println("Situação (if-else): Aprovado");
		} else {
			System.out.println("Situação (if-else): Reprovado");
		}
		System.out.println();

		String operadorTernario = (nFinal >= 6.0) ? "Aprovado" : "Reprovado";
		System.out.println("--- Abordagem 2: Operador Ternário Simples ---");
		System.out.println("Situação (Ternário): " + operadorTernario);

		scanner.close();
		
	}
}  

