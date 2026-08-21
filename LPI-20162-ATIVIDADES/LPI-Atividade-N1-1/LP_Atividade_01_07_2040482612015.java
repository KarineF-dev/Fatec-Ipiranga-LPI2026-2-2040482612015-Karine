
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class LP_Atividade_01_07_2040482612015 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String valorA;
		String valorB;
		String valorCompra;
		int numeroParcelas;
		double valorAdb;
		double valorBdb;
		double resultadoQuebrado;


		System.out.print ("Informe o valor de  A (ex.: 1.00): ");
		valorA = scanner.nextLine();

		System.out.print ( " Informe o valor B (ex.: 0.90): ");
		valorB = scanner.nextLine();


		//teste mostrando a necessidade de converter String para double para entao mostrar o erro 

		valorAdb = Double.parseDouble(valorA);
		valorBdb = Double.parseDouble(valorB);

		resultadoQuebrado= valorAdb - valorBdb;

		System.out.println ( "--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---");
		System.out.println ( "Resultado esperado de " + valorA + " - " + valorB + " seria 0.10");
		System.out.println ( "Resultado real obtido com double: " + resultadoQuebrado);

		//Segunda parte, agora mostrando como funciona com o objeto BigDecimal
		//Surge a necessidade de se criar variaveis diferentes para usarmos espaços diferentes na memória, por isso não reutilizaremos as variaveis valorAdb e valorBdb
		//
		BigDecimal valorABigD= new BigDecimal(valorA);
		BigDecimal valorBBigD= new BigDecimal(valorB);
		
		//com big BigDecimal a subtração funciona usando .subtract pois  sinais como -, +, /, % etc funcionam apenas com operações entre tipos primitivos
		BigDecimal resultadoCorreto = valorABigD.subtract(valorBBigD);
		System.out.println("--- Correção exata utilizando java.math.BigDecimal ---");
		
		System.out.println("Resultado com BigDecimal (String Constructor): " + resultadoCorreto);

		System.out.print("Informe o valor total da compra: ");
		valorCompra = scanner.nextLine();

		System.out.print("Informe o número de parcelas: ");
		numeroParcelas = scanner.nextInt();
BigDecimal numeroParcelasBigD =new BigDecimal(numeroParcelas);
		BigDecimal valorCompraBigD = new BigDecimal(valorCompra);
		BigDecimal valorParcela = valorCompraBigD.divide(numeroParcelasBigD, 2, RoundingMode.HALF_UP); 
		

		System.out.println("--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
		System.out.println("Compra de R$ " + valorCompra + " dividida em " + numeroParcelas + "x: R$ " + valorParcela + " por parcela.");

		scanner.close();
	}
}