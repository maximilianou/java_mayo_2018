package pruebas;

import entidades.FrutosSecos;

public class TestDietetica {
    public static void main(String[] args) {
        System.out.println("[..] Test Dietetica");
        // declaro texto del tipo String de la clase String
        // Y construyo un String para poder agregarle una palabra
        String texto  = new String();
        texto += "Dietetica Pan y Agua";
        texto = texto.concat(", Boedo");
        
        System.out.println("Nuesto Texto: " + texto);
        
        // Quiero Crear una clase que aun  no he programado
        FrutosSecos pecam = new FrutosSecos();
        FrutosSecos bellota = new FrutosSecos();
        pecam.setNombre("Pecam");
        pecam.setCalorias(15000);
        bellota.setNombre("Bellota");
        bellota.setCalorias(12000);
        
        System.out.println("Nuez: " + pecam.getNombre());
        System.out.println("Nuez: " + pecam.getCalorias());
        System.out.println("Nuez: " + bellota.getNombre());
        System.out.println("Nuez: " + bellota.getCalorias());
        
        System.out.println("Nuez: " + pecam);
        System.out.println("Nuez: " + bellota);
        
        System.out.println("Nuez: " + pecam.toString());
        System.out.println("Nuez: " + bellota.toString());
        
        
        System.out.println("[OK] Test Dietetica");
    }
}








