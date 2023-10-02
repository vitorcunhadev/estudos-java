//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        int somaPares = 0;
        int qtdPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                qtdPares++;
            }
        }

        double mediaPares = (double) somaPares / qtdPares;

        if (qtdPares != 0) {
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
