// Menu de jogo

/*
@author Elvis William
date : 26.09.2021
*/

import java.util.Scanner;

public class exemploMenu {
	
	public static void main(String [] args) {
		Scanner  entrada = new Scanner(System.in);
		String escolha;
		
		boolean saida = false;
		
		do {
			System.out.println("MENU\n");
			System.out.println("1- Instruções");
			System.out.println("2- Jogar");
			System.out.println("3- Créditos");
			System.out.println("4- Sair \n");
			System.out.print("\nEscolha uma das opções acima: ");
			escolha = entrada.next();
				
			switch (escolha) {
			
			case "1":
			case "Instruções":
				System.out.println("\nVocê escolheu a opção Instruções \n");
				break;
				
			case "2":
			case "Jogar":
				System.out.println("\nVocê escolheu a opção Jogar \n");
				break;
				
			case "3":
			case "Créditos":
				System.out.println("\nVocê escolheu a opção Créditos \n");
				break;
				
			case "4":
			case "Sair":
				System.out.println("\nVocê escolheu a opção Sair \n");
				saida = true;
				break;
				default:
					System.out.println("\nA opção " + escolha + " é inválida. Digite novamente. \n");
			}
			
		} while (!saida);
		System.out.println("Fim do jogo");
		

	}
}