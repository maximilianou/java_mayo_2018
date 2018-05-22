package pruebas;


abstract class Juego {
    private String nombre;
    private boolean tiempo;
    @Override
    public String toString() {
        return "" + getNombre() 
                + ", TIM:" + isTiempo(); 
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isTiempo() {
        return tiempo;
    }
    public void setTiempo(boolean tiempo) {
        this.tiempo = tiempo;
    }
}
