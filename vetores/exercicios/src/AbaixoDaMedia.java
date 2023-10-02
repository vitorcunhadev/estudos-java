//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        double somaVetor = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();

            somaVetor += vetor[i];
        }

        double mediaVetor = somaVetor / vetor.length;

        System.out.printf("\nMEDIA DO VETOR = %.3f%n", mediaVetor);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (double valor : vetor) {
            if (valor < mediaVetor) {
                System.out.println(valor);
            }
        }

        sc.close();
    }
}
