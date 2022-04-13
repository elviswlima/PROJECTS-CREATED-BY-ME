import java.util.Scanner;

public class menorNumAndPosicao {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n = 5;
        int[] nums = new int[n];
        
        for(int i =0; i < nums.length; i++) {
            System.out.printf("vetor[%d] = ", i);
            nums[i] = leitor.nextInt();
        }
        
        int menor = nums[0];
        int posicao = 0;
        
        for(int i =0; i < nums.length; i++) {
            if(nums[i] < menor) {
                menor = nums[i];
                posicao = i;
            }
        }
        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Posição: %d\n", posicao);
        leitor.close();
    }
}
