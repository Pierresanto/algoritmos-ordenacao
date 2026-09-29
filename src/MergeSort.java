public class MergeSort {

    // Merge Sort (versão iterativa): divide o vetor em blocos de tamanho 1, 2, 4, 8...
    // e vai juntando (merge) dois blocos vizinhos já ordenados em um bloco maior ordenado.
    // Complexidade de tempo: O(n log n) no melhor, médio e pior caso
    // Complexidade de espaço: O(n) (usa um vetor auxiliar na hora de juntar os blocos)
    public static void mergeSort(int[] vet) {
        // tamanho é o tamanho de cada bloco que vai ser juntado
        for (int tamanho = 1; tamanho < vet.length; tamanho *= 2) {
            for (int inicio = 0; inicio < vet.length - 1; inicio += 2 * tamanho) {
                int meio = Math.min(inicio + tamanho - 1, vet.length - 1);
                int fim = Math.min(inicio + 2 * tamanho - 1, vet.length - 1);

                int[] aux = new int[fim - inicio + 1];
                int i = inicio;   // percorre o bloco da esquerda
                int j = meio + 1; // percorre o bloco da direita
                int k = 0;        // posição no vetor auxiliar

                // junta os dois blocos pegando sempre o menor elemento
                while (i <= meio && j <= fim) {
                    if (vet[i] <= vet[j]) {
                        aux[k] = vet[i];
                        i++;
                    } else {
                        aux[k] = vet[j];
                        j++;
                    }
                    k++;
                }
                // copia o que sobrou de cada bloco
                while (j <= fim) {
                    aux[k] = vet[j];
                    j++;
                    k++;
                }
                while (i <= meio) {
                    aux[k] = vet[i];
                    i++;
                    k++;
                }
                // devolve o resultado ordenado para o vetor original
                for (k = 0; k < aux.length; k++) {
                    vet[inicio + k] = aux[k];
                }
            }
        }
    }
}
