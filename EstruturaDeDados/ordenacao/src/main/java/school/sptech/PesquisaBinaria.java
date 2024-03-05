package school.sptech;

public class PesquisaBinaria {


    public int pesquisaBinaria(int[] v, int x){
        int indInicio = 0;
        int indFim = v.length -1;

        do {
            int indMeio = (indInicio + indFim)/2;
            if (x == v[indMeio]){
                return indMeio;
            }else if (x > v[indMeio]){
                indInicio = indMeio + 1;
            } else if (x < v[indMeio]){
                indFim = indMeio - 1;
            }
        } while (indInicio <= indFim);
        return -1;
    }


}
