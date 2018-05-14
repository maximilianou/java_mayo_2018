package modulo.ventas;

// clase
public class Venta {

    // atributo
    private int total;

    // Encapsulamiento, puso privado los atributos
    // y permitio publicamente acceder por metodos
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        if( total < 1){
             throw new RuntimeException("Olvidate, Minimo positivo chavon!! : " + total);
        }
        this.total = total;
    }
    
}
