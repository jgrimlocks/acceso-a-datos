/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacion;

import java.util.Scanner;

/**
 *
 * @author 2FGS07
 */
public class MaquinaControlador {
    
public static void main(String[] args){
Scanner entrada = new Scanner(System.in);
String Accion;
char Car;

MaquinaModeloSencillo MiMaquina = new MaquinaModeloSencillo();
MiMaquina.PonPrecios(1.1f, 1.3f, 0.8f);
MiMaquina.Deposito1Euro.MeteElemento();
MiMaquina.Deposito01Euro.MeteElemento();
MiMaquina.Deposito01Euro.MeteElemento();
MiMaquina.DepositoCocaCola.RellenaAlmacen();
MiMaquina.DepositoNaranja.RellenaAlmacen();
//MiMaquina.Deposito1Euro.RellenaAlmacen(); No nos
// ha llegado el suministro de agua

do {
    System.out.println("-- c,n,a,s --");
    Accion = Accion = entrada.next();
    Car = Accion.charAt(0);
    switch (Car) {
        case 'c' -> {
            System.out.println("Ha seleccionado Coca cola");
            if(MiMaquina.DepositoCocaCola.HayElemento()) {
                if (MaquinaAutomataEuros.IntroduccionMonedas
                    (MiMaquina,MiMaquina.DimePrecioCocaCola())) {
                    MiMaquina.DepositoCocaCola.SacaElemento();
                    System.out.println("No olvide coger su cocacola");
// Sacar fisicamente la CocaCola
                }
            }
            else
                
                System.out.println("Producto agotado");
        }

case 'n' -> {
    System.out.println("Ha seleccionado Naranja");
    if (MiMaquina.DepositoNaranja.HayElemento()) {
        if (MaquinaAutomataEuros.IntroduccionMonedas
            (MiMaquina,MiMaquina.DimePrecioNaranja())) {
            MiMaquina.DepositoNaranja.SacaElemento();
            System.out.println("No olvide coger su naranja");
// Sacar fisicamente la Naranja
        }
    }
    else
        System.out.println("Producto agotado");
        }

case 'a' -> {
    System.out.println("Ha seleccionado Agua");
    if (MiMaquina.DepositoAgua.HayElemento()) {
        if (MaquinaAutomataEuros.IntroduccionMonedas
            (MiMaquina, MiMaquina.DimePrecioAgua())) {
            MiMaquina.DepositoAgua.SacaElemento();
            System.out.println("No olvide coger su agua");
// Sacar fisicamente el agua
        }
    }
    else
        System.out.println("Producto agotado");
        }

default -> System.out.println("Error de seleccion, intentelo de nuevo");
}
MiMaquina.MostrarEstadoMaquina();

} while (!Accion.equals("s"));
}
}