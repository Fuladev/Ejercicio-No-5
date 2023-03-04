package com.diegofula.ejercicio5;

public class ejercicio5 {

    public static void main(String[] args) {
        
        //  La suma comienza en 0
        double suma = 0;
        System.out.println(suma);
        
        //  Se inicializa x=20
        double x = 20;
        System.out.println(x);
        
        //  A suma se le asigna 0 + 20 = 20 suma obtiene el valor de 20
        suma = suma + x;
        System.out.println(suma);
        
        //  Se inicializa la variable y con valor de 40
        double y = 40;
        System.out.println(y);
        
        //  A x se le asigna el valor de 20 + (40 al cuadrado) quedando x=1620
        x = x+ (y*y);
        System.out.println(x);
        
        //  Suma se opera nuevamente 20 + (1620/40) = 60,5
        suma = suma + (x/y);
        System.out.println("El valor de la suma es: " + suma);
        
    }
    
}
