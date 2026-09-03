/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*
* Disciplina : Linguagem de Programacao I *
* Prof . Veríssimo *
* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*
* Objetivo do Programa : Xeque-Pastor  *
* Treinar o conceito de matrizes bidimensionais 8x8  *
* Data - 02 / 08 / 2026 *
* Autor : Karine Cristina de Figueiredo  *
* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -*/


/* Abaixo a simulação da sequencia de lances do Xeque-Pastor utilizando uma matriz
 bidimensional (8x8) para representar o tabuleiro de xadrez.

 Para representar  cada casa usaremos 3 caracteres:
   1o caractere  = tipo da peça   (T/t torre, C/c cavalo, B/b bispo,
                                 D dama, R rei, P peao)
  
  2o caractere  = cor da peça    (B brancas e P pretas)
  3o caractere  = numero da coluna de origem da peça (1 = a ..... 8 = h)

 A casa de onde a peça sair passará a exibir a marca "..." e as casas que
 não foram  ocupadas nenhuma vez permanecerão em branco.
*/


public class LP_Atividade_N1_4_01_2040482612015 {
	//tabuleiro
	private static final int TAMANHO_TABULEIRO = 8;

	//casa que nunca foi ocupada
	private static final String CASA_VAZIA = "   ";

	//marca que ficará no local em que a peça que foi movimentada se encontrava anteriormente
	private static final String MARCA_ORIGEM = "...";

	// primeira coluna do tabuleiro
	private static final char PRIMEIRA_COLUNA = 'a';

	// separadores visuais usados
	private static final String LINHA_DUPLA = "==========================================";
	private static final String LINHA_SIMPLES = "----------";




		public static void main(String[] args) {
		String[][] tabuleiro = inicializarTabuleiro();

		exibirTitulo("Posicao Inicial do tabuleiro");
		exibirTabuleiro(tabuleiro);

		exibirTitulo("Jogada #1");
		executarLance(tabuleiro, "Brancas jogam e4",  "e2", "e4");
		executarLance(tabuleiro, "Pretas jogam e5",   "e7", "e5");

		exibirTitulo("Jogada #2");
		executarLance(tabuleiro, "Brancas jogam Bc4", "f1", "c4");
		executarLance(tabuleiro, "Pretas jogam Cc6",  "b8", "c6");

		exibirTitulo("Jogada #3");
		executarLance(tabuleiro, "Brancas jogam Dh5", "d1", "h5");
		executarLance(tabuleiro, "Pretas jogam Cf6",  "g8", "f6");

		exibirTitulo("Jogada #4 (Xeque Mate)");
		executarLanceFinal(tabuleiro, "h5", "f7");
	}

	private static String[][] inicializarTabuleiro() {

		String[] pecasPretas  = {"tP1", "cP2", "bP3", "dP4", "rP5", "bP6", "cP7", "tP8"};
		String[] pecasBrancas = {"TB1", "CB2", "BB3", "DB4", "RB5", "BB6", "CB7", "TB8"};

		String[][] tabuleiro = new String[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

		// Aqui as fileiras com peças>>> 7 e 8 das pretas /  1 e 2 das brancas
		for (int col = 0; col < TAMANHO_TABULEIRO; col++) {
			tabuleiro[0][col] = pecasPretas[col];    // fileira 8
			tabuleiro[1][col] = "PP" + (col + 1);    // fileira 7
			tabuleiro[6][col] = "PB" + (col + 1);    // fileira 2
			tabuleiro[7][col] = pecasBrancas[col];   // fileira 1
		}

		// Fileiras do 6 a 3 começam sem nenhuma peça
		for (int fileira = 3; fileira <= 6; fileira++) {
			for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
				tabuleiro[TAMANHO_TABULEIRO - fileira][coluna] = CASA_VAZIA;
			}
		}

		return tabuleiro;
	}

	private static void exibirTabuleiro(String[][] tabuleiro) {
	    System.out.println("  -a- -b- -c- -d- -e- -f- -g- -h-");  //ilustrando as colunas
		for (int linha = 0; linha < TAMANHO_TABULEIRO; linha++) {
			System.out.print((TAMANHO_TABULEIRO - linha) + " ");
			for (int coluna = 0; coluna < TAMANHO_TABULEIRO; coluna++) {
				System.out.print(tabuleiro[linha][coluna] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	private static void exibirTitulo(String titulo) {
		System.out.println(LINHA_DUPLA);
		System.out.println("        " + titulo);
		System.out.println(LINHA_DUPLA);
	}
	private static int obterIndiceLinha(String casa) {
		int fileira = Character.getNumericValue(casa.charAt(1));
		return TAMANHO_TABULEIRO - fileira;
	}

	private static int obterIndiceColuna(String casa) {
		return casa.charAt(0) - PRIMEIRA_COLUNA;
	}

	private static void moverPeca(String[][] tabuleiro, String origem, String destino) {
		int linhaOrigem   = obterIndiceLinha(origem);
		int colunaOrigem  = obterIndiceColuna(origem);
		int linhaDestino  = obterIndiceLinha(destino);
		int colunaDestino = obterIndiceColuna(destino);

		tabuleiro[linhaDestino][colunaDestino] = tabuleiro[linhaOrigem][colunaOrigem];
		tabuleiro[linhaOrigem][colunaOrigem] = MARCA_ORIGEM;


	}
	private static void executarLance(String[][] tabuleiro, String descricao,
	                                  String origem, String destino) {
		String peca = tabuleiro[obterIndiceLinha(origem)][obterIndiceColuna(origem)];
		System.out.println(LINHA_SIMPLES + descricao + LINHA_SIMPLES);
		System.out.println("Posicao origem: " + MARCA_ORIGEM + "     Posicao final: " + peca);
		moverPeca(tabuleiro, origem, destino);
		exibirTabuleiro(tabuleiro);

	}

	private static void executarLanceFinal(String[][] tabuleiro, String origem, String destino) {
		String peaoCapturado = tabuleiro[obterIndiceLinha(destino)][obterIndiceColuna(destino)];

		System.out.println(LINHA_SIMPLES + "Brancas capturam Peao " + peaoCapturado
		                   + " em " + destino + " e Xeque MATE (Dxf7#)" + LINHA_SIMPLES);

		moverPeca(tabuleiro, origem, destino);
		exibirTabuleiro(tabuleiro);



	}
}
