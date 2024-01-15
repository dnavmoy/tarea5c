/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author Dan_n
 */
public class Moviles {
    
    private String marca;
    private String modelo;
    private double tamPantalla;
    private int tamBateria;
    private double Precio;

    public Moviles(String marca, String modelo, double tamPantalla, int tamBateria, double Precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamPantalla = tamPantalla;
        this.tamBateria = tamBateria;
        this.Precio = Precio;
    }
    
    public Moviles(Moviles copia){
         this.marca = copia.getMarca();
        this.modelo = copia.getModelo();
        this.tamPantalla = copia.getTamPantalla();
        this.tamBateria = copia.getTamBateria();
        this.Precio = copia.getPrecio();
        
    }
    
    public Moviles(){
        
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTamPantalla() {
        return tamPantalla;
    }

    public int getTamBateria() {
        return tamBateria;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamPantalla(double tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    public void setTamBateria(int tamBateria) {
        this.tamBateria = tamBateria;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.marca);
        hash = 43 * hash + Objects.hashCode(this.modelo);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.tamPantalla) ^ (Double.doubleToLongBits(this.tamPantalla) >>> 32));
        hash = 43 * hash + this.tamBateria;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.Precio) ^ (Double.doubleToLongBits(this.Precio) >>> 32));
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
        final Moviles other = (Moviles) obj;
        if (Double.doubleToLongBits(this.tamPantalla) != Double.doubleToLongBits(other.tamPantalla)) {
            return false;
        }
        if (this.tamBateria != other.tamBateria) {
            return false;
        }
        if (Double.doubleToLongBits(this.Precio) != Double.doubleToLongBits(other.Precio)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Moviles{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", tamPantalla=").append(tamPantalla);
        sb.append(", tamBateria=").append(tamBateria);
        sb.append(", Precio=").append(Precio);
        sb.append('}');
        return sb.toString();
    }
    
    
            
    
}
