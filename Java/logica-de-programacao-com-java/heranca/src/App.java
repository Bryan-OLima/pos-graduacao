import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Account cp = new Poupanca();
        cp.deposit(1000);
        cp.withdraw(990);

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um valor: ");
            int n1 = scanner.nextInt();

            System.out.println(n1);
        } catch(Exception ex) {
            System.out.println("Erro - Valor não é um numero.");
        }
        }
}
