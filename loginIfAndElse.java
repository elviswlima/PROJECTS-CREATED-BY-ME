import java.util.Scanner;

public class loginIfAndElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String login, senha;
        String loginTest = "elvis123";
        String senhaTest = "12345678";
        boolean sair = false;
        
        System.out.println("--- EXEMPLO DE LOGIN   ---\n");
        
        do {
        
            System.out.println();
            System.out.print("Login: ");
            login = input.next();
            System.out.print("Senha: ");
            senha = input.next();
        
            if (!login.equals(loginTest) && senha.equals(senhaTest)) {
                    System.out.println("Login incorreto, tente novamente.");
                } else if (login.equals(loginTest) && !senha.equals(senhaTest)) {
                    System.out.println("Senha incorreta, tente novamente.");
                } else if (login.equals(loginTest) && senha.equals(senhaTest)) {
                sair = true;
            
            } else {
                System.out.println("Login e senha incorretos, tente novamente.");
            }
        
        } while (!sair);
        System.out.println("Login efetuado com sucesso!");
    }
}