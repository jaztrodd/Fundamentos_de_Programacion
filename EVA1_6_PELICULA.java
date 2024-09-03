/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pelicula;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PELICULA {

    public static void main(String[] args) throws IOException {
 String Nombre;
      char Clasificacion;
      int duración;
      String Genéro; 
      String reparto;
      Scanner captu;
      captu = new Scanner (System.in);
      System.out.println("Introduce el Nombre");
      Nombre = captu.nextLine();
      System.out.println(Nombre);

      System.out.println("Introduce el genéro");
      Genéro = captu.nextLine();
      System.out.println(Genéro);
      
      System.out.println("Introduce la duracion");
      duración = captu.nextInt();
      System.out.println(duración);
      
      
      System.out.println("Introduce la clasificacion");
      Clasificacion = (char)System.in.read();
      System.out.println(Clasificacion);
      
      System.out.println("Introduce el reparto");
      reparto = captu.nextLine();
      System.out.println(reparto);
        System.out.println(Nombre + " " + reparto + " " + Clasificacion + " " + Genéro + " " + duración + " " + "segundos");
    }
}
 
