/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import modell.Lada;
import nezet.CuiNezet;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public class LogikaiProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lada arany = new Lada("arany", "én rajtem", false);
        Lada ezust = new Lada("ezust", "nem én rejtem", false);
        Lada bronz = new Lada("bronz", "az arany hazudik", true);
        CuiNezet c1 = new CuiNezet();
        Lada[] ladak = {arany, ezust, bronz};
        c1.feladatMegjelenito("feladat");
        c1.leirasMegjelenito(arany.getFelirat());
        c1.leirasMegjelenito(ezust.getFelirat());
        c1.leirasMegjelenito(bronz.getFelirat());
        int valasztas = c1.valasztas("Melyik?: ");
    }
    
}
