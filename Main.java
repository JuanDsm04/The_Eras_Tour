/*
    * @author: Juan Diego Solís Martínez
    * @version: 1.0.0
    * @creationDate: 11/08/2023
    * @modificationDate: 13/08/2023
    * Esta clase es la primera interacción del usuario con el programa
*/

import java.util.Scanner;

/**
 * Esta clase contiene el método de inicio (Main) para ejecutar el programa, siendo la primera interacción con el usuario
*/
public class Main{

    /**
     * Punto de entrada del programa The Eras Tour.
     * Este método inicia la ejecución del programa, permitiendo a los usuarios interactuar con la aplicación
     * para ingresar sus datos, realizar las solicitudes de boletos y generar reportes. Utiliza instancias de las clases 
     * Localidad y Venta para llevar a cabo todas las operaciones.
    */
    public static void main(String[] args) {

        Localidad localidad1 = new Localidad(1, 100, 20);
        Localidad localidad5 = new Localidad(5, 500 ,20);
        Localidad localidad10 = new Localidad(10, 1000, 20);
        Venta venta = new Venta();
        
        Scanner teclado = new Scanner(System.in);
        String opString = "";
        int opcion = 0;
        boolean repetir = false;
        Comprador nuevoComprador = new Comprador();
        while (!repetir){
            System.out.println("\n----------------------------------");
            System.out.println("           THE ERAS TOUR");
            System.out.println("----------------------------------");
            System.out.println("1. Nuevo comprador");
            System.out.println("2. Nueva solicitud de boletos");
            System.out.println("3. Consultar disponibilidad total");
            System.out.println("4. Consultar disponibilidad individual");
            System.out.println("5. Reporte de caja");
            System.out.println("6. Salir");
            System.out.print("Seleccione la opción que desea: ");
            opString = teclado.nextLine();
            try{
				opcion = Integer.parseInt(opString);
				if (opcion<1 || opcion>6){
					System.out.println("Debe ingresar una de las opciones del menú");
                } else {

                    switch (opcion) {
                        case 1:
                            System.out.println("\n----------------------------------");
                            System.out.println("          NUEVO COMPRADOR");
                            System.out.println("----------------------------------");
                            System.out.print("Ingrese el nombre: ");
                            String nombre = teclado.nextLine();

                            System.out.print("Ingrese el email: ");
                            String email = teclado.nextLine();

                            System.out.print("Ingrese la cantidad de boletos a comprar: ");
                            String cantidadBoletosString = teclado.nextLine();

                            System.out.print("Ingrese el presupuesto máximo: ");
                            String presupuestoString = teclado.nextLine();

                            try{
                                int cantidadBoletos = Integer.parseInt(cantidadBoletosString);
                                double presupuesto = Double.parseDouble(presupuestoString);

                                nuevoComprador = new Comprador(nombre, email, cantidadBoletos, presupuesto);
                        
                            }catch(Exception e){
                                System.out.println("Debe ingresar valores válidos\n");
                            }

                            break;
                        
                        case 2:
                            // Verificar los valores de los atributos
                            if (nuevoComprador.getNombre() != null && nuevoComprador.getEmail() != null && nuevoComprador.getCantidadBoletos() > 0 &&
                            nuevoComprador.getPresupuestoMax() > 0) {
                                System.out.println("\n----------------------------------");
                                System.out.println("   NUEVA SOLICITUD DE BOLETOS");
                                System.out.println("----------------------------------"); 
                                venta.realizarVenta(localidad1, localidad5, localidad10, nuevoComprador);
                            } else {
                                System.out.println("El comprador tiene datos inválidos o ya solicitó boletos anteriormente");
                            }

                            // Reinicia la instancia para evitar que el mismo usuario vuelva a pedir boletos
                            nuevoComprador = new Comprador();
                            break;

                        case 3:
                            System.out.println("\n----------------------------------");
                            System.out.println("      DISPONIBILIDAD TOTAL");
                            System.out.println("----------------------------------");
                            venta.consultarDisponTotal(localidad1, localidad5, localidad10);
                            break;

                        case 4:
                            System.out.println("\n----------------------------------");
                            System.out.println("    DISPONIBILIDAD INDIVIDUAL");
                            System.out.println("----------------------------------");
                            System.out.print("Ingrese el número de la localidad que quiere consultar: ");
                            int localidad = 0;
                            opString = teclado.nextLine();
                            try{
                                localidad = Integer.parseInt(opString);

                                venta.consultarDisponIndividual(localidad, localidad1, localidad5, localidad10);
                            
                            }catch(Exception e){
                                System.out.println("Debe ingresar un número entero válido\n");
                            }

                            break;

                        case 5:
                            System.out.println("\n----------------------------------");
                            System.out.println("         REPORTE DE CAJA");
                            System.out.println("----------------------------------");
                            venta.reporteCaja(localidad1, localidad5, localidad10);
                            break;

                        default:
                            System.out.println("Gracias por usar el programa");
                            repetir = true;
                            break;
                    }
                }   
			}
			catch(Exception e){
				System.out.println("Debe ingresar un número entero válido\n");
			}
		}
    }
}