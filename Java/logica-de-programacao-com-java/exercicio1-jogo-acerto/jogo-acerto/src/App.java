// import java.util.Random;
// import java.util.Scanner;

public class App {
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) throws Exception {
        // Random generator = new Random();
        // Scanner scanner = new Scanner(System.in);
        // boolean isOn = true;

        // System.out.println("Bem vindo ao jogo da adivinhação!");

        // while (isOn) {
        //     System.out.println("Escolha a dificuldade: ");
        //     System.out.println("1 - Fácil");
        //     System.out.println("2 - Médio");
        //     System.out.println("3 - Difícil");
        //     System.out.println("0 - Sair do jogo");

        //     int number = 100;
        //     int level = scanner.nextInt();

        //     switch (level) {
        //         case 1:
        //             number = generator.nextInt(10);
        //             break;
        //         case 2: 
        //             number = generator.nextInt(50);
        //             break;
        //         case 3: 
        //             number = generator.nextInt(100);
        //             break;
        //         case 0: 
        //             isOn = false;
        //             break;
        //         default:
        //             System.out.println("Opção inválida!");
        //             System.out.println("Reiniciando o jogo...");
        //             break;
        //     }

        //     if (isOn == false) {
        //         System.out.println("Obrigado por jogar o jogo da adivinhação!");
        //         System.out.println("Volte mais vezes, foi legal jogar com você...");
        //         scanner.close();
        //         return;
        //     }

        //     System.out.println("Agora tente acertar no número que pensei: " );
        //     int answer = scanner.nextInt();

        //     if(answer == number ){
        //         System.out.println("Você acertou!");
        //     } else {
        //         System.out.println("Que pena, você errou." );
        //         System.out.println("Eu tinha pensado no número: " + number);
        //     }
        //     System.out.println("Reiniciando o jogo...");
        //     System.out.println("________________________");
        // }

        // scanner.close();
        // int total = sum(10, 50);
        // System.out.println(total);
        // for (int i = 1; i <= 10; i++) {
        //     for (int j = 1; j <= 10; j++) {
        //         System.out.println(i + " x " + j + " = " + (i * j));
        //     }
        // }

        // int[][] value = new int[3][3];

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         value[i][j] = j+i;
        //         System.out.println(value[i][j]);
        //     }
        // }
        // System.out.println();

        // int[] birds = {2,5,0,7,4,1,3,0,2,5,0,1,3,1};

        // int birdsTotal = 0;
        // int birdsFirst = 0;
        // int birdsSecond = 0;

        // for (int i = 0; i < birds.length; i++) {
        //     birdsTotal += birds[i];
        //     if(i < 7) {
        //         System.out.println("_");
        //         System.out.println(birds[i]);
        //         birdsFirst += birds[i];
        //     } else {
        //         birdsSecond += birds[i];
        //     }
        // }

        // System.out.println("Total de pássaros: " + birdsTotal);
        // System.out.println("Total da primeira semana: " + birdsFirst); 
        // System.out.println("Total da segunda semana: " + birdsSecond); 

        int[][] matrix = {
            {9,8,7}, 
            {5,3,2}, 
            {6,6,7}
        };

        // maior elemento na linha e maior elemento na coluna
        
        int[] biggestLineNumbers = new int[3];

        int[] lowestColumnNumber = new int[3];

        // for (int i = 0; i < biggest.length; i++) {
        //     System.out.println(biggest[i]);
        // }

        // for (int i = 0; i < lowest.length; i++) {
        //     System.out.println(lowest[i]);   
        // }

        for (int i = 0; i < matrix.length; i++) {
            biggestLineNumbers[i] = 0;
            lowestColumnNumber[i] = 100;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > biggestLineNumbers[i]) {
                    biggestLineNumbers[i] = matrix[i][j];
                }
                if(matrix[j][i] < lowestColumnNumber[i]){
                    lowestColumnNumber[i] = matrix[j][i];
                }
            }
        }
        System.out.print("Os maiores numeros nas linhas são: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(biggestLineNumbers[i] + ", ");
        }

        System.out.println();
        
        System.out.print("Os menores numeros nas colunas são: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(lowestColumnNumber[i] + ", ");
        }

        // 9, 5, 7 para maior linha
        // 5, 3, 2 para a menor coluna

    }
}