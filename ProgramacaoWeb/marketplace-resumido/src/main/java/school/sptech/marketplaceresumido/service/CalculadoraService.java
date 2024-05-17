package school.sptech.marketplaceresumido.service;

public class CalculadoraService {

    public Double calculo(Double preco){

        if(preco == null){
        throw new IllegalArgumentException("Não deve ser nulo");
        }
        if(preco < 0){
            throw new IllegalArgumentException("Não deve ser negativo");
        }
        if(preco == 0){
            throw new IllegalArgumentException("Não deve ser zero");
        }
        return  preco*0.18;
    }
}
