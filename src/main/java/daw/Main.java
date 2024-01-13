/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.ArrayList;

/**
 *
 * @author Dan_n
 */
public class Main {

    public static void main(String[] args) {
     
      
        //crear una lista con constructor predeterminado vacio
        Catalogo tienda = new Catalogo();
        
        //añadir nuevos elementos mediante el constructor de moviles
        tienda.add(new Moviles("Samsun", "s1", 4.1, 1000, 188.1));
        tienda.add(new Moviles("nokia", "n2", 8.8, 2000, 88));
        tienda.add(new Moviles("huyawi", "h30", 7.1, 2005, 102));
        tienda.add(new Moviles("apple", "ap1", 8.1, 3000, 288));
        
        //mostrar el catalogo 
        System.out.println("---Mostrar catalogo--");
        tienda.imprimirCatalogo();
        
        //numero de elementos 
        System.out.println("---mostrar numero elementos--");
        System.out.println("catnidad de elementos?: "+ tienda.numeroElementos());
        // comprobar si esta vacio
        System.out.println("--comprobar si esta vacio---");
        System.out.println(tienda.estaVacio());
        
        //ver el elemento de la posicion 1
        System.out.println("--elemento posicion 1---");
        tienda.verElemento(1);
        
        //cambiar posicion elemento 1 a la posicion 0
        System.out.println("---cambiar posicion 1->0 --");
        tienda.cambiarElemento(0, tienda.getCatalogo().get(1));
        
        tienda.imprimirCatalogo();
        //imprimir catalogo
        System.out.println("--imprimir catalogo---");
        tienda.imprimirCatalogo();
        
        //guardar elemento
        System.out.println("--añadir movil vacio---");
        tienda.guardarElemento(new Moviles());
        tienda.imprimirCatalogo();
        
        //eliminar elemento
        System.out.println("--eliminar movil---");
        tienda.eliminarElemento(4);
        tienda.imprimirCatalogo();
        
        
        //buscar elemento
        System.out.println("--buscar en  catalogo---");
        System.out.println("posicion elemento 3: "+ tienda.buscarElemento(tienda.getCatalogo().get(3)));
        
        //ordenar por precio
        System.out.println("--ordenar por precio---");
        tienda.ordenarPrecio();
        tienda.imprimirCatalogo();
        
        
        System.out.println("--busqueda binaria---");
        Moviles movil = new Moviles(tienda.getCatalogo().get(3));
        System.out.println(movil);
        System.out.println("posicion del movil es : " + tienda.buscarElementoBinario(movil));
        
        
        System.out.println("--eliminar elementos---");
         Catalogo tiendaEliminar = new Catalogo();
         tiendaEliminar.add(tienda.getCatalogo().get(3));
         tiendaEliminar.add(tienda.getCatalogo().get(2));
         System.out.println("--lista a eliminar---");
         tiendaEliminar.imprimirCatalogo();
                
        tienda.eliminarElementos(tiendaEliminar);
        System.out.println("--tienda sin los elementos---");
        tienda.imprimirCatalogo();
        
    }
}
