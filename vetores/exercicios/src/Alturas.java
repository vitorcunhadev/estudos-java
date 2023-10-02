//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        double somaAlturas = 0;
        int aux = 0;

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n", (i + 1));
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

            somaAlturas += alturas[i];

            if (idades[i] < 16) {
                aux++;
            }

        }

        double mediaAlturas = somaAlturas / n;
        double porcentagemMenos16 = aux * 100.0 / n;

        System.out.printf("\nAltura média: %.2f%n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenos16);
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
