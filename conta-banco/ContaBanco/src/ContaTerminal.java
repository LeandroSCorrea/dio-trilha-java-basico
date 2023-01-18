import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o número da conta");
        numero = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome");
        nomeCliente = sc1.nextLine();

        //Saída
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia +", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
