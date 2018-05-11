package pruebas;


class CentroFP {

    private String nombre;
    private String domicilio;
    private String familia;

    @Override
    public String toString() {
        return "" + getNombre() + ", " + getDomicilio() + ", " + getFamilia();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }
}






