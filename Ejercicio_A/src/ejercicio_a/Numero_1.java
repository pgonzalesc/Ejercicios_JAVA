/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_a;
import javax.swing.JOptionPane;

public class Numero_1 {
    Numero_1() {   
    
    }
    
    void Calculadora() {
        float suma, resta, multiplicacion, division;
        String num1 = JOptionPane.showInputDialog("Ingrese Número 1:");
        String num2 = JOptionPane.showInputDialog("Ingrese Número 2:");
        suma = Float.parseFloat(num1) + Float.parseFloat(num2);
        resta = Float.parseFloat(num1) - Float.parseFloat(num2);
        multiplicacion = Float.parseFloat(num1) * Float.parseFloat(num2);
        division = Float.parseFloat(num1) / Float.parseFloat(num2);
        //JOptionPane.showMessageDialog(null,"Suma: "+ suma);
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println(num1 + " / " + num2 + " = " + division);
    }
}
