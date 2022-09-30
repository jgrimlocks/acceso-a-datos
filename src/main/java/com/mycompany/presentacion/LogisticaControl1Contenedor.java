/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacion;

/**
 *
 * @author 2FGS07
 */

import java.util.Scanner;
public class LogisticaControl1Contenedor {
public static void main(String[] args){
LogisticaAlmacen Almacen1 = new LogisticaAlmacen((byte)2);
LogisticaAlmacen Almacen2 = new LogisticaAlmacen((byte)4);
LogisticaAlmacen Almacen3 = new LogisticaAlmacen((byte)8);
Scanner entrada = new Scanner(System.in);
String Accion;

do {
    Accion = entrada.next();
    if (Accion.equals("m")) // meter contenedor
        if (Almacen1.HayHueco())
            Almacen1.MeteContenedor();
        else
            if (Almacen2.HayHueco())
                Almacen2.MeteContenedor();
            else
                if (Almacen3.HayHueco())
                    Almacen3.MeteContenedor();
                else
                    System.out.println("Hay que esperar a que"
                    +" vengan a quitar un contenedor");
    else // sacar contenedor
        if (Almacen1.HayContenedor())
            Almacen1.SacaContenedor();
        else
            if (Almacen2.HayContenedor())
                Almacen2.SacaContenedor();
            else
                if (Almacen3.HayContenedor())
                    Almacen3.SacaContenedor();
                else
                    System.out.println("Hay que esperar a que vengan a poner un contenedor");
} while (!Accion.equals("Salir"));
}
}
