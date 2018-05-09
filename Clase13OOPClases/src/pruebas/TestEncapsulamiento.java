package pruebas;
// quiero que a partir de este test 
// se tome en cuenta el encapsulamento

import entidades.FrutosSecos;

// de los atributos, accedidos por metodos
public class TestEncapsulamiento {
    public static void main(String[] args) {
        System.out.println("[..] TestEncapsulamiento ");
        
        FrutosSecos avellana = new FrutosSecos();
        FrutosSecos almendrda = new FrutosSecos();
//        avellana.nombre = "Ave  lla  nna";
        avellana.setNombre("Avellana");
        avellana.setCalorias(10000);
        almendrda.setNombre("Almendra");
        almendrda.setCalorias(8000);
        
        System.out.println("" + avellana );
        System.out.println("" + almendrda);
        
        System.out.println("[OK] TestEncapsulamiento ");
    }
}
