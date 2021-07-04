/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_c;

import javax.swing.JOptionPane;

public class Ejercicio_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] nota = new float[10];
        for(int i = 0; i < nota.length; i++) {
            nota[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Nota Estudiante "+
                                                  (i+1)+":"));
        }
        float max = nota[0], min = nota[0], promedio = 0;
        for(int i = 0; i < nota.length; i++) {
            promedio += nota[i];
            if(max < nota[i])
                max = nota[i];
            if(min > nota[i])
                min = nota[i];
        } 
        promedio = promedio / nota.length; 
        JOptionPane.showMessageDialog(null,"Promedio: "+promedio+"\n"+
                                           "Máxima nota: "+max+"\n"+
                                           "Mínima nota: "+min);
    }
    
}
