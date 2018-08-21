package POO;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Quadrado obj1 = new Quadrado();
        System.out.println("Tamanho do quadrado? ");
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
            obj1.plotar(a);

        System.out.println("Obrigado!! ");
    }
}
