import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da sua Agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        double saldo = 237.48;
        
        
        System.out.println("Olá ".concat(nome) + 
        ", obrigado por criar uma conta no nosso banco, sua agência é ".concat(agencia) +
         " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
