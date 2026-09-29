public class CocktailShakerSort {

    // Cocktail Shaker Sort: parecido com o Bubble Sort, mas anda nos dois sentidos.
    // Na ida leva o maior elemento para o final e na volta leva o menor para o começo.
    // Complexidade de tempo: O(n²) no melhor, médio e pior caso (aqui não tem parada antecipada)
    // Complexidade de espaço: O(1) (ordena no próprio vetor)
    public static void cocktailShakerSort(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            // ida: empurra o maior elemento para o final
            for (int j = i + 1; j < vet.length - i; j++) {
                if (vet[j] < vet[j - 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = aux;
                }
            }
            // volta: empurra o menor elemento para o começo
            for (int k = vet.length - i - 1; k > i; k--) {
                if (vet[k] < vet[k - 1]) {
                    int aux = vet[k];
                    vet[k] = vet[k - 1];
                    vet[k - 1] = aux;
                }
            }
        }
    }
}
