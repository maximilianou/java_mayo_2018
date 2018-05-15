package pruebas;
// package 

// clase
class Diagnostico  {

    // atributos
    private String codigoUnico;
    private String paciente;

    // metodo, polimorfismo por redefinicion
    @Override
    public String toString() {
        return "" + getCodigoUnico() + "::" + getPaciente() ;
    }
    // Encapsulamimento

    public String getCodigoUnico() {
        return codigoUnico;
    }
    public void setCodigoUnico(String codigoUnico) {
        if( codigoUnico.isEmpty()){
            throw new RuntimeException("Pifiaste en el codigo!![" + codigoUnico + "]");
        }
        this.codigoUnico = codigoUnico;
    }

    public String getPaciente() {
        return paciente;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    

    
}
