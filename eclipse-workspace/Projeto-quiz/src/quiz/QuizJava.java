package quiz;
import java.util.Scanner;

public class QuizJava {
	public static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		int ponto=0;
		int resposta;
		
			System.out.println("---- Bem-Vindo ao nosso quiz das Divas ----\n");
			System.out.println("Digite seu nome: ");
			String nome = ler.nextLine();
			System.out.println(" ");
			System.out.println("Vamos agora para as perguntas..\n");
			System.out.println(" aaaa ");
			System.out.println("1. aa ");
			System.out.println("2. aaa ");
			System.out.println("3. aaaa ");
			System.out.println("4.aaaaaa ");
			System.out.println("Qual � a op��o certa? ");
			resposta = ler.nextInt();
			if (resposta == 3) {
				ponto=ponto+1;
				System.out.println(nome+ ", voc� acertou!! Sua pontua��o �: " + ponto);
			}else {
				System.out.println(nome+ ", voc� errou! Sua pontua��o �: " + ponto);
			}
			
			System.out.println("\nPr�xima pergunta..\n");
			System.out.println(" bbbb ");
			System.out.println("1. bb ");
			System.out.println("2. bbbb ");
			System.out.println("3. abbbb ");
			System.out.println("4.bbbdfb ");
			System.out.println("Qual � a op��o certa? ");
			resposta = ler.nextInt();
			if (resposta == 2) {
				ponto=ponto+1;
				System.out.println(nome+ ", voc� acertou!! Sua pontua��o �: " + ponto);
			}else {
				System.out.println(nome+ ", voc� errou! Sua pontua��o �: " + ponto);
			}
			
			System.out.println("\n" +nome+ ", voc� fez o total de: "+ ponto+ " pontos e sua m�dia foi igual �: " + ponto+  ", logo voc� est�:" );
			if(ponto >= 2) {
				System.out.println("---- Aprovado ----");
			}else {
				System.out.println("---- Reprovado ----");
			}
			System.out.println(" Gabarito:\n Primeira quest�o, item: 3\n Segunda quest�o, item: 2");
	}
}