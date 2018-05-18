package entidades;

public class MaterialPorLitro extends Material{

    @Override
    public String toString() {
        return "Por Litro: " + getNombre(); 
    }
    
}
