package pruebas;


public class Auto {


    private String patente;
    private int velocidad;

    @Override
    public String toString() {
        return "" + patente + " : velocidad= " + velocidad;
    }

    
    /**
     * @return the patente
     */
    public String getPatente() {
        
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        // tengo la posibilidad de verificar que no sea vacio
        if(patente.isEmpty()  ){
            throw new RuntimeException("Patente Incorrecta: [" + patente + "]");
        }
        this.patente = patente;
    }

    void acelerar() {
        velocidad += 10;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void frenar() {
        if( velocidad > 9 ){ // pongo cota minima de frenado
          velocidad -= 10;
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
