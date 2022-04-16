/*
@author Elvis William
date : 26.09.2021
*/
import java.util.Scanner;

public class leCaracteres {

	public static void main(String[] args) {

		// Declaração de variáveis
		Scanner entrada = new Scanner(System.in);
		String nome;
		int numero;

		// Entrada de dados
		System.out.println("Dado um nome não composto, imprima a quantidade de caracteres deste nome!");
		System.out.print("Digite um nome não composto: ");

		// Procesamento
		nome = entrada.next();
		numero = nome.length();

		// Saída de dados
		System.out.println("Seu nome é: " + nome);
		System.out.println("Seu nome contém " + numero + " caracteres.");

	}

}