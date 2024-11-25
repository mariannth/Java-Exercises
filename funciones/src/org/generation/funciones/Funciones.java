package org.generation.funciones;

import java.util.ArrayList;
import java.util.List;;

/*
 * La diferencia entre una función y un método es que el método
 * depende del objeto y la función es independiente 
 * 
 * Metodos estáticos:
 * Se define con la palabra static 
 * 
 * Métodos de instancia:
 * Necesitan ser invocadas en una instancia de la clase
 * 
 *  Métodos de tipo void:
 *  Realiza una tarea sin devolver un valor
 *  
 *  Métodos abstractos:
 *  Deben ser implementados por clases hijas
 *  
 *  Constructores
 *  
 *  POO
 *  
 *  Métodos con valor de retorno: Utiliza la palabra reservada 
 *  "return" para devolver un valor 
 * */

public class Funciones{
    
    static class Productos{
        
        String nombre;
        double precio;
        
        
        Productos(String nombre, double precio){
            this.nombre = nombre;
            this.precio = precio;
        }
    }
    
    static class carritoCompra{
        List<Productos> Productos = new ArrayList<>();
        
        void agregarProductos (Productos barbie) {
            Productos.add(barbie);
        }
        
        double calcularTotal() {
            double total = 0;
            for (Productos barbie : Productos){
                total += barbie.precio;
            }
            return total;
        }
        
        double calcularTotalEnvio (double costoEnvio) {
//            double total = calcularTotal();
            double costoDeEnvio = calcularTotal();
            return costoDeEnvio;
        }
        
        
    }
    

    public static void main(String[] args) {
        
        
    Productos muñeca1 = new Productos("Barbie", 115.70);    
    Productos muñeca2 = new Productos("Chelsea", 98.70);    
    Productos muñeca3 = new Productos("Kelly", 105.70);
    
    
    carritoCompra carrito = new carritoCompra();
    carrito.agregarProductos(muñeca1);
    carrito.agregarProductos(muñeca2);
    
    double totalCarrito = carrito.calcularTotal();
    double envio = 87.65;
    double totalDeEnvio = carrito.calcularTotalEnvio(envio);
    double total = totalCarrito + envio;
    
    System.out.println("Tu total es de " + totalCarrito);
    System.out.println("Tu total es de " + totalDeEnvio);

    System.out.println("Tu total es de " + total);
    
    
    }

}