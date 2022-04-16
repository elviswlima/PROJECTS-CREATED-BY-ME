import java.util.*;

public class questaoSortida {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		ArrayList<String> questao = new ArrayList<String>();
		String answer;

		boolean tacerto = false;

		questao.add("S = A * B"); // Resposta correta
		questao.add("S = A / B");
		questao.add("S = A + B");
		questao.add("S = A - B");
		questao.add("NDA.");

		// Disciplina da questão
		System.out.println("\nCONCEITOS DE COMPUTAÇÃO\n");

		do {

			// Pergunta
			System.out.println("Questão - Qual a expressão lógica utilizada para resolver a função AND/&&:\n");
			Collections.shuffle(questao);

			// Alternativas
			System.out.println("A) " + questao.get(0));
			System.out.println("B) " + questao.get(1));
			System.out.println("C) " + questao.get(2));
			System.out.println("D) " + questao.get(3));
			System.out.println("E) " + questao.get(4));
			System.out.print("\nEscolha sua resposta: ");
			answer = ent.next();

			int index = 0;

			switch (answer.toUpperCase()) {

			// Respostas
			case "A":
				index = 0;
				if (questao.get(index).equals("S = A * B")) {
					System.out.println("\nResposta correta, parabéns!");
					tacerto = true;
				} else {
					System.out.println("\nResposta incorreta, tente novamente.\n");
				}
				break;

			case "B":
				index = 1;
				if (questao.get(index).equals("S = A * B")) {
					System.out.println("\nResposta correta, parabéns!");
					tacerto = true;
				} else {
					System.out.println("\nResposta incorreta, tente novamente.\n");
				}
				break;

			case "C":
				index = 2;
				if (questao.get(index).equals("S = A * B")) {
					System.out.println("\nResposta correta, parabéns!");
					tacerto = true;
				} else {
					System.out.println("\nResposta incorreta, tente novamente.\n");
				}
				break;

			case "D":
				index = 3;
				if (questao.get(index).equals("S = A * B")) {
					System.out.println("\nResposta correta, parabéns!");
					tacerto = true;
				} else {
					System.out.println("\nResposta incorreta, tente novamente.\n");
				}
				break;

			case "E":
				index = 4;
				if (questao.get(index).equals("S = A * B")) {
					System.out.println("\nResposta correta, parabéns!");
					tacerto = true;
				} else {
					System.out.println("\nResposta incorreta, tente novamente.\n");
				}
				break;
			default:
				System.out.println("\nOpção inválida\n");
			}

		} while (!tacerto);
	}
}