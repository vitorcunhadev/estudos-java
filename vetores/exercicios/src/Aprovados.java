//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] primeirasNotas = new double[n];
        double[] segundasNotas = new double[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", (i + 1));
            nomes[i] = sc.nextLine();
            primeirasNotas[i] = sc.nextDouble();
            segundasNotas[i] = sc.nextDouble();
        }

        System.out.println("\nAlunos aprovados:");

        for (int i = 0; i < n; i++) {
            if (((primeirasNotas[i] + segundasNotas[i]) / 2) >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
