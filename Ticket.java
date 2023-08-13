/**
    * @author: Juan Diego Solís Martínez
    * @version: 1.0.0
    * @creationDate: 11/08/2023
    * @modificationDate: 13/08/2023
    * Esta clase modela un Ticket de forma general para ser utilizado en otras clases
*/

import java.util.Random;

/**
 * Esta clase modela a un ticket para la compra de boletos para un evento
 * Proporciona información sobre el su número de ticket, la disponiblilidad (si es apto para la compra) y la localidad a la que pertenece
*/
public class Ticket {

    // Atributos
    private int numTicket;
    private boolean disponibilidad;
    private int localidad;

    // Métodos

    /**
     * Constructor por defecto para crear una instancia de la clase Ticket
     * Este constructor no recibe parámetros y se utiliza para inicializar un ticket
    */
    public Ticket(){

    }

    /**
     * Constructor para crear una instancia de la clase Ticket
     * 
     * @param numTicket El número del ticket
     * @param disponibilidad La disponibilidad del ticket (si es apto o no, para para comprar boletos)
     * @param localidad La localidad a la que perteneceran los boletos que se puedan comprar con el ticket
    */
    public Ticket(int numTicket, boolean disponibilidad, int localidad) {
        this.numTicket = numTicket;
        this.disponibilidad = disponibilidad;
        this.localidad = localidad;
    }

    /**
     * Obtiene el número del ticket
     * @return El número del ticket
    */
    public int getNumTicket() {
        return numTicket;
    }

    /**
     * Actualiza número del ticket
     * @param numTicket El nuevo número del ticket
    */
    public void setNumTicket(int numTicket) {
        this.numTicket = numTicket;
    }

    /**
     * Obtiene la disponibilidad del ticket
     * @return La disponibilidad del ticket
    */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Actualiza la disponibilidad del ticket
     * @param disponibilidad El nuevo valor de disponibilidad del ticket
    */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * Obtiene la localidad a la que pertenece el ticket
     * @return La localidad a la que pertenece el ticket
    */
    public int getLocalidad() {
        return localidad;
    }
    
    /**
     * Actualiza la localidad del ticket
     * @param localidad La nueva localidad del ticket
    */
    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    /**
     * Este método verifica según el número del ticket si es apto o no para comparar boletos
     * 
     * @param ticket El número del ticket
     * @return disponibilidad Un boolean que indica si el ticket es apto o si por el contrario, no lo es
    */
    public boolean verificarDisponibilidad(int ticket){
        boolean disponibilidad;
        Random value = new Random();

        // Generar valores random para determinar el rango
        int num1 = value.nextInt(15000) + 1;
        int num2 = value.nextInt(15000) + 1;

        // Asignar el rango de números
        int min;
        int max;

        if (num1 > num2){
            min = num2;
            max = num1;
        } else {
            min = num1;
            max = num2;
        }

        // Comprobar si el ticket se encuentra dentro del rango
        if (min < ticket && max > ticket){
            disponibilidad = true;
        } else {
            disponibilidad = false;
            System.out.println("El ticket " + ticket + " no se encuentra dentro del rango de: " + min + " y " + max);
        }
        return disponibilidad;
    }

    /**
     * Este método le asigna de forma aleatoria al ticket la localidad a la cual perteneceran los boletos que podra comprar
     * 
     * @return numLocalidad El número de la localidad que le asigno al ticket
    */
    public int asignarLocalidad(){

        // Generar un número random de 1 a 3
        Random value = new Random();
        int numRandom = value.nextInt(3) + 1;

        int numLocalidad;
        switch (numRandom) {
            case 1:
                numLocalidad = 1;
                break;
            case 2:
                numLocalidad = 5;
                break;
            default:
                numLocalidad = 10;
        }

        return numLocalidad;
    }
}