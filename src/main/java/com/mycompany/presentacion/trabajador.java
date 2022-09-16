/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacion;

/**
 *
 * @author 2FGS07
 */
public class trabajador {
    private String nombre;
    private double sueldo;
    public trabajador(String nombre, double sueldo){ 
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public String getNombre() {
		return nombre;
	}
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    
}
