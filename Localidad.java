/**
    * @author: Juan Diego Solís Martínez
    * @version: 1.0.0
    * @creationDate: 11/08/2023
    * @modificationDate: 13/08/2023
    * Esta clase modela una Localidad de forma general para ser utilizado en otras clases
*/

/**
 * Esta clase modela a una Localidad que cuenta con boletos para un evento
 * Proporciona información sobre su número de localidad, el precio de sus boletos y la cantidad de espacios que tiene
*/
public class Localidad {

    // Atributos
    private int numLocalidad;
    private double precio;
    private int cantEspacios;
    
    // Métodos

    /**
     * Constructor para crear una instancia de la clase Comprador
     * 
     * @param numLocalidad El número de la localidad
     * @param precio El precio de los boletos en la localidad
     * @param cantEspacios La cantidad de espacios que tiene la localidad
    */
    public Localidad(int numLocalidad, double precio, int cantEspacios) {
        this.numLocalidad = numLocalidad;
        this.precio = precio;
        this.cantEspacios = cantEspacios;
    }

    /**
     * Obtiene el número de la localidad
     * @return El número de la localidad
    */
    public int getNumLocalidad() {
        return numLocalidad;
    }

    /**
     * Actualiza el número de la localidad
     * @param numLocalidad El nuevo número de la localidad
    */
    public void setNumLocalidad(int numLocalidad) {
        this.numLocalidad = numLocalidad;
    }

    /**
     * Obtiene el precio de los boletos
     * @return El precio de los boletos
    */
    public double getPrecio() {
        return precio;
    }

    /**
     * Actualiza el precio de los boletos
     * @param precio El nuevo precio de los boletos
    */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad de espacios
     * @return La cantidad de espacios
    */
    public int getCantEspacios() {
        return cantEspacios;
    }

    /**
     * Actualiza la cantidad de espacios
     * @param cantEspacios La nueva cantidad de espacios
    */
    public void setCantEspacios(int cantEspacios) {
        this.cantEspacios = cantEspacios;
    }

    /**
     * Devuelve una cadena de texto que muestra a la instancia de la clase Localidad
     * @return Una cadena de texto que muestra la información de la Localidad
    */
    public String toString() {
        String estado = "Hay " + this.cantEspacios + " boletos disponibles en la Localidad " + this.numLocalidad;

        return estado;
    }
    
}