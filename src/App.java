import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Digite um número: ");
        n = input.nextInt();
        System.out.print("O número que você digitou é: " + n);

        input.close();

    }
}
