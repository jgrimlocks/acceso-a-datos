/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.presentacion;

/**
 *
 * @author 2FGS07
 */
public class Presentacion {

    public static void main(String[] args) {
        
        trabajador[] misTrabajadores = new trabajador[3];
        misTrabajadores[0] = new trabajador("paco", 2000);
        misTrabajadores[1] = new Jefe ("maria", 2100);
        misTrabajadores[2] = new Practicas("juan", 1800);
        
        for(trabajador e:misTrabajadores){
            System.out.println(e.getSueldo());
        }
        
    }
    
    //public static void main(String[] args) {
        
        //trabajador[] misTrabajadores = new trabajador[3];
        //misTrabajadores[0] = new trabajador("paco", 2000);
        //misTrabajadores[1] = new Jefe("maria", 2100);
        //misTrabajadores[2] = new Practicas("juan", 1800);
        
        //for(trabajador e:misTrabajadores){
        //    System.out.println(e.getSueldo());
        //}
        
    //}
}
