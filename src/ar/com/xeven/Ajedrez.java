package ar.com.xeven;

public class Ajedrez {
    //atributos
    private String nombrePieza;
    private int valorPieza;
    private int cantidad;

    //constructor
    public Ajedrez(String nombrePieza, int valorPieza, int cantidad) {
        this.nombrePieza = nombrePieza;
        this.valorPieza = valorPieza;
        this.cantidad = cantidad;
    }

    //metodos
    public Boolean esCapturable(){
        return this.cantidad>0;
    }

    public void captura(){
        this.cantidad--;
    }

    //getter
    public int getValorPieza() {
        return valorPieza;
    }

    //toString
    @Override
    public String toString() {
        return nombrePieza+" ("+valorPieza+ (valorPieza == 1 ? " peon)" : " peones)");
    }
}
