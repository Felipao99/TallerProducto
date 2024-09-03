
package Logica;


public class Producto {
    public int ID;
    public String nombre;
    public int precio;
    public int cantidadenInv;
    
    public Producto (int ID, String nombre, int precio, int cantidadenInv){
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadenInv = cantidadenInv;
        
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadenInv() {
        return cantidadenInv;
    }

    public void setCantidadenInv(int cantidadenInv) {
        this.cantidadenInv = cantidadenInv;
    }
    
    
    public void Imprimir(){
        System.out.println("ID: " +ID);
        System.out.println("Nombre del producto: " +nombre);
        System.out.println("Precio del producto: " +precio);
        System.out.println("Cantidad en el inventario: " +cantidadenInv);
    }
    
   
     

}
