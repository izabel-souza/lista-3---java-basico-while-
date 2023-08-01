import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int combustivel;
        int alcool = 0, gasolina = 0, diesel = 0;
        
        System.out.println("1 = alcool");
        System.out.println("2 = gasolina");
        System.out.println("3 = diesel"); 
        System.out.println("4 = fim");

        do {
            System.out.println("Informe um combustivel: ");
            combustivel = sc.nextInt();

            if(combustivel == 1) alcool++;
            else if(combustivel == 2) gasolina++;
            else if(combustivel == 3) diesel++;

        } while(combustivel != 4);

        System.out.printf("MUITO OBRIGADO!%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);

        sc.close();
    }
}