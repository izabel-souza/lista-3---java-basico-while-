import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;
        String quadrante;
        
        do {
            System.out.println("Informe os valores de X e Y respectivamente: ");
            x = sc.nextInt();
            y = sc.nextInt();

            
            quadrante = (((x > 0) && (y > 0)) ? "primeiro" : "terceiro");    
            if((x > 0) && (y < 0)) quadrante = "quarto";
            else if((x < 0) && (y > 0)) quadrante = "segundo";
 
            if((x != 0) && (y != 0)) System.out.println("Quadrante = " + quadrante);

        } while((x != 0) && (y != 0));

        sc.close();
    }
}
