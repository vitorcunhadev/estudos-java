//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];


        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < A.length; i++) {
            B[i] = sc.nextInt();
        }

        int[] resultante = new int[n];

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < resultante.length; i++) {
            resultante[i] = A[i] + B[i];
            System.out.println(resultante[i]);
        }

        sc.close();
    }
}
