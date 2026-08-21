import java.util.Scanner;


public class LP_Atividade_N2_02_2040482612015 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double valorVenda;
		double vendidoTotal = 0;
		int qtdVendas = 0;
		double mediaVenda;
		
		System.out.print("Valor da venda (ou 0 para encerrar): ");
		valorVenda = scanner.nextDouble();


        // Ao contrario do for, onde temos o numero de repetições definido, utilizamos o while quando nao temos um numero definido de repetições
        //Neste caso, a repetição ocorrerá enquanto o usuario não digitar 0 ------> como na linha "valorVenda != 0 ", quando o usuario digitar 0, o programa encerrará imediatamente 

		while (valorVenda != 0) {
			vendidoTotal+= valorVenda;
			qtdVendas++;

			System.out.print("Valor da venda (ou 0 para encerrar): ");
			valorVenda = scanner.nextDouble();
		}

		if (qtdVendas > 0) {
			mediaVenda = vendidoTotal / qtdVendas;
			System.out.println("Total vendido no turno: R$ " + vendidoTotal);
			System.out.println("Quantidade de vendas: " + qtdVendas);
			System.out.printf("Valor médio por venda: R$ %.2f%n", mediaVenda);
		} else {
			System.out.println("Nenhuma venda registrada nesta sessão de caixa.");
		}

		scanner.close();
	}
}
