/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.Scanner;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public class CuiNezet {

    private static final Scanner sc = new Scanner(System.in);
    private static final String SEP = System.lineSeparator();
    
    private void konzolraIr(String msg){
        System.out.print(msg);
    }
    
    public void leirasMegjelenito(String msg){
        konzolraIr(msg+SEP);
    }
    
    public void feladatMegjelenito(String msg){
        konzolraIr(msg+SEP);
    }
    
    public int valasztas(String msg){
        konzolraIr(msg);
        return sc.nextInt();
    }
    
    public void eredmenyMegjelenito(){
        
    }
}
