import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIO - Trilha Java Básico");

        System.out.println("\nOlá, seja bem vindo!");

        System.out.print("\nDigite o seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.print("Digite o seu saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nome + ", obrigada por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
