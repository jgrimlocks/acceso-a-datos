/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacion;

/**
 *
 * @author 2FGS07
 */
class Jefe extends trabajador {
    public Jefe(String nom, double sue){
        super(nom, sue);
    }
    public double getSueldo(){
        return super.getSueldo()*1.2;
}
}
