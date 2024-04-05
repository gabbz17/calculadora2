import java.util.Scanner;

public class roteiro3parte2 {
    public static void main(String[] args) {

        float x, y;
        String op;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        x = entrada.nextFloat();
        System.out.println("Informe a operação: ");
        entrada.nextLine();
        op = entrada.nextLine();
        System.out.println("Informe o segundo número: ");
        y = entrada.nextFloat();

        switch (op) {
            case ("+"):
                System.out.println(x + y);
                break;
            case ("-"):
                System.out.println(x - y);
                break;
            case ("*"):
                System.out.println(x * y);
                break;
            case ("/"):
                System.out.println(x / y);
                break;
        }
        entrada.close();
    }
}
