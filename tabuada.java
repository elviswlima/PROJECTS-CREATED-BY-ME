/*
@author Elvis William
date: 26.09.2021
*/

import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n, max, mult;
        
        System.out.println("TABUADA");
        System.out.print("\nDigite um número: ");
        n = ent.nextInt();
        System.out.print("\nDigite até quanto você deseja que o número seja multiplicado: ");
        max = ent.nextInt();
        
        for (int i = 0; i <= max; i++){
            mult = i * n;
            System.out.println("\n" + i + " x " + n + " = " + mult);
        }
        ent.close();
    }
    
}