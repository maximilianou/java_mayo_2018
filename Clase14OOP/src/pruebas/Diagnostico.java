package pruebas;
// package 

// clase
class Diagnostico  {

    // atributos
    private String codigoUnico;
    private Paciente paciente;

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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    

    
}
