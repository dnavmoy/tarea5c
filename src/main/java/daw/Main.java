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
     
      
        
        Catalogo tienda = new Catalogo();
        
      
        tienda.add(new Moviles("Samsun", "s1", 4.1, 1000, 188.1));
        tienda.add(new Moviles("nokia", "n2", 8.8, 2000, 88));
        System.out.println(tienda);
        System.out.println("catnidad de elementos?: "+ tienda.numeroElementos());
        
    }
}
