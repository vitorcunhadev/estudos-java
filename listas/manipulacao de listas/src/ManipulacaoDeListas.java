import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ManipulacaoDeListas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int opcao;

        System.out.println("Bem-vindo ao programa de manipulação de listas!");

        do {
            mostraMenu();
            opcao = sc.nextInt();

            while (!verificaOpcao(opcao)) {
                opcao = sc.nextInt();
            }

            switch (opcao) {
                case 1:
                    adicionarNumero(list, sc);
                    break;
                case 2:
                    removerNumero(list, sc);
                    break;
                case 3:
                    imprimirLista(list);
                    break;
                case 4:
                    calcularSoma(list);
                    break;
                case 5:
                    calcularMedia(list);
                    break;
            }

        } while (opcao != 6);

        sc.close();
    }

    private static boolean verificaOpcao(int opcao) {
        if (opcao < 1 || opcao > 6) {
            System.out.print("Opção inválida.\nEscolha uma opção válida: ");
            return false;
        } else {
            return true;
        }
    }

    private static void mostraMenu() {
        System.out.print("""

                1. Adicionar número
                2. Remover número
                3. Imprimir lista
                4. Soma dos números
                5. Média dos números
                6. Sair

                Escolha uma opção:\s""");
    }

    private static void adicionarNumero(List<Integer> list, Scanner sc) {
        System.out.print("Digite o número a ser adicionado: ");
        list.add(sc.nextInt());
        System.out.println("Número adicionado com sucesso!");
    }

    private static void removerNumero(List<Integer> list, Scanner sc) {
        System.out.print("Digite o número a ser removido: ");
        int numeroRemover = sc.nextInt();

        if (list.contains(numeroRemover)) {
            list.remove(Integer.valueOf(numeroRemover));
            System.out.println("Número removido com sucesso!");
        } else {
            System.out.println("O número não está na lista. Nada foi removido.");
        }
    }

    private static void imprimirLista(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            System.out.print("Lista de números:");
            for (Integer x : list) {
                System.out.print(" [" + x + "]");
            }
            System.out.println();
        }
    }

    private static void calcularSoma(List<Integer> list) {
        int soma = 0;
        for (Integer x : list) {
            soma += x;
        }
        System.out.println("A soma dos números é: " + soma);
    }

    private static void calcularMedia(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Lista vazia. A média não pode ser calculada.");
        } else {
            int soma = 0;
            for (Integer x : list) {
                soma += x;
            }
            double media = (double) soma / list.size();
            System.out.printf("A média dos números é: %.1f%n", media);
        }
    }
}
