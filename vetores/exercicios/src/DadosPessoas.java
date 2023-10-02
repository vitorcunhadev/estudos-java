//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturasFem = 0.0;
        int qtdHomens = 0;
        int qtdMulheres = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", (i + 1));
            alturas[i] = sc.nextDouble();
            System.out.printf("Gênero da %da pessoa (M/F): ", (i + 1));
            generos[i] = sc.next().charAt(0);
        }

        for (double altura : alturas) {
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        for (int i = 0; i < generos.length; i++) {
            if (generos[i] == 'F') {
                somaAlturasFem += alturas[i];
                qtdMulheres++;
            } else if (generos[i] == 'M') {
                qtdHomens++;
            } else {
                System.out.println("Gênero inválido. Use 'M' para masculino e 'F' para feminino.");
                sc.close();
                return;
            }
        }

        double mediaAlturasFem = qtdMulheres > 0 ? somaAlturasFem / qtdMulheres : 0.0;

        System.out.printf("\nMenor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturasFem);
        System.out.println("Número de homens = " + qtdHomens);

        sc.close();
    }
}
