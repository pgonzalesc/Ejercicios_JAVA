/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_b;

import javax.swing.JOptionPane;

public class Ejercicio_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float porcentaje = 1;
        String precio = JOptionPane.showInputDialog("Ingrese el precio neto del artículo");
        
        String codigo_venta = JOptionPane.showInputDialog("Código de Venta:\n"+
                                               "* c: contado\n"+
                                               "* p: plazos");
        if(codigo_venta.charAt(0) == 'c') {
            porcentaje = (float) 0.6;
        } else if(codigo_venta.charAt(0) == 'p') {
            String tiempo = JOptionPane.showInputDialog("Ingrese el tiempo para el pago");
            if(Integer.parseInt(tiempo) < 12) {
                porcentaje = (float) 1.30;
            }else if(Integer.parseInt(tiempo) >= 12) {
                porcentaje = (float) 1.60;
            }
        }
        
        float precio_neto = Float.parseFloat(precio)*porcentaje;
        
        JOptionPane.showMessageDialog(null,"Precio Neto: "+ precio_neto);
    }
    
}
