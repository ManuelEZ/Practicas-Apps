package Dominio;

public class PaqueteFull extends Cliente {

    private int abono;
    private int deportes;
    private int peliculas;
    private int total;

    public PaqueteFull(int deportes, int peliculas, int total, int numAbonado, String nombre, int cantFamiliares) {
        super(numAbonado, nombre, cantFamiliares);
        this.deportes = deportes;
        this.peliculas = peliculas;
        this.total = total;
    }

    public PaqueteFull() {
    }

    public int getDeportes() {
        return deportes;
    }

    public void setDeportes(int deportes) {
        this.deportes = deportes;
    }

    public int getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(int peliculas) {
        this.peliculas = peliculas;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

   
    public int calcularTotal() {
        abono = 1000;
        if ((peliculas + deportes) > 100) {
            total = abono + 200;
        } else {
            total = abono;
        }
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPaqueteFull:" + "| Abono=" + abono + " | Deportes=" + deportes + " | Peliculas=" + peliculas + ". Total=" + total;
    }

}
