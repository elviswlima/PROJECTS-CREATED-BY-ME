import java.util.Scanner;

public class bancoDeDadosEmJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Apresentação
        System.out.println("BANCO DE DADOS\n");
        System.out.print("Quantas pessoas serão cadastradas? "); // LINHAS
        int n = input.nextInt();
        System.out.println();
        
        
        // titulo das colunas da matriz banco de dados
        String[] titulo = {"Nome\t", "Idade\t", "Telefone\t", "País\t", "Sexo\t"}; // COLUNAS
        
        // matriz do banco de dados
        String[][] dados = new String[n][5];
        
        // entrada de dados
        String pessoa, idade, telefone, country, sexo;
        
            for(int i=0; i<n; i++)  { 
            System.out.print(i+1 + "ª pessoa: ");
            pessoa = input.next();
            dados[i][0] = pessoa;
            System.out.print("Idade: ");
            idade = input.next();
            dados[i][1] = idade;
            System.out.print("Telefone: ");
            telefone = input.next();
            dados[i][2] = telefone;
            System.out.print("País: ");
            country = input.next();
            dados[i][3] = country;
            System.out.print("Sexo: ");
            sexo = input.next();
            dados[i][4] = sexo;
            System.out.println();
        }
        
        // LAÇO IMPRESSÃO TÍTULO BANCO DE DADOS
        for (int i=0; i<5; i++){
        System.out.print(titulo[i]);
        }
        
        System.out.println();
        
        // LAÇO IMPRESSÃO DOS DADOS
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++)
            System.out.print(dados[i][j]+"\t");
            System.out.println();
        }
    }
}
