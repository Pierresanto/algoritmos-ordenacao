public class CombSort {

    // Comb Sort: melhora o Bubble Sort comparando elementos que estão distantes (gap).
    // O gap começa grande e vai diminuindo (dividido por 1,3) até chegar em 1.
    // Complexidade de tempo: O(n²) no pior caso, O(n log n) no melhor caso e no caso médio
    // Complexidade de espaço: O(1) (ordena no próprio vetor)
    public static void combSort(int[] vet) {
        int gap = vet.length - 1;
        boolean troca = true;

        // continua enquanto houve troca OU o gap ainda for maior que 1
        while (troca || gap > 1) {
            troca = false;
            if (gap > 1) {
                gap = (int) (gap / 1.3);
            } else {
                gap = 1;
            }
            for (int i = 0; i + gap < vet.length; i++) {
                if (vet[i] > vet[i + gap]) {
                    int aux = vet[i];
                    vet[i] = vet[i + gap];
                    vet[i + gap] = aux;
                    troca = true;
                }
            }
        }
    }
}
