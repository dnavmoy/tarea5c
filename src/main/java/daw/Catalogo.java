/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
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

    public void add(Moviles movil){
        catalogo.add(movil);
    }
    public void remove(Moviles movil){
        catalogo.remove(movil);
    }
    
    
    
    
    public int numeroElementos(){
        int numero=0;
        
        return numero=catalogo.size();
    }
    public boolean estaVacio(){
         boolean vacio = (catalogo.isEmpty());
                
        return vacio;
                
    }
    public void verElemento(int elemento){
        System.out.println(catalogo.get(elemento));
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
