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
			System.out.println("Qual é a opção certa? ");
			resposta = ler.nextInt();
			if (resposta == 3) {
				ponto=ponto+1;
				System.out.println(nome+ ", você acertou!! Sua pontuação é: " + ponto);
			}else {
				System.out.println(nome+ ", você errou! Sua pontuação é: " + ponto);
			}
			
			System.out.println("\nPróxima pergunta..\n");
			System.out.println(" bbbb ");
			System.out.println("1. bb ");
			System.out.println("2. bbbb ");
			System.out.println("3. abbbb ");
			System.out.println("4.bbbdfb ");
			System.out.println("Qual é a opção certa? ");
			resposta = ler.nextInt();
			if (resposta == 2) {
				ponto=ponto+1;
				System.out.println(nome+ ", você acertou!! Sua pontuação é: " + ponto);
			}else {
				System.out.println(nome+ ", você errou! Sua pontuação é: " + ponto);
			}
			
			System.out.println("\n" +nome+ ", você fez o total de: "+ ponto+ " pontos e sua média foi igual à: " + ponto+  ", logo você está:" );
			if(ponto >= 2) {
				System.out.println("---- Aprovado ----");
			}else {
				System.out.println("---- Reprovado ----");
			}
			System.out.println(" Gabarito:\n Primeira questão, item: 3\n Segunda questão, item: 2");
	}
}