//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] valores = new double[n];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite um número: ");
            double x = sc.nextDouble();
            valores[i] = x;
        }

        System.out.println();

        double soma = 0;
        System.out.print("VALORES =");
        for (double valor : valores) {
            System.out.printf("%5.1f", valor);
            soma += valor;
        }
        double media = soma / valores.length;

        System.out.println();
        System.out.printf("SOMA = %.1f%n", soma);
        System.out.printf("MEDIA = %.1f%n", media);

        sc.close();
    }
}
