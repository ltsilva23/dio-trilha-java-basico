import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Declarando as variaveis
        int numero;
        String agencia, nomeCliente;
        double saldo;

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Entrada de dados do usuário
        System.out.print("\nDigite o número da conta: ");
        numero = scanner.nextInt();

        System.out.print("\nDigite o numero da agencia: ");
        agencia = scanner.next();

        System.out.print("\nInforme o nome do Cliente: ");
        nomeCliente = scanner.next();
        
        System.out.print("\nInforme o saldo da Conta: ");
        saldo = scanner.nextDouble();

        //saida de dados
        System.out.println("\nOlá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta" +numero+ " e seu saldo " +saldo+ " já está disponível para saque.");

    }
}
