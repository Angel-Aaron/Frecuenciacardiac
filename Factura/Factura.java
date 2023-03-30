
package Factura;

public class Factura {
    
    private int compra;
    private double precio,monto;
    private String numpieza,descripcion;
   
    
    public Factura(String np, String d, int cc, double p, double m){
        
       compra = c;
        precio = p;
        monto = m;
        numpieza = nump;
        descripcion = d;
    }

    public void setNpieza(String np) {
        this.numpieza = nump;
    }
    public String getNpieza() {
        return numpieza;
    }
    
    public void setDescripcion(String d) {
        this.descripcion = d;
    }
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setCompra(int cc) {
        this.compra = cc;
    }
    public int getCompra() {
        return compra;
    }

    public void setPrecio(double p) {
        this.precio = p;
    }
    public double getPrecio() {
        return precio;
    }
    public double getMonto(){
        monto = presio*compra;
        return this.monto;
        }     
}
