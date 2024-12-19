import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();


        while (true) {

            System.out.println(" --- MENU ---");
            System.out.println(" 1.- Agregar Clientes");
            System.out.println(" 2.- Mostrar Clientes");
            System.out.println(" 3.- Eliminar Clientes");
            System.out.println(" 4.- Salir");
            System.out.println(" Ingrese una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    System.out.println("----- Agregar Cliente -----");
                    System.out.println("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la cedula del cliente: ");
                    String cedula = scanner.nextLine();

                    Cliente nuevoCliente = new Cliente(nombre, cedula);
                    clientes.add(nuevoCliente);
                    System.out.println("Cliente agregado correctamente!");
                    break;

                case 2:
                    System.out.println("----- Mostrar Clientes -----");
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes registrados.");
                    } else {
                        for (Cliente cliente : clientes) {
                            System.out.println("Nombre: " + cliente.getNombre());
                            System.out.println("Cedula: " + cliente.getCedula());
                        }
                    }
                    break;

                case 3:
                    System.out.println("------ Eliminar Clientes -----");
                    System.out.println("Ingrese la cedula del cliente que desea eliminar: ");
                    String cedulaAEliminar = scanner.nextLine();

                    if (cedulaAEliminar != null){
                        for (int i = 0; i < clientes.size(); i++) {
                            Cliente cliente = clientes.get(i);
                            if (cliente.getCedula().equals(cedulaAEliminar)) {
                                clientes.remove(i);
                                System.out.println("Cliente eliminado correctamente!");
                                break;
                            } else{
                                System.out.println("Cliente no encontrado.");
                                break;
                            }
                        }
                    }

                    break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}