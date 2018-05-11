package entidades;

public class Libro {

    private String titulo;
    private String autor;

    @Override
    public String toString() {
        return "" + getTitulo() + ", " + getAutor(); 
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}






