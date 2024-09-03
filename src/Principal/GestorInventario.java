
package Principal;

import Logica.Producto;
import java.util.ArrayList;

import java.util.Scanner;


public class GestorInventario {
    private ArrayList<Producto> ListaProductos;
    public Producto [] Inventario;
    public int IndiceInventario;
    
public GestorInventario (int tamañoInventario){
    ListaProductos = new ArrayList<>();
    Inventario = new Producto [tamañoInventario];
    IndiceInventario = 0;
    
    
}

    
//Agregar producto a la lista
public void agregarProducto(Producto producto_tienda){
        ListaProductos.add(producto_tienda);
    }

    

//Mostrar productos en la lista
public void mostrarProducto(){
    for (Producto producto : ListaProductos) {
        producto.Imprimir();
        System.out.println();
    }

}
//buscar productos por ID
public Producto buscarProductoconID (int ProductoID){
    for (Producto producto : ListaProductos){
        if (producto.getID()==(ProductoID)){
            System.out.println("Producto buscado por ID: " +ProductoID);
            producto.Imprimir();
            return producto;
        
        }
        
        }
    System.out.println("Producto no encontrado, ingrese de nuevo otro ID.");
    return null; //no se encuentra, devuelve un null
    }
//modificar producto
public void ModificarProducto(int ProductoID){
    Scanner in = new Scanner (System.in);
    Producto producto = buscarProductoconID (ProductoID);
    
        if (producto !=null){
            System.out.println("Producto localizado, Escriba los nuevos datos, ");
            System.out.println("Nuevo nombre: ");
            String NombreN = in.nextLine();
            
            System.out.println("Precio nuevo: ");
            int PrecioN = in.nextInt();
            producto.setPrecio(PrecioN);
            
            System.out.println("Cantidad nueva: ");
            int CantidadN = in.nextInt();
            producto.setCantidadenInv(CantidadN);
            
        } else{
            System.out.println("Producto no hallado, vuelva a intentarlo de nuevo. ");
        }
        
}
//eliminacion de productos
public void EliminarProducto(String ProductoID){
    for (Producto eliminar : ListaProductos){
        System.out.println("Escriba el ID del producto que desea eliminar: ");
        if(ProductoID.equalsIgnoreCase(ProductoID)){
            ListaProductos.remove(eliminar);
            System.out.println("El producto ha sido eliminado. ");
            break;
            
        
        }else {
            System.out.println("El ID proporcionado no fue encontrado. ");
            break;
        }
    }
}

    public void EliminarProducto(int EliminarID) {
        
    }
}



        
        


