package school.sptech;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SelectionSort ordenacaoSelection = new SelectionSort();
        BubbleSort ordenacaoBubble = new BubbleSort();
        PesquisaBinaria ordenacaoPesquisaBinaria = new PesquisaBinaria();
        InsertionSort ordenacaoInsertion = new InsertionSort();

        int[] teste = {8,1,4,5,0,7,3,9,2,6,10};
        int[] testePesquisaBinaria = {1,2,3,4,5,10,20,30,40,50};

        // ordenacaoSelection.selectionSort(teste);
        // ordenacaoSelection.selectionSortOtimizado(teste);

        // ordenacaoBubble.bubbleSort(teste);

        //System.out.println(pesquisaBinaria.ordenacaoPesquisaBinaria(testePesquisaBinaria, 100));

        ordenacaoInsertion.InsertionSort(teste);}
}