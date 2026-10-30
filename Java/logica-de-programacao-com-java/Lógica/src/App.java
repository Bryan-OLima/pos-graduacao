import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String value = "Descomplica - Java";

        // System.out.println(value.contains(value));
        // System.out.println(value.length());
        // System.out.println(value.substring(5));
        // System.out.println(value.replace("teste", value));

        // System.out.println("Informe sua idade: ");
        // // String word;
        // int number;
        // Scanner entry = new Scanner(System.in);
        
        // number = entry.nextInt();

        // System.out.println("Palavra digitada: " + number);
        // entry.close();
        // double base, altura, area;

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Digite a base: ");
        // base = scanner.nextDouble();

        // System.out.print("Digite a altura: ");
        // altura = scanner.nextDouble();

        // area = base * altura / 2;

        // System.out.println("Área: " + area);
        // scanner.close();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Cadastrar notas");
        System.out.println("3 - Listar alunos e nota");

        int option  = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Vamos cadastrar aluno");
                break;
            case 2:
                System.out.println("Vamos cadastrar notas");
                break;
            case 3:
                System.out.println("Notas e alunos");
                break;
            default:
                System.out.println("Comando invalido");
                break;
        }
    }
}
