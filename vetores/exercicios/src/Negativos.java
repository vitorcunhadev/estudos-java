//Faça um programa que leia um número inteiro positivo N (máximo = 10)
// e depois N números inteiros e armazene-os em um vetor. Em seguida,
// mostrar na tela todos os números negativos lidos.

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NÚMEROS NEGATIVOS:");

        for (int numero : vetor) {
            if (numero < 0) {
                System.out.println(numero);
            }
        }

        sc.close();
    }
}
