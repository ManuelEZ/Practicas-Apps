package Dominio;

public class PaqueteBasico extends Cliente{
    private int abono;

    public PaqueteBasico() {
        
    }
    
    public int getAbono() {
        return abono;
    }

    public void setAbono(int abono) {
        this.abono = abono;
    }

    
    public int calcularTotal(){
        abono = 400;
        return abono;
    }
    
    @Override
    public String toString() {
        return super.toString()+" PaqueteBasico: " + "| Abono=" + abono;
    }
   
}
