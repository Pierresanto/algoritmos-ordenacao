import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;

        do {
            System.out.println();
            System.out.println("===== ALGORITMOS DE ORDENAÇÃO =====");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Cocktail Shaker Sort");
            System.out.println("3 - Comb Sort");
            System.out.println("4 - Insertion Sort");
            System.out.println("5 - Merge Sort");
            System.out.println("6 - Selection Sort");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = in.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                // lê o vetor digitado pelo usuário
                int tamVet;
                System.out.println("Digite quantos elementos terão no vetor: ");
                tamVet = in.nextInt();
                int[] vet = new int[tamVet];
                for (int i = 0; i < vet.length; i++) {
                    System.out.println("Digite os valores do vetor: ");
                    vet[i] = in.nextInt();
                }

                System.out.println("VETOR ORIGINAL");
                imprimirVetor(vet);

                // chama o algoritmo escolhido (todos ordenam em ordem crescente)
                switch (opcao) {
                    case 1:
                        BubbleSort.bubbleSort(vet);
                        break;
                    case 2:
                        CocktailShakerSort.cocktailShakerSort(vet);
                        break;
                    case 3:
                        CombSort.combSort(vet);
                        break;
                    case 4:
                        InsertionSort.insertionSort(vet);
                        break;
                    case 5:
                        MergeSort.mergeSort(vet);
                        break;
                    case 6:
                        SelectionSort.selectionSort(vet);
                        break;
                }

                System.out.println("VETOR ORDENADO");
                imprimirVetor(vet);
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        in.close();
    }

    // Imprime os elementos do vetor entre colchetes
    public static void imprimirVetor(int[] vet) {
        System.out.print("[");
        for (int n : vet) {
            System.out.print(" " + n + " ");
        }
        System.out.println("]");
    }
}
