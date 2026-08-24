//LPI-Atividade-N1-1-01-2040482612015

import java.util.Scanner;
public class LP_Atividade_N1_1_01_2040482612015 {
    public static void main (String args[]){
        
		//o nome solicitado como nome de arquivo e nome de public class está apenas como comentário pois é impossivel que o codigo rode sem respeitar a regra de sintaxe do java

    	//fonte https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     //https://www.w3schools.com/java/
       //variaveis  	
	byte idade; //8 bits
	short faltas; //16 bits
	int matriculaId;  //32 bits
	long codigoNac; //64 bits
	float notaTrab; //32 bits
	double notaProvaFinal; //64 bits
	char conceitoFinal; //16 bits
	boolean aprovado;  //1 bit
	
	Scanner scanner= new Scanner (System.in);
	
	System.out.println("Digite a idade: ");
    idade = scanner.nextByte();
	System.out.println("Digite o numero de faltas: ");
    faltas = scanner.nextShort();
	System.out.println("Digite o ID da matricula: ");
    matriculaId = scanner.nextInt();
	System.out.println("Digite o codigo nacional: ");
    codigoNac = scanner.nextLong();
	System.out.println("Digite a matricula do trabalho: ");
    notaTrab = scanner.nextFloat();
	System.out.println("Digite a nota da prova final: ");
    notaProvaFinal = scanner.nextDouble();
	System.out.println("Digite o conceito final: ");
    conceitoFinal = scanner.next().charAt(0);
    System.out.println("O aluno está aprovado?: ");
    aprovado = scanner.nextBoolean();
	 scanner.close();


     System.out.println("Idade do Aluno: " + idade);
     System.out.println("Número de Faltas: " + faltas);
     System.out.println("Matrícula ID: " + matriculaId);
     System.out.println("Código Nacional do Estudante: " +codigoNac);
     System.out.println("Nota do Trabalho: " + notaTrab);
     System.out.println("Nota da Prova Final: " + notaProvaFinal);
     System.out.println("Conceito Final do Aluno: " + conceitoFinal);
      
   
    if (aprovado == true)  {
			System.out.println( " Aprovado");
		} 
		else {
		 System.out.println ("reprovado");
		}

     
    
    }
}
