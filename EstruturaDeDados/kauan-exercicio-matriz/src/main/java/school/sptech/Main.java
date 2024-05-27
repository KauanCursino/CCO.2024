package school.sptech;

public class Main {
    public static void main(String[] args) {
        String[] nomeHospitais = {"Santa Casa", "Santa Magiore", "Samaritano", "Einstein", "São Camilo", "Sírio Libanês"};

        double[][] matriz ={
                            {1120, 3215},
                            {1746, 8753},
                            {1325, 6656},
                            {8564, 3234},
                            {2523, 7543},
                            {7543, 4574}
        };

        double[] mediaColunas = new double[2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < mediaColunas.length; j++) {
                mediaColunas[j] = mediaColunas[j] + matriz[i][j];
            }
        }
        mediaColunas[0] = mediaColunas[0]/6;
        mediaColunas[1] = mediaColunas[1]/6;

        double[] mediaLinhas = new double[6];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 2; j++) {
                mediaLinhas[i] = mediaLinhas[i] + matriz[i][j];
            }
            mediaLinhas[i] = mediaLinhas[i]/2;
        }
        System.out.println("Valorização dos hospitais através dos anos (EM R$)\n");
        System.out.println("Hospital                    Ano 1   Ano 2   Media do Hospital");
        for(int i = 0; i < nomeHospitais.length; i++){
            System.out.printf("%-27s %-7.1f %-7.1f %.1f", nomeHospitais[i], matriz[i][0],matriz[i][1], mediaLinhas[i]);
            System.out.println();
        }
        System.out.print("Valorização de hospitais:   ");
        System.out.print(mediaColunas[0] + " ");
        System.out.print(mediaColunas[1] + " ");
    }
}