/**
    * @author: Juan Diego Solís Martínez
    * @version: 1.0.0
    * @creationDate: 11/08/2023
    * @modificationDate: 13/08/2023
    * Esta clase modela un Comprador de forma general para ser utilizado en otras clases
*/

/**
 * Esta clase modela a un Comprador que desea adquirir boletos para un evento
 * Proporciona información sobre su nombre, email, cantidad de boletos que desea comprar y su presupuesto
*/
public class Comprador {

    // Atributos
    private String nombre;
    private String email;
    private int cantidadBoletos;
    private double presupuestoMax;

    // Métodos

    /**
     * Constructor por defecto para crear una instancia de la clase Comprador con valores por defecto
     * Este constructor no recibe parámetros y se utiliza para inicializar un Comprador
    */
    public Comprador(){
        nombre = null;
        email = null;
        cantidadBoletos = 0;
        presupuestoMax = 0;
    }

    /**
     * Constructor para crear una instancia de la clase Comprador
     * 
     * @param nombre El nombre del comprador
     * @param email La dirección de correo electrónico del comprador
     * @param cantidadBoletos La cantidad de boletos que el comprador desea adquirir
     * @param presupuestoMax El presupuesto máximo del comprador para la compra de boletos
    */
    public Comprador(String nombre, String email, int cantidadBoletos, double presupuestoMax) {
        this.nombre = nombre;
        this.email = email;
        this.cantidadBoletos = cantidadBoletos;
        this.presupuestoMax = presupuestoMax;
    }

    /**
     * Obtiene el nombre del comprador
     * @return El nombre del comprador
    */
    public String getNombre() {
        return nombre;
    }

    /**
     * Actualiza el nombre del comprador
     * @param nombre El nuevo nombre del comprador
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el email del comprador
     * @return El email del comprador
    */
    public String getEmail() {
        return email;
    }

    /**
     * Actualiza el email del comprador
     * @param email El nuevo email del comprador
    */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la cantidad de boletos que está solicitando el comprador
     * @return La cantidad de boletos que solicita el comprador
    */
    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    /**
     * Actualiza la cantida de boletos que solicita el comprador
     * @param cantidadBoletos La nueva cantidad de boletos que solicita el comprador
    */
    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    /**
     * Obtiene el presupuesto máximo que tiene el comprador
     * @return El presuppuesto máximo que tiene el comprador
    */
    public double getPresupuestoMax() {
        return presupuestoMax;
    }

    /**
     * Actualiza el presupuesto máximo que tiene el comprador
     * @param prespuestoMax El nuevo presupuesto que tiene el comprador
    */
    public void setPresupuestoMax(double presupuestoMax) {
        this.presupuestoMax = presupuestoMax;
    }

    /**
     * Devuelve una cadena de texto que muestra a la instancia de la clase Comprador
     * @return Una cadena de texto que muestra la información del Comprador
    */
    public String toString() {
        String estado = "Nombre: " + this.nombre + "\nEmail: "+ this.email + "\nBoletos solicitados: "+ this.cantidadBoletos + "\nPresupuesto: "+ this.presupuestoMax;

        return estado;
    }
    
}