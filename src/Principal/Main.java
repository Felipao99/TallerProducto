
package Principal;

import Logica.NoPerecedero;
import Logica.Perecedero;
import Logica.Producto;
import java.util.Scanner;
    

public class Main {
    public static void main(String[] args) {
        
    
    GestorInventario GesInv = new GestorInventario(5);
    
   
        Scanner in = new Scanner(System.in);
        int opc;
        
        try {
            do {
                System.out.println("\n Menu: ");
                System.out.println("1. Añadir un producto.");
                System.out.println("2. Mostrar productos.");
                System.out.println("3. Buscar un producto por medio del ID.");
                System.out.println("4. Modificar producto.");
                System.out.println("5. Eliminar producto por ID.");
                System.out.println("6. Salir.");
                System.out.print("Seleccione una opción: ");
                opc = in.nextInt();
                
                switch (opc) {
                    case 1: 
                        System.out.println("Ingrese las especificaciones del producto:");
                        
                        // Pidiendo datos al usuario
                        System.out.print("ID del producto: ");
                        int idproducto = in.nextInt();
                        
                        System.out.print("Nombre del producto: ");
                        String nombre = in.next();
                        
                        System.out.print("Precio del producto: ");
                        int precio = in.nextInt();
                        
                        System.out.print("Cantidad actual en el inventario: ");
                        int cantidadenInv = in.nextInt();
                        
                        System.out.print("Días de vencimiento del producto: ");
                        int FechaCaducidad = in.nextInt();
                        
                        System.out.print("Temperatura necesaria del producto: ");
                        double TemperaturaAlmace = in.nextDouble();
                        
                        // Llamada al método para añadir el producto
                        GesInv.agregarProducto(new Perecedero(idproducto, nombre, precio, cantidadenInv, FechaCaducidad, TemperaturaAlmace));
                        
                        System.out.println("Producto añadido correctamente.");
                        break;
                        
                        
                    case 2: System.out.println("Ingrese las especificaciones del producto no perecedero:");
                        
                        // Pidiendo datos al usuario
                        System.out.print("ID del producto: ");
                        int ProductoNPID = in.nextInt();
                        in.nextLine();
                        
                        System.out.print("Nombre del producto: ");
                        String nombreNP = in.next();
                        
                        System.out.print("Precio del producto: ");
                        int precioNP = in.nextInt();
                        
                        System.out.print("Cantidad actual en el inventario: ");
                        int cantidadenInvNP = in.nextInt();
                        
                        System.out.print("Ingrese la Garantia del producto: ");
                        int Garantia = in.nextInt();
                        in.nextLine();
                        
                        // Llamada al método para añadir el producto
                        NoPerecedero productoNP = new NoPerecedero(ProductoNPID, nombreNP, precioNP, cantidadenInvNP, Garantia);
                        GesInv.agregarProducto(productoNP);

                        System.out.println("Producto no perecedero añadido correctamente.");
                        
                        break;
                        
                    case 3:
                        
                        GesInv.mostrarProducto();
                        break;
                        
                        //caso de busqueda
                    case 4:
                        System.out.print("Ingrese el ID del producto que desea buscar: ");
                        int BusqdaID = in.nextInt();
                        GesInv.buscarProductoconID(BusqdaID);
                        break;
                      //caso de modificacion
                    case 5:
                        System.out.print("Ingrese el ID del producto que desea modificar: ");
                        int ModID = in.nextInt();
                        GesInv.ModificarProducto(ModID);
                        break;  // Agregado el break aquí
                        //caso de eliminacion
                    case 6:
                        System.out.print("Ingrese el ID del producto que desea eliminar: ");
                        int EliID = in.nextInt();
                        GesInv.EliminarProducto(EliID);
                        break;
                    
                    case 7:
                       
                        System.out.println("Saliendo del programa.");
               
                        
                        
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                        
                }
            } while (opc != 7);
            
        } catch (Exception e) {
           
        }
    }
}
   
   