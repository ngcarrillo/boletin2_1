/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       float baseTriangulo, alturaTriangulo;
       System.out.println("Introduce la base");
       Scanner base = new Scanner(System.in); //scanner se usa para introducir datos
       baseTriangulo = base.nextFloat(); //se convierte la variable tipo Scanner en una variable con la que se pueda opera
       //System.out.print(System.getProperty("line.separator"));
       System.out.println("Introduce la altura");
       Scanner altura = new Scanner(System.in); 
       alturaTriangulo = altura.nextFloat();
       //System.out.print(System.getProperty("line.separator"));
       System.out.println("el Area del triangulo es " +(baseTriangulo*alturaTriangulo/2));
       //Introduciendo un cambio para clonar
       
    }
}
     