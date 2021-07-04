/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_a;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Gonzales
 */
public class Numero_3 {
    Numero_3() {
        
    }
    
    void MostrarSalario() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre del trabajador: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese Horas trabajadas: ");
        float hora = Float.parseFloat(sc.nextLine());
        System.out.println("Ingrese precio de la hora: ");
        float precio = Float.parseFloat(sc.nextLine());
        
        float salario_neto = hora*precio*(float)(1-0.1);
        
        System.out.println("Salario Neto de "+ nombre+" es: "+salario_neto);
    }
}
