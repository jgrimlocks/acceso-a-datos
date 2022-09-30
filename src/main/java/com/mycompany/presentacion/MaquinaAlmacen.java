/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacion;

/**
 *
 * @author 2FGS07
 */
public class MaquinaAlmacen {
private short Capacidad;
private short NumeroDeElementos = 0;

MaquinaAlmacen(short Capacidad) {
    this.Capacidad = Capacidad;
}

public short DimeNumeroDeElementos() {
    return (NumeroDeElementos);
}

public short DimeCapacidad() {
    return (Capacidad);
}

public boolean HayElemento() {
    return (NumeroDeElementos != 0);
}

public boolean HayHueco() {
    return (NumeroDeElementos != Capacidad);
}

public void MeteElemento() {
    NumeroDeElementos++;
}

public void SacaElemento() {
    NumeroDeElementos--;
}

public void RellenaAlmacen() {
    NumeroDeElementos = Capacidad;
}
} // MaquinaAlmacen
