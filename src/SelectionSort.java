public class SelectionSort {

    // Selection Sort: procura o menor elemento do restante do vetor
    // e coloca ele na posição atual, repetindo até o fim.
    // Complexidade de tempo: O(n²) no melhor, médio e pior caso
    // Complexidade de espaço: O(1) (ordena no próprio vetor)
    public static void selectionSort(int[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {
            int min = i;
            // procura a posição do menor elemento a partir de i
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                }
            }
            // troca o menor encontrado com o elemento da posição i
            int aux = vet[i];
            vet[i] = vet[min];
            vet[min] = aux;
        }
    }
}
