import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agencia:");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor do saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá" + nome +  ", obrigado por criar uma conta em nosso banco, sua agendica é" + agencia + ", conta" + numero + "e seu saldo " + saldo + " já está disponivel para saque.");

        scanner.close();

    }
}
