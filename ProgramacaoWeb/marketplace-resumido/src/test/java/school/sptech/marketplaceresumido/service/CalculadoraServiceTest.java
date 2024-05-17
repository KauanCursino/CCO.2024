package school.sptech.marketplaceresumido.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    @Test
    @DisplayName("Ao chamar o cálculo passando 100 deve retornar 18")
    void retornaPrecoDoCalculoIcms() {
        //given
        Double retono = 18.0;
        Double valorInformado = 100.0;

        CalculadoraService calculadoraService = new CalculadoraService();

        //when
        //then
        Double calculo = calculadoraService.calculo(valorInformado);

        //assert
        Assertions.assertEquals(retono, calculo);
    }

    @Test
    @DisplayName("Ao informar valor nulo no preço, deve retornar uma exception")
    void calculaPrecoNulo(){
        //given
        Double valorInformado = null;
        CalculadoraService calculadoraService = new CalculadoraService();

        //then/assert

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculadoraService.calculo(valorInformado)
        );

        assertEquals("Não deve ser nulo", exception.getLocalizedMessage());
    }

    @Test
    @DisplayName("Ao informar valor negativo, deve retornar uma exception")
    void calcularPrecoMenorQueZero(){
        Double valorInformado = -1.0;
        CalculadoraService calculadoraService = new CalculadoraService();
        Double calculo = calculadoraService.calculo(valorInformado);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        () -> calculadoraService.calculo(valorInformado));

        assertEquals("Não deve ser menor que 0", exception.getLocalizedMessage());
    }

    @Test
    @DisplayName("Ao informar o preço, não deve ser 0")
    void calcularPrecoZerado(){
        Double valorInformado = 0.0;
        CalculadoraService calculadoraService = new CalculadoraService();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculadoraService.calculo(valorInformado)
        );

        assertEquals("O valor deve ser 0", exception.getLocalizedMessage());
    }
}