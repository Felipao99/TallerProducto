
package Logica;


public class Perecedero extends Producto{
    public int FechaCaducidad;
    public double TemperaturadeAlmace;
    
    public Perecedero(int ID, String nombre, int precio, int cantidadenInv, int FechaCaducidad, double TemperaturadeAlmace){
    super(ID, nombre, precio, cantidadenInv);
    this.FechaCaducidad = FechaCaducidad;
    this.TemperaturadeAlmace = TemperaturadeAlmace;
    
}

    public int getFechaCaducidad() {
        return FechaCaducidad;
    }

    public void setFechaCaducidad(int FechaCaducidad) {
        this.FechaCaducidad = FechaCaducidad;
    }

    public double getTemperaturadeAlmace() {
        return TemperaturadeAlmace;
    }

    public void setTemperaturadeAlmace(double TemperaturadeAlmace) {
        this.TemperaturadeAlmace = TemperaturadeAlmace;
    }
    
    
    @Override
    public void Imprimir(){
        System.out.println("Fecha de vencimiento: " +FechaCaducidad);
        System.out.println("Temperatura de almacenamiento: " +TemperaturadeAlmace);
        
    }
}