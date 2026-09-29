# Algoritmos de Ordenação em Java

Neste repositório estão os algoritmos de ordenação que estou aprendendo na disciplina de Programação IV, implementados em Java.

## Algoritmos

- Bubble Sort
- Cocktail Shaker Sort
- Comb Sort
- Insertion Sort
- Merge Sort
- Selection Sort

Todos ordenam o vetor em **ordem crescente** (do menor para o maior). Exemplo: `[8, 3, 5, 1]` vira `[1, 3, 5, 8]`.

## Complexidade de tempo

| Algoritmo | Melhor caso | Caso médio | Pior caso |
|---|---|---|---|
| Bubble Sort | O(n²) | O(n²) | O(n²) |
| Cocktail Shaker Sort | O(n²) | O(n²) | O(n²) |
| Comb Sort | O(n log n) | O(n log n) | O(n²) |
| Insertion Sort | O(n) | O(n²) | O(n²) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) |
| Selection Sort | O(n²) | O(n²) | O(n²) |

O **n** é a quantidade de elementos do vetor. No Bubble Sort e no Cocktail Shaker Sort o melhor caso também é O(n²) porque meus códigos não param antes quando o vetor já está ordenado.

## Como executar

Com o Java instalado, na pasta do projeto:

```
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

O programa mostra um menu, é só escolher o algoritmo e digitar os números do vetor.
