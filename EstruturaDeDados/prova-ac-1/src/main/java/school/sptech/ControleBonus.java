package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    private double bonusTotal;

    public double getTotalBonus(Medico[] m, Acionista[] a){
        for (int i = 0; i < m.length; i++){
            bonusTotal += m[i].getValorBonus();
        }

        for (int i = 0; i < a.length; i++){
            bonusTotal += a[i].getValorBonus();
        }
        System.out.println("Bonus total de R$ " + bonusTotal);
        return bonusTotal;
    }

}
