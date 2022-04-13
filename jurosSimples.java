import java.util.Scanner;

public class jurosSimples {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double valorPresente;
        double valorFuturo;
        double n;
        double i;
        double juros;
        double conta;
        String resposta;
        
        System.out.println("--- CÁLCULO DOS JUROS SIMPLES ---");
        System.out.println("\nEscolha uma das opções abaixo: ");
        
        System.out.println("1 - Quero saber o valor final, valor futuro;");
        System.out.println("2 - Quero saber o valor inicial, valor presente;");
        System.out.println("3 - Quero saber o numero de meses;");
        System.out.println("4 - Quero saber a taxa;");
        System.out.println("5 - Quero saber os juros.");
        System.out.print("\nResposta: ");
        resposta = input.next();
        
        if(resposta.equals("1") || resposta.equalsIgnoreCase("um")) {
            
            System.out.print("\nInforme o valor Presente (PV): ");
            valorPresente = input.nextDouble();
        
            System.out.print("Informe a taxa (i): ");
            i = input.nextDouble();
            
            System.out.print("Informe o número de meses (N): ");
            n = input.nextInt();
            
            conta = valorPresente * (1 + (i/100) * n);
            valorFuturo = conta;
            
            System.out.println("O valor final (FV) é " + valorFuturo);
            System.out.println("O juros foi de " + (valorFuturo - valorPresente));
        }
        
        if (resposta.equals("2") || resposta.equalsIgnoreCase("dois")) {
            
            System.out.print("\nInforme o número de meses (N): ");
            n = input.nextInt();
            
            System.out.print("Informe a taxa (i): ");
            i = input.nextDouble();
        
            System.out.print("Informe os juros (J): ");
            juros = input.nextDouble();
        
            conta = juros / ((i / 100) * n);
            valorPresente = conta;
            
            System.out.println("O valor inicial (VP) é " + valorPresente);
            System.out.println("O valor futuro é " + (valorPresente + juros));
        }
        
        if (resposta.equals("3") || resposta.equalsIgnoreCase("três")) {
        
            System.out.print("\nInforme o valor Presente (PV): ");
            valorPresente = input.nextDouble();
            
            System.out.print("Informe a taxa (i): ");
            i = input.nextDouble();
            
            System.out.print("Informe os juros (J): ");
            juros = input.nextDouble();
            
            conta = juros / (valorPresente * (i/ 100));
            n = conta;
            
            System.out.println("O número de meses é " + n);
            System.out.println("O valor futuro é " + (valorPresente * (1 + (i/100) * n)));
        }
        
        
        if (resposta.equals("4") || resposta.equalsIgnoreCase("quatro")) {
            
            System.out.print("\nInforme o valor Presente (PV): ");
            valorPresente = input.nextDouble();
        
            System.out.print("Informe o número de meses (N): ");
            n = input.nextInt();
            
            System.out.print("Informe os juros (J): ");
            juros = input.nextDouble();
            
            conta = juros / ((valorPresente * n) * 100);
            
            i = conta * 100;
            
            System.out.println("A taxa é " + (i*100) + "%");
            System.out.println("O valor futuro é " + (valorPresente + juros));
            
        }
        
        if (resposta.equals("5") || resposta.equalsIgnoreCase("cinco")) {
            
            System.out.print("\nInforme o valor Presente (PV): ");
            valorPresente = input.nextDouble();
            
            System.out.print("Informe a taxa (i): ");
            i = input.nextDouble();
            
            System.out.print("Informe o número de meses (N): ");
            n = input.nextInt();
            
            conta = valorPresente * (i / 100) * n;
            juros = conta;
            
            System.out.println("O valor dos juros é " + juros);
            System.out.println("O valor futuro é " + (valorPresente+juros));
        }
        
    }
}
