/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_converciones;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA1_9_CONVERCIONES {

    public static void main(String[] args) {

        double farenheit, centigrados;
        Scanner captu = new Scanner(System.in);
        System.out.println("Temperatura en grados farenheit:");
        farenheit = captu.nextDouble();
        centigrados = (farenheit - 32) / 1.8;
        System.out.println("° =" + centigrados);
        
        //De centigrados a farenheit
         System.out.println("Temperatura en grados centigrados:");
        centigrados = captu.nextDouble();
        farenheit = centigrados * 1.8 + 1.8;
        System.out.println("°F =" + farenheit);
        
        
        
    }
}
