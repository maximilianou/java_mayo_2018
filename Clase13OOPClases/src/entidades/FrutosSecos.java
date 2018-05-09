package entidades;

/**
 *
 * @author educacion
 */
public class FrutosSecos {
    // Nombre de la clase 
    // con Mayuscula y CamelCase
    
    // atributo, minuscula camelCase
    // variables o propiedades o adjetivos o caracteristicas
    private String nombre;
    private int calorias;    
    // privado es que solo se tiene acceso a estos
    // atributos desd edentro de la calse

    // quiero imprimir el nombre y las calorias
    // sobre escribiendo el metodo() 
    // toString() heredado de Object
    @Override
    public String toString() {
        return "" + getNombre() + ", " + getCalorias(); 
    }
    // publico significa qeu se tiene acceso
    // desde cualquier programa, cualquier lugar fuera de la calse
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        // aqui podria verificar que no sea menor a 0
        this.calorias = calorias;
    }

    
    
    
}
