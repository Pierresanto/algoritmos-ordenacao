public class InsertionSort {

    // Insertion Sort: pega um elemento por vez (chave) e insere na posição certa
    // dentro da parte do vetor que já está ordenada, igual ordenar cartas na mão.
    // Complexidade de tempo: O(n) no melhor caso (vetor já ordenado), O(n²) no médio e pior caso
    // Complexidade de espaço: O(1) (ordena no próprio vetor)
    public static void insertionSort(int[] vet) {
        for (int i = 1; i < vet.length; i++) {
            int chave = vet[i];
            int j = i - 1;
            // desloca para a direita os elementos maiores que a chave
            while (j >= 0 && vet[j] > chave) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = chave;
        }
    }
}
