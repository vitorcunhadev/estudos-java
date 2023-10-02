//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        int aux = 0;
        System.out.println("NUMEROS PARES: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.printf("%3d", numero);
                aux++;
            }
        }

        System.out.println("\nQUANTIDADE DE PARES = " + aux);

        sc.close();
    }
}
