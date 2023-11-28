import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String agencia, nomeCliente;
        int numeroBancario;
        double saldo;

        System.out.println("Por favor, insira o numero da conta bancaria: ");
        numeroBancario = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Por favor, insira o numero da agencia bancaria:");
        agencia = sc.nextLine();

        System.out.println("Me diga o seu nome completo: ");
        nomeCliente = sc.nextLine();

        System.out.println("Me diga o valor para saque: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroBancario + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
