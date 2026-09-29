public class BubbleSort {

    // Bubble Sort: compara os elementos vizinhos e troca quando estão fora de ordem.
    // A cada passada o maior elemento vai "subindo" para o final do vetor.
    // Complexidade de tempo: O(n²) no melhor, médio e pior caso (aqui não tem parada antecipada)
    // Complexidade de espaço: O(1) (ordena no próprio vetor)
    public static void bubbleSort(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            // o -i evita comparar os elementos que já estão no lugar certo
            for (int j = 0; j < vet.length - 1 - i; j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }
}
