/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presentacion;

/**
 *
 * @author 2FGS07
 */
public class Practicas extends trabajador{
    public Practicas(String nom, double sue){
        super(nom, sue);
    }
    public double getSueldo(){
        return super.getSueldo()*0.8;
}}
