//Entretenimento e media do aluno
/*
@author Elvis William
date : 26.09.2021
*/

import java.util.Scanner;

public class calcMediaAluno{
	public static void main(String[] args) {

		// Declaração de variáveis
		Scanner entrada = new Scanner(System.in);
		float n1, n2, n3, media;
		String aluno, disciplina, curso, período, turma;

		// Entrada de dados
		System.out.println("Fala caro aluno(a)!!!");
		System.out.println("Bem-vindo à plataforma de calculos da sua media de notas.");
		System.out.println("Começa falando o seu nome completo pra gente começar a brincadeira?");
		aluno = entrada.nextLine();
		aluno.equalsIgnoreCase("Aluno");
		System.out.println("Olá " + aluno + " tudo bem? ");
		System.out.println("Primeiramente, obrigado por participar do nosso projeto de cálculo da média de notas!");
		System.out.println("Informa o seu curso pra gente? xD ");
		curso = entrada.nextLine();
		System.out.println("Boooa !!! Agora informa pra gente a sua turma: ");
		turma = entrada.nextLine();
		System.out.println(aluno + " Até agora está tudo indo certo! Informa o período que você estuda: ");
		período = entrada.nextLine();
		System.out.println("Beleza!!! Agora digita pra gente qual disciplina você deseja calcular a média? ");
		disciplina = entrada.nextLine();
		System.out.println("Confere se seus dados abaixo estão corretos e eu prometo que já já a gente começa! kkkk \n"
				+ "Nome do Aluno(a): " + aluno);
		System.out.println("Curso: " + curso);
		System.out.println("Turma: " + turma);
		System.out.println("Período: " + período);
		System.out.println("Disciplina que deseja calcular a média? " + disciplina + ".");

		System.out.println("Obrigado por esperar até aqui " + aluno + " !!! Agora chega de papo e vamos começar! ");
		System.out.print("Por favor digite a sua primeira nota: ");
		n1 = entrada.nextFloat();
		System.out.print("Agora digite a sua segunda nota: ");
		n2 = entrada.nextFloat();
		System.out.print("E agora por último, digite a terceira nota: ");
		n3 = entrada.nextFloat();

		System.out.println("Beleza!!! Dá uma segurada que a gente ta processando a sua nota... ");

		// Processamento
		media = (n1 + n2 + n3) / 3;

		// Saída de dados
		System.out.println(aluno + "!!! Seguinte, o resultado da sua média de notas foi " + media + ".");

		if (media >= 6) {
			System.out.print(
					"Parabéééééns!!! Você foi aprovado na disciplina de " + disciplina + ". :)  PODE COMEMORAR!!!");
		} else {
			System.out.println("Que pena, você não foi aprovado na disciplina de " + disciplina + ".");
			System.out.println(
					"Más tente novamente, até você conseguir! ;D Nos vemos na próxima e desejamos sorte para você!!!");
		}

		entrada.close();

	}
}