
package Logica;


public class NoPerecedero extends Producto {
    public int Garantia;
    
    public NoPerecedero(int ID, String nombre, int precio, int cantidadenInv, int Garantia){
    super(ID, nombre, precio, cantidadenInv);
    this.Garantia = Garantia;
    }

    public int getGarantia() {
        return Garantia;
    }

    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
    }
    
    
    @Override
    public void Imprimir(){
        System.out.println("Garantia del producto: " +Garantia);
    }
}
