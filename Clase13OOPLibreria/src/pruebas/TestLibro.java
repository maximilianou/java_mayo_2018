package pruebas;

import entidades.Libro;

public class TestLibro {
    public static void main(String[] args) {
        System.out.println("[..] Test Libro");
        
        Libro elPrincipito = new Libro();
        
        Libro viajeAlCento = new Libro();
        
        Libro harryPoter = new Libro();
        
        elPrincipito.setTitulo("El Principito");
//        elPrincipito.titulo = "El Peladito";
                
        elPrincipito.setAutor("Antoan Suferin");
        
        viajeAlCento.setTitulo("Viaje al Centro de la Tierra");
        viajeAlCento.setAutor("Julito Verne");
        
        harryPoter.setTitulo("Harry Poter y la Camara Secreta");
        harryPoter.setAutor("J K Rouly");

        System.out.println("" + elPrincipito.getTitulo());        
        System.out.println("" + viajeAlCento.getTitulo());        
        System.out.println("" + harryPoter.getTitulo());        
        
        System.out.println("" + elPrincipito);
        System.out.println("" + viajeAlCento);
        System.out.println("" + harryPoter);
        
        System.out.println("" + elPrincipito.toString());
        System.out.println("" + viajeAlCento.toString());
        System.out.println("" + harryPoter.toString());
        
        System.out.println("[OK] Test Libro");
    }
}
