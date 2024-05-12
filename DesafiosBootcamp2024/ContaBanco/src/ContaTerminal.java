import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta:");
        int conta = scanner.nextInt();
       
        System.out.println("Agora, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome:");
        String nome = scanner.next();

        System.out.println("E por último, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta de número "+conta+" com o saldo de "+saldo+" já disponível para saque");
        scanner.close();
    }
}
