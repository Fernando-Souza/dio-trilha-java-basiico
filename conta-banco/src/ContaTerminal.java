import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        System.out.println("Por favor, digite seu nome e aperte ENTER:");
        nomeCliente = input.nextLine();

        System.out.println("Por favor, insira o número da conta e aperte ENTER:");
        numero = input.nextInt();
        input.nextLine();

        System.out.println("Por favor, insira o número da agência e aperte ENTER:");
        agencia = input.nextLine();

        System.out.printf("Seu saldo atual é de R$ %.2f\n", saldo);
        System.out.println("Por favor, informe o valor a depositar ENTER:");
        saldo += input.nextDouble();
        input.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,"
                + " sua agência é %s, conta %d e seu saldo %.2f já está disponível", nomeCliente, agencia, numero, saldo);

    }
}
