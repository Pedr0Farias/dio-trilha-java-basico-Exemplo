import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Por favor, digite o número da Agencia !");
        int numero=scanner.nextInt();
    System.out.print("Por favor, digite o nome da Agencia !");
        String agencia=scanner.next();
    System.out.print("Por favor, digite o seu Nome !");
        String nomeCliente=scanner.next();
    System.out.print("Por favor, digite o seu saldo !");
        double saldo=scanner.nextDouble();
    System.out.println("\"Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é, " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    
    scanner.close();
}
}