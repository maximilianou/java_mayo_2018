package pruebas;


public class Peluqueria extends Servicio {

    
    @Override
    public String toString() {
        
        return "Hoy Peluqueria: " 
                + getNombre() + " : " 
                + getPrecio() ; 
    }
    
    
    
}
