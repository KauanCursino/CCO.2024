package school.sptech;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MedicoCirurgiao[] medicosCirurgioes = new MedicoCirurgiao[]{
             new MedicoCirurgiao(
                    "Carla", 10000.0, "1234", 400, 5, 350.0
            ),
            new MedicoCirurgiao(
                    "Eduardo", 5000, "1342", 500, 2, 400
            )
        };
        Acionista[] acionistas = new Acionista[]{
                new Acionista("Miranda", 10, 500),
                new Acionista("Saveirin", 4, 1000)
        };

        ControleBonus controlador = new ControleBonus();
        controlador.getTotalBonus(medicosCirurgioes, acionistas);

        Ordencao ordencao = new Ordencao();
        int [] teste = {1,10,2,45};
        ordencao.ordenaDecrescente(teste);
    }
}