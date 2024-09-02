/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_5_ENTRADA_DATOS {

    public static void main(String[] args) {
      //DECLARAR VARIABLES 
      String marca;
      String modelo;
      int year;
      double precio; 
      //como se captura?
      //SCANNER
      //Herramienta--> clase
      Scanner captu;
      captu = new Scanner (System.in); //Creamos la herramienta previamente
      //hay que importarla; crear un import
      //hay que darle instrucciones al usuario
      System.out.println("Introduce la marca del vehiculo");
      //Capturamos
      marca = captu.nextLine();//
      System.out.println(marca);
      System.out.println("Introduce el modelo del vehiculo");
      modelo = captu.nextLine();
      System.out.println(modelo);
      System.out.println("Introduce el year del vehiculo");
      year = captu.nextInt();
      System.out.println(year);
      System.out.println("Introduce el precio del vehiculo");
      precio = captu.nextDouble();
      System.out.println(precio);
      System.out.println("DATOSCAPTURADOS -> " + marca + " " + modelo + " " + year + " " + precio + "$");  
    }
}
