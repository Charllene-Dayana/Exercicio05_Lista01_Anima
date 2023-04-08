import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double centimetro;
        double metros;
        Scanner teclado = new Scanner(System.in);
        System.out.println("valor em metro");

        metros = teclado.nextDouble();
        centimetro = metros * 100;

        System.out.println("valor em centimetro " + centimetro);

    }
}
