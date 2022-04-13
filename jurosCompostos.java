import java.util.Scanner;

public class jurosCompostos {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        boolean sair = false;
        double valorPresente;
        double valorFuturo;
        double i;
        double n;
        double juros;
        double conta;
        String resposta;
            
        System.out.println("--- CÁLCULO DE JUROS COMPOSTOS");
 
        do {
            System.out.println("\nEscolha uma das opções abaixo: ");
            
            System.out.println("1 - Quero saber o valor final, valor futuro;");
            System.out.println("2 - Quero saber o valor inicial, valor presente;");
            System.out.println("3 - Quero saber o numero de meses;");
            System.out.println("4 - Quero saber a taxa;");
            System.out.println("5 - Quero saber os juros.");
            System.out.print("\nResposta: ");
            resposta = input.next();
            
            switch(resposta) {
                case "1":
                    System.out.print("\nVocê selecionou a opção 1 - Valor Futuro");
                    System.out.print("\nInforme o valor presente (PV): ");
                    valorPresente = input.nextDouble();
                    
                    System.out.print("Informe a taxa de juros (i): ");
                    i = input.nextDouble();
                    
                    System.out.print("Informe o número de meses (n): ");
                    n = input.nextInt();
                    
                    conta = valorPresente * Math.pow((1+(i/100)), n) ;
                    valorFuturo = conta;
                    
                    System.out.println("O valor final/montante (FV) é " + valorFuturo);
                    System.out.println("O juros foi de " + (valorFuturo-valorPresente));
                    
                    sair = true;
                    break;
                    
                case "2":
                    System.out.print("\nVocê selecionou a opção 2 - Valor Presente");
                    System.out.print("\nInforme o valor futuro (FV): ");
                    valorFuturo = input.nextDouble();
                    
                    System.out.print("Informe a taxa de juros (i): ");
                    i = input.nextDouble();
                    
                    System.out.print("Informe o número de meses (n): ");
                    n = input.nextInt();
                    
                    conta = valorFuturo / Math.pow((1+(i/100)), n);
                    valorPresente = conta;
                    
                    System.out.println("O valor presente/inicial (PV) é " + valorPresente);
                    System.out.println("O juros foi de " + (valorFuturo-valorPresente));
                    
                    sair = true;
                    break;
                    
                case "3":
                    System.out.print("\nVocê selecionou a opção 3 - Número de meses");
                    System.out.print("\nInforme o valor presente (PV): ");
                    valorPresente = input.nextDouble();
                    
                    System.out.print("Informe o valor futuro (FV): ");
                    valorFuturo = input.nextDouble();
                    
                    System.out.print("Informe a taxa de juros (i): ");
                    i = input.nextDouble();
                    
                    conta = (valorFuturo / valorPresente) / (1+(i/100));
                    n = conta;
                    
                    System.out.println("O número de meses (n) é " + ((n*100)/30));
                    System.out.println("O juros foi de " + (valorFuturo-valorPresente));
                    sair = true;
                    break;
                    
                case "4":
                    System.out.print("\nVocê selecionou a opção 4 - Taxa de juros");
                    System.out.print("\nInforme o valor Presente (PV): ");
                    valorPresente = input.nextDouble();
                    
                    System.out.print("Informe o valor futuro (FV): ");
                    valorFuturo = input.nextDouble();
                    
                    System.out.print("Informe o número de meses (n): ");
                    n = input.nextDouble();
                    
                    conta = (Math.pow((valorFuturo/valorPresente), (1/n)) - 1) * 100;
                    i = conta;
                    
                    System.out.println("A taxa de juros é " + i + ("%"));
                    System.out.println("o juros foi de " + (valorFuturo - valorPresente));
                    sair = true;
                    break;
                case "5":
                    System.out.print("\nVocê selecionou a opção 5 - Juros");
                    System.out.print("\nInforme o valor presente (PV): ");
                    valorPresente = input.nextDouble();
                    
                    System.out.print("Informe a taxa de juros (i): ");
                    i = input.nextDouble();
                    
                    System.out.print("Informe o número de meses (n): ");
                    n = input.nextInt();
                    
                    conta = valorPresente * (Math.pow((1+(i/100)), n) - 1);
                    juros = conta;
                    System.out.println("O juros composto foi de " + juros);
                    System.out.println("O valor final é " + (juros+valorPresente));
                    sair = true;
                    break;
                    
                default:
                    System.out.println("\n*** Opção inválida, tente denovo. ***\n");
            }
            
            
        } while (!sair);
        
    }
}
