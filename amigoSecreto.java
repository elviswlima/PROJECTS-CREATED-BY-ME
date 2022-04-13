import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class amigoSecreto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> amigoSecreto = new ArrayList <Integer>();
        
        System.out.println("AMIGO SECRETO\n");
        System.out.print("Quantas pessoas irão participar? ");
        int n = input.nextInt();

        String[] lista = new String[n];
        
        System.out.println("\nDigite o nome das pessoas\n");
        for(int i=0; i<n; i++) {
            System.out.print((i+1) + "a Pessoa: ");
            lista[i] = input.next();
            
            amigoSecreto.add(i);
        }
        
        Collections.shuffle(amigoSecreto);
        
        System.out.println();
        
       
        for(int i=0; i<n; i++) {
            System.out.println(lista[i] + " tirou " + lista[amigoSecreto.get(i)]);
        }        
    }
}