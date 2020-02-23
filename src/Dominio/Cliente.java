package Dominio;

public class Cliente {
    //Atributos
    protected int numAbonado;
    protected String nombre;
    protected int cantFamiliares;
    
    //Métodos
    public Cliente(int numAbonado, String nombre, int cantFamiliares) {
        this.numAbonado = numAbonado;
        this.nombre = nombre;
        this.cantFamiliares = cantFamiliares;
    }

    public Cliente() {
       
    }

    public int getNumAbonado() {
        return numAbonado;
    }

    public void setNumAbonado(int numAbonado) {
        this.numAbonado = numAbonado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantFamiliares() {
        return cantFamiliares;
    }

    public void setCantFamiliares(int cantFamiliares) {
        this.cantFamiliares = cantFamiliares;
    }
          
    @Override
    public String toString() {
        return "Cliente:" + "|Número de Abonado=" + numAbonado + " | Nombre=" + nombre + " | Cantidad de familiares=" + cantFamiliares;
    }            
    
}
