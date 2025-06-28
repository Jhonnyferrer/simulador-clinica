package simuladorclinica;

public class NodoBST {
     Expediente dato;
    NodoBST izquierda, derecha;

    public NodoBST(Expediente dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}
