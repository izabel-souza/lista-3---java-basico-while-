import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int senha;
        
        do {
            System.out.println("Informe a senha: ");
            senha = sc.nextInt();

            if(senha != 2002) { System.out.println("Senha invalida"); }

        } while(senha != 2002);

        System.out.println("Acesso Permitido");

        sc.close();
    }
}