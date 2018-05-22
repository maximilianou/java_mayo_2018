package entidades;

public class MaterialPorUnidad extends Material {

    @Override
    public String toString() {
        return "Por Unidad : " + getNombre() + " : "+getPrecio() ; 
    }
    
    
    
    
}
