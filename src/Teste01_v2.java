import java.util.Scanner;

public class Teste01_v2 {

	public static void main(String[] args) {
		
		System.out.println("-------------- DESAFIO 01 --------------");
		System.out.println();
		System.out.println("--------- PALAVRAS PAL�NDROMOS ---------");
		System.out.println();
		
		//Declara��o da String utilizada
		String p1;
		
		//Scanner para ler a entrada do usu�rio
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a palavra desejada: ");
		
		//Foram utilizadar as fun��es TRIM para remover espa�os antes, TOUPPERCASE para colocar tudo em mai�sculo e REPLACEALL para remover os espa�os entre as strings
		p1 = ler.nextLine().trim().toUpperCase().replaceAll(" ", "");
		
		//Variaveis criadas para pegar o tamanho da string
		Integer l1 = p1.length();
		Integer cont = l1;
		
		//Vari�vel usada para test dentro do la�o
		int test = 0;
		
		//Ir� percorrer a string do inicio at� a metade
		for(int x = 0; x < l1/2; x++) {
			char var1 = p1.charAt(x);
			//Ir� pegar a stringo ao inverso (de tras pra frente)
			char var2 = p1.charAt(cont-1);
			
			//Compara se as duas string s�o iguais
			if(var1 != var2) {
				System.out.println("A palavra "+p1+" n�o � pal�ndromo");
				//Somar 1 caso tenha uma letra diferente
				test ++;
				break;
			}
			//Decremento para percorrer a string ao contr�rio
			cont --;
		}
		
		//Verifica se o test == 0, se for quer dizer que ele n�o teve nenhuma string diferente
		if(test == 0) {
			System.out.println("A palavra "+p1+" � pal�ndromo");
		}
	}
}
