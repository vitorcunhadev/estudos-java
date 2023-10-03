import java.util.Random;
import java.util.Scanner;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int N = sc.nextInt();
        int[][] matriz = new int[N][N];

        // Atribui os valores na matriz usando a classe Random

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(21) - 10;
            }
        }

        // Imprime a matriz

        for (int[] linha : matriz) {
            for (int x : linha) {
                System.out.printf("%4d", x);
            }
            System.out.println();
        }

        // Imprime a diagonal principal

        System.out.print("\nDiagonal Principal:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == i) {
                    System.out.print(" [" + matriz[i][j] + "]");
                }
            }
        }

        // Imprime a quantidade de valores negativos

        int aux = 0;
        for (int[] linha : matriz) {
            for (int x : linha) {
                if (x < 0) {
                    aux++;
                }
            }
        }
        System.out.println("\nNúmeros Negativos: " + aux);

        sc.close();
    }
}
