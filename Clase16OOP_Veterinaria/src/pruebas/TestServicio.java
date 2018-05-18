package pruebas;

public class TestServicio {

    public static void main(String[] args) {
        System.out.println("[..] Servicio Canino");

        // reutilizacion de codigo
        // simplicidad
        // representar la realidad
        // escalabilidad
        // ordenado
        // nombre simple de comprender
        // herencia, o jerarquia
        // rederinir reglas, override

        System.out.println("1. --- probando ---- ");        
        Peluqueria chigua = new Peluqueria();
        chigua.setNombre("Chiguagua");
        chigua.setPrecio(200);
        
        Peluqueria dover = new Peluqueria();
        dover.setNombre("Doverman");
        dover.setPrecio(300);
        
        Guarderia angora = new Guarderia();
        angora.setNombre("Angora");
        angora.setPrecio(500);
        
        Guarderia huron = new Guarderia();
        huron.setNombre("Uron Pepe");
        huron.setPrecio(100);
        
        System.out.println("" + chigua);
        System.out.println("" + dover);
        System.out.println("" + angora);
        System.out.println("" + huron);
        
        System.out.println("2. ----------------- ");        
        
//        Peluqueria colita = new Servicio();
                
        Servicio seter = new Peluqueria();
        seter.setNombre("Setter Corte Total");
        seter.setPrecio(1000);
        
        Servicio grandanes = new Guarderia();
        grandanes.setNombre("Guardame el Grandanes");
        grandanes.setPrecio(5000);
        
        System.out.println("" + seter     );
        System.out.println("" + grandanes );
        
        System.out.println("3. ----------------- ");        
        System.out.println("4. ----------------- ");        
        System.out.println("5. ----------------- ");        
        
        System.out.println("[OK] Servicio Canino");
    }

//    class InternaDelServicio {// inner class
//
//    }
//
//    class InternaDelServicio2 {
//
//    }
}

//public class OtraFueraDelServicio {
//}
//
//class OtraFueraDelServicio2 {
//}
//
//class OtraFueraDelServicio4 {
//}
