/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_a;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Gonzales
 */
public class Numero_2 {
    Numero_2() {
        
    }
    
    void ConvertirTemperatura() {
        float f;
        String c = JOptionPane.showInputDialog("Ingrese Grados Centigrados:");
        f = ((float)(9.0/5.0)*Float.parseFloat(c)+ 32);
        JOptionPane.showMessageDialog(null,"Fº: "+ f);
    }
}
