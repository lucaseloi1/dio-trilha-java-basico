import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
            double saldo = 237.48;

            System.out.print("Digite o número da Conta: ");
            int numero = sc.nextInt();

            System.out.print("Digite o número da Agência: ");
            String agencia = sc.next();

            System.out.print("Digite o seu Nome: ");
            String nome = sc.next();

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                    + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        } catch (java.util.InputMismatchException e) {
            System.err.println(
                    "\nErro: O número da conta deve ser um valor numérico inteiro. Por favor, execute o programa novamente.");
        }
    }
}