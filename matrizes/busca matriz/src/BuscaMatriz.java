//Fazer um programa para ler dois números inteiros M e N, e depois ler
//uma matriz de M linhas por N colunas contendo números inteiros,
//podendo haver repetições. Em seguida, ler um número inteiro X que
//pertence à matriz. Para cada ocorrência de X, mostrar os valores à
//esquerda, acima, à direita e abaixo de X, quando houver.

import java.util.Random;
import java.util.Scanner;

public class BuscaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Usuário atribui a quantidade de linhas e colunas da matriz

        System.out.print("Linhas: ");
        int M = sc.nextInt();
        System.out.print("Colunas: ");
        int N = sc.nextInt();

        int[][] matriz = new int[M][N];

        // Classe random atribui os valores na matriz

        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {
                    aux = random.nextInt(M * N + 1);
                } while (temNumero(matriz, aux));
                matriz[i][j] = aux;
            }
        }

        // Imprime a matriz

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.printf("%4d", elemento);
            }
            System.out.println();
        }

        // Imprime vizinhos de X (acima, abaixo, esquerda, direita).

        int X = sc.nextInt();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (X == matriz[i][j]) {
                    System.out.printf("Position %d, %d:%n", i, j);


                    if (i - 1 >= 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (i + 1 < matriz.length) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                    if (j - 1 >= 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (j + 1 < matriz[i].length) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }

                    break;

                }
            }
        }

        sc.close();
    }

    public static boolean temNumero(int matriz[][], int aux) {
        for (int linha[] : matriz) {
            for (int x : linha) {
                if (x == aux) {
                    return true;
                }
            }
        }
        return false;
    }

}
