/*
@author Elvis William
date : 26.09.2021
*/

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		// Declaração de variáveis
		Scanner entrada = new Scanner(System.in);
		double a, b;
		String operacaoStr;

		// Entrada de dados
		System.out.println("<A>dição");
		System.out.println("<S>ubtração");
		System.out.println("<M>ultiplicação");
		System.out.println("<D>ivisão");
		System.out.print("Escolha a operação: ");

		operacaoStr = entrada.next();

		System.out.println("1o operando: ");
		a = entrada.nextDouble();
		System.out.println("2o operando: ");
		b = entrada.nextDouble();

		// Processamento e saída
		switch (operacaoStr) {
		case "a":
		case "A":
		case "Adição":
			System.out.println("Soma: " + (a + b));
			break;
		case "s":
		case "S":
		case "Subtração":
			System.out.println("Diferença: " + (a - b));
			break;
		case "m":
		case "M":
		case "Multiplicação":
			System.out.println("Produto: " + (a * b));
			break;
		case "d":
		case "D":
		case "Divisão":
			System.out.println("Divisão: " + (a / b));
			break;
		default:
			System.out.println("A operação " + operacaoStr + " não é válida!");
		}

		entrada.close();

	}

}