package Dominio;

public class PaquetePayPerView extends Cliente {

    private int abono;
    private int deportes;
    private int peliculas;
    private int total;

    public PaquetePayPerView() {
    }

    public int getAbono() {
        return abono;
    }

    public void setAbono(int abono) {
        this.abono = abono;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDeportes() {
        return deportes;
    }

    public int getPeliculas() {
        return peliculas;
    }

    public void setDeportes(int deportes) {
        this.deportes = deportes;
    }

    public void setPeliculas(int peliculas) {
        this.peliculas = peliculas;
    }

    //Método calcular total
    
    public int calcularTotal() {
        abono = 400;
        return total = abono + (peliculas * 40) + (deportes * 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPaquetePayPerView: " + "|Abono=" + abono + " | Deportes=" + deportes + " | Peliculas=" + peliculas + ". Total=" + total;
    }

}
