import java.util.Scanner;

//Desenvolvido por Caio Marinho Coelho
public class palindroV2 {

	public static void main(String[] args) {
		
		System.out.println("-------------- DESAFIO 01 --------------");
		System.out.println();
		System.out.println("--------- PALAVRAS PALÍNDROMOS ---------");
		System.out.println();
		
		//Declaração da String utilizada
		String p1;
		
		//Scanner para ler a entrada do usuário
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a palavra/string desejada: ");
		
		//Foram utilizadar as funções TRIM para remover espaços antes, TOUPPERCASE para colocar tudo em maiúsculo e REPLACEALL para remover os espaços entre as strings
		p1 = ler.nextLine().trim().toUpperCase().replaceAll(" ", "").replaceAll("-","").replace(",", "").replaceAll("!","").replaceAll(":", "");
		
		//Variavel criada para pegar o tamanho da string
		Integer l1 = p1.length();
		
		//Variável usada para test dentro do laço
		int test = 0;
		
		//Irá percorrer a string do inicio até a metade
		for(int x = 0; x < l1/2; x++) {
			char var1 = p1.charAt(x);
			//Irá pegar a stringo ao inverso (de tras pra frente)
			char var2 = p1.charAt(l1-(x+1));
			
			//Compara se as duas string são iguais
			if(var1 != var2) {
				System.out.println("A palavra "+p1+" não é palíndromo");
				//Somar 1 caso tenha uma letra diferente
				test ++;
				break;
			}
		}
		
		//Verifica se o test == 0, se for quer dizer que ele não teve nenhuma string diferente
		if(test == 0) {
			System.out.println("A palavra "+p1+" é palíndromo");
		}
	}
}
