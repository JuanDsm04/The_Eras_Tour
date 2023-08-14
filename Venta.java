/**
    * @author: Juan Diego Solís Martínez
    * @version: 1.0.0
    * @creationDate: 11/08/2023
    * @modificationDate: 13/08/2023
    * Esta clase modela una venta de Ticket de forma general para ser utilizado en otras clases
*/

import java.util.Random;

/**
 * Esta clase modela a una Venta e boletos para un evento
*/
public class Venta {
    
    /**
     * Constructor por defecto para crear una instancia de la clase Venta
     * Este constructor no recibe parámetros y se utiliza para inicializar una venta
    */
    public Venta(){

    }

    /**
     * Este método realiza todo el proceso lógico y verifica las condiciones para determinar si los boletos se pueden vender
     * 
     * @param localidad1 El objeto de tipo Localidad que trae la información necesaria para verificar las condiciones
     * @param localidad5  El objeto de tipo Localidad que trae la información necesaria para verificar las condiciones
     * @param localidad10  El objeto de tipo Localidad que trae la información necesaria para verificar las condiciones
     * @param nuevoComprador El objeto de tipo Comprador que trae la información necesaria para vender el boleto
    */
    public void realizarVenta(Localidad localidad1, Localidad localidad5, Localidad localidad10, Comprador nuevoComprador){
        Ticket ticket = new Ticket();

        // Generar número random de 1 a 1500 para el ticket
        Random value = new Random();
        int num_ticket = value.nextInt(15000) + 1;

        // Verificar si se le puede vender a ese número de ticket
        boolean disponibilidad = ticket.verificarDisponibilidad(num_ticket);

        if (disponibilidad){
            // Asignar localidad y crear el ticket completo apto para compra
            int localidad = ticket.asignarLocalidad();
            ticket = new Ticket(num_ticket, disponibilidad, localidad);

            // Validar el espacio en localidad

            switch (ticket.getLocalidad()) {
                case 1: // Localidad 1

                    // Verificar que aún hayan boletos
                    if (localidad1.getCantEspacios() == 0){
                        System.out.println("La localidad 1 ya no tiene espacio");
                    } else {

                        // Verificar si hay suficientes boletos
                        if (nuevoComprador.getCantidadBoletos() > localidad1.getCantEspacios()){ // Si no hay sufientes
                            
                            // Verificar si el precio de los boletos es mayor al presupuesto del comprador
                            double total = localidad1.getCantEspacios() * localidad1.getPrecio();
                            
                            if (total > nuevoComprador.getPresupuestoMax()){ // Si no le alcanza el presupuesto
                                System.out.println("Tu presupuesto no es suficiente para comprar los boletos");

                            } else { // Si le alcanza, entonces se venden los boletos restantes

                                System.out.println("COMPROBANTE:");
                                System.out.println(nuevoComprador);
                                System.out.println("\nBoletos comprados: " + localidad1.getCantEspacios() + "\nLocalidad: 1" 
                                + "\nTotal: Q" + total);
                                localidad1.setCantEspacios(0);
                                
                            }
                            
                        } else { // Si hay suficientes
    
                            // Verificar si el precio de los boletos es mayor al presupuesto del comprador
                            double total = nuevoComprador.getCantidadBoletos() * localidad1.getPrecio();
                            
                            if (total > nuevoComprador.getPresupuestoMax()){ // Si no le alcanza el presupuesto
                                System.out.println("Tu presupuesto no es suficiente para comprar los boletos");

                            } else { // Si le alcanza el presupuesto, entonces se le venden los boletos
                                System.out.println("COMPROBANTE:");
                                System.out.println(nuevoComprador);
                                System.out.println("\nBoletos comprados: " + nuevoComprador.getCantidadBoletos() + "\nLocalidad: 1" 
                                + "\nTotal: Q" + total);
                                localidad1.setCantEspacios(localidad1.getCantEspacios() - nuevoComprador.getCantidadBoletos());

                            }
                        }

                    }
                    break;

                case 5: // Localidad 5

                    // Verificar que aún hayan boletos
                    if (localidad5.getCantEspacios() == 0){
                        System.out.println("La localidad 5 ya no tiene espacio");
                    } else {
                        // Verificar si hay suficientes boletos
                        if (nuevoComprador.getCantidadBoletos() > localidad5.getCantEspacios()){ // Si no hay sufientes
                            
                            // Verificar si el precio de los boletos es mayor al presupuesto del comprador
                            double total = localidad5.getCantEspacios() * localidad5.getPrecio();
                            
                            if (total > nuevoComprador.getPresupuestoMax()){ // Si no le alcanza el presupuesto
                                System.out.println("Tu presupuesto no es suficiente para comprar los boletos");

                            } else { // Si le alcanza
                                System.out.println("COMPROBANTE:");
                                System.out.println(nuevoComprador);
                                System.out.println("\nBoletos comprados: " + localidad5.getCantEspacios() + "\nLocalidad: 5" 
                                + "\nTotal: Q" + total);
                                localidad5.setCantEspacios(0);

                            }
                            
                        } else { // Si hay suficientes
    
                            // Verificar si el precio de los boletos es mayor al presupuesto del comprador
                            double total = nuevoComprador.getCantidadBoletos() * localidad5.getPrecio();
                            
                            if (total > nuevoComprador.getPresupuestoMax()){ // Si no le alcanza el presupuesto
                                System.out.println("Tu presupuesto no es suficiente para comprar los boletos");

                            } else { // Si le alcanza el presupuesto, entonces se le venden los boletos
                                System.out.println("COMPROBANTE:");
                                System.out.println(nuevoComprador);
                                System.out.println("\nBoletos comprados: " + nuevoComprador.getCantidadBoletos() + "\nLocalidad: 5" 
                                + "\nTotal: Q" + total);
                                localidad5.setCantEspacios(localidad5.getCantEspacios() - nuevoComprador.getCantidadBoletos());

                            }
                        }
                    }
                    break;

                case 10: // Localidad 10

                    // Verificar que aún hayan boletos
                    if (localidad10.getCantEspacios() == 0){
                        System.out.println("La localidad 10 ya no tiene espacio");
                    } else {
                        // Verificar si hay suficientes boletos
                        if (nuevoComprador.getCantidadBoletos() > localidad10.getCantEspacios()){ // Si no hay sufientes
                            
                            // Verificar si el precio de los boletos es mayor al presupuesto del comprador
                            double total = localidad10.getCantEspacios() * localidad10.getPrecio();
                            
                            if (total > nuevoComprador.getPresupuestoMax()){ // Si no le alcanza el presupuesto
                                System.out.println("Tu presupuesto no es suficiente para comprar los boletos");

                            } else { // Si le alcanza entonces se le venden los boletos
                                System.out.println("COMPROBANTE:");
                                System.out.println(nuevoComprador);
                                System.out.println("\nBoletos comprados: " + localidad10.getCantEspacios() + "\nLocalidad: 10" 
                                + "\nTotal: Q" + total);
                                localidad10.setCantEspacios(0); 

                            }
                            
                        } else { // Si hay suficientes
    
                            // Verificar si el precio de los boletos es mayor al presupuesto del comprador
                            double total = nuevoComprador.getCantidadBoletos() * localidad10.getPrecio();
                            
                            if (total > nuevoComprador.getPresupuestoMax()){ // Si no le alcanza el presupuesto
                                System.out.println("Tu presupuesto no es suficiente para comprar los boletos");

                            } else { // Si le alcanza el presupuesto, entonces se le venden los boletos
                                System.out.println("COMPROBANTE:");
                                System.out.println(nuevoComprador);
                                System.out.println("\nBoletos comprados: " + nuevoComprador.getCantidadBoletos() + "\nLocalidad: 10" 
                                + "\nTotal: Q" + total);
                                localidad10.setCantEspacios(localidad10.getCantEspacios() - nuevoComprador.getCantidadBoletos());

                            }
                        }
                    }
                    break;
            }

        } else {
            System.out.println("No es apto para la venta de boletos");
        }
    }

    /**
     * Este método muestra los boletos vendidos y disponibles en cada localidad
     * 
     * @param localidad1 El objeto de tipo Localidad que trae la información necesaria para relizar la consulta
     * @param localidad5  El objeto de tipo Localidad que trae la información necesaria para relizar la consulta
     * @param localidad10  El objeto de tipo Localidad que trae la información necesaria para relizar la consulta
    */
    public void consultarDisponTotal(Localidad localidad1, Localidad localidad5, Localidad localidad10){
        System.out.println("Boletos vendidos:");
        System.out.println("Localidad 1: " + (20-localidad1.getCantEspacios()));
        System.out.println("Localidad 5: " + (20-localidad5.getCantEspacios()));
        System.out.println("Localidad 10: " + (20-localidad10.getCantEspacios()));

        System.out.println("\nBoletos disponibles:");
        System.out.println("Localidad 1: " + localidad1.getCantEspacios());
        System.out.println("Localidad 5: " + localidad5.getCantEspacios());
        System.out.println("Localidad 10: " + localidad10.getCantEspacios());
    }

    /**
     * Este método consulta la disponibilidad de boletos de forma individual de la localidad que el usuario ingrese
     * 
     * @param localidad El número de la localidad que el usuario quiere consultar
     * @param localidad1 El objeto de tipo Localidad que trae la información necesaria para relizar la consulta
     * @param localidad5  El objeto de tipo Localidad que trae la información necesaria para relizar la consulta
     * @param localidad10  El objeto de tipo Localidad que trae la información necesaria para relizar la consulta
    */
    public void consultarDisponIndividual(int localidad, Localidad localidad1, Localidad localidad5, Localidad localidad10){

        switch (localidad) {
            case 1:
                System.out.println(localidad1);
                break;
            
            case 5:
                System.out.println(localidad5);
                break;

            case 10:
                System.out.println(localidad10);
                break;
        
            default:
                System.out.println("La localidad ingresada no es válida, intente con: 1, 5 o 10");
                break;
        }
    }

    /**
     * Este método realiza el reporte de caja, mostrando el dinero generado en cada localidad
     * 
     * @param localidad1 El objeto de tipo Localidad que trae la información necesaria para relizar las operaciones
     * @param localidad5  El objeto de tipo Localidad que trae la información necesaria para relizar la operaciones
     * @param localidad10  El objeto de tipo Localidad que trae la información necesaria para relizar la operaciones 
    */
    public void reporteCaja(Localidad localidad1, Localidad localidad5, Localidad localidad10){
        double generadoLocalida1 = (20 - localidad1.getCantEspacios()) * localidad1.getPrecio();
        double generadoLocalida5 = (20 - localidad5.getCantEspacios()) * localidad5.getPrecio();
        double generadoLocalida10 = (20 - localidad10.getCantEspacios()) * localidad10.getPrecio();

        System.out.println("Dinero generado en la Localidad 1: " + generadoLocalida1);
        System.out.println("Dinero generado en la Localidad 5: " + generadoLocalida5);
        System.out.println("Dinero generado en la Localidad 10: " + generadoLocalida10);
    }

}