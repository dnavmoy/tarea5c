/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author Dan_n
 */
public class Catalogo {
    
    private ArrayList<Moviles> catalogo;
    
    public Catalogo() {
        catalogo = new ArrayList();
        
    }
    
    public void add(Moviles movil) {
        catalogo.add(movil);
    }

    public void remove(Moviles movil) {
        catalogo.remove(movil);
    }
    
    public int numeroElementos() {
        int numero = 0;
        
        return numero = catalogo.size();
    }

    public boolean estaVacio() {
        boolean vacio = (catalogo.isEmpty());
        
        return vacio;
        
    }

    public void verElemento(int elemento) {
        System.out.println(catalogo.get(elemento));
    }
    
    public void cambiarElemento(int elemento, Moviles movil) {
        catalogo.remove(elemento);
        catalogo.add(elemento, movil);
    }

    public void guardarElemento(Moviles movil) {
        catalogo.add(movil);
    }
    
    public void eliminarElemento(int elemento) {
        catalogo.remove(elemento);
    }
    
    public void eliminarElemento(Moviles movil) {
        catalogo.remove(movil);
    }
    
    public void eliminarElementos(Catalogo lista) {
        Iterator<Moviles> it = lista.catalogo.iterator();
        
        while (it.hasNext()) {
            eliminarElemento(it.next());
        }
        
    }
    
    public void eliminarTodos(){
        catalogo.removeAll(catalogo);
    }
    
    
    public void imprimirCatalogo(){
        
        catalogo.forEach(System.out::println);
    }
    
    public int buscarElemento(Moviles movil){
        int posicion = catalogo.indexOf(movil);
        return posicion;
        
    }
    
    public void ordenarPrecio(){
        Collections.sort(catalogo, (e1,e2)-> Double.compare(e1.getPrecio(), e2.getPrecio()));
    }
    
    public void ordenarMarca(){
        Collections.sort(catalogo, (e1,e2)-> e1.getMarca().compareTo(e2.getMarca()));
    }
    
//    public int buscarElementoBinario(double precio){
//        int posicion =0;
//        Moviles x = new Moviles();
//        x.setPrecio(precio);
//        posicion= Collections.binarySearch(catalogo, x, (e1,e2)->Double.compare(e1.getPrecio()  , e2.getPrecio()));
//        return posicion;
//    }
    
     public int buscarElementoBinario(Moviles movil){
        int posicion =0;
       
        posicion= Collections.binarySearch(catalogo, movil, (e1,e2)->Double.compare(e1.getPrecio()  , e2.getPrecio()));
        return posicion;
    }
    
    public ArrayList<Moviles> getCatalogo() {
        return catalogo;
    }
    
    public void setCatalogo(ArrayList<Moviles> catalogo) {
        this.catalogo = catalogo;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.catalogo);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Catalogo other = (Catalogo) obj;
        return Objects.equals(this.catalogo, other.catalogo);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Catalogo{");
        sb.append("catalogo=").append(catalogo);
        sb.append('}');
        return sb.toString();
    }
    
}
