import java.security.MessageDigest;
import java.math.BigInteger;
import java.util.Scanner;

public class criptografarSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma senha: ");
        String senha = input.next();
        System.out.println("Senha normal: " + senha);
        encriptografar(senha);
        System.out.println("Senha encriptografada: " + encriptografar(senha));   
    }
    
    public static String encriptografar (String senha) {
        String retorno = "";
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1,md.digest(senha.getBytes()));
            retorno = hash.toString(16);
        } 
        catch (Exception e) {}
        return retorno;
        
    }
}