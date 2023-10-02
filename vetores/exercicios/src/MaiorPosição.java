//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosição {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        double maiorValor = 0;
        int posicao = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();

            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
                posicao = i;
            }

        }

        System.out.printf("\nMAIOR VALOR = %.1f%n", maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

        sc.close();
    }
}
