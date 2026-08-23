import java.util.Scanner;

public class LP_Atividade_N1_1_10_2040482612015 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double d;
		double media;
		double presenca;
		double semParenteses;
		double comParenteses;
		boolean aprovadoDireto;

		System.out.print("Informe o valor de A: ");
		a = scanner.nextDouble();
		System.out.print("Informe o valor de B: ");
		b = scanner.nextDouble();
		System.out.print("Informe o valor de C: ");
		c = scanner.nextDouble();
		System.out.print("Informe o valor de D: ");
		d = scanner.nextDouble();
		System.out.print("Informe a média do aluno: ");
		media = scanner.nextDouble();
		System.out.print("Informe o percentual de presença: ");
		presenca = scanner.nextDouble();
		

		semParenteses = a + b * c / d - 1.5;
		comParenteses = a + ((b * c) / d) - 1.5;

		System.out.println("--- Demonstração de Precedência Aritmética ---");
		System.out.println("Resultado Sem parênteses: " + semParenteses);
		System.out.println("Resultado Com parênteses explícitos: " + comParenteses);
		System.out.println("Nota: Ambos dão o mesmo resultado pela precedência natural (*, / depois +), mas a segunda forma é mais legível.");
		System.out.println();

		aprovadoDireto = (media >= 6.0) && (presenca >= 75.0);

		System.out.println("--- Validação do Critério de Aprovação ---");
		System.out.println("Entrada -> Média: " + media + " | Presença: " + presenca + "%");
		System.out.println("Resultado da avaliação (aprovadoDireto): " + aprovadoDireto);

		scanner.close();
	}
}