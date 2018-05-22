package entidades;

public class MaterialPorMetroCuadrado extends Material {

    @Override
    public String toString() {
        return "Por Metro: " + getNombre() + " : " + getPrecio(); 
    }
    
    
    
}
