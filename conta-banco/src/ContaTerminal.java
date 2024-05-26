import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
  Scanner scr = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Boa tarde, para criar a conta, digite as informações logo abaixo.");
       
        System.out.print("Seu nome: ");
        String nomeCliente = scr.nextLine();
        System.out.print("Conta: ");
        int numeroConta = scr.nextInt();
        scr.nextLine();
        System.out.print("Agência: ");
        String numeroAgencia = scr.nextLine();
        System.out.print("Saldo da conta: ");
        double saldoConta = scr.nextDouble();
               
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s,"+
                          "conta %d e o seu saldo %.2f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldoConta);
        scr.close();
    }
}
