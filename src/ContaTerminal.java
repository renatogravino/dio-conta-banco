/**
 * <h3>Terminal de Conta</h3>
 * <p>Este programa simula um terminal de conta bancária, 
 * onde o usuário informa o número da conta, agência, 
 * nome do cliente e saldo da conta.</p>
 * @author Renato Gravino Neto
 * @version 1.0.0
 * @since 2024-09-18
 */

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, informe o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, informe o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe o saldo da conta: ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(", conta ").concat(Integer.toString(conta)).concat(" e seu saldo ").concat(Double.toString(saldo)).concat(" já está disponível para saque");

        System.out.println(mensagem);
    }
}
