package pruebas;

public class TestCentroFP {

    public static void main(String[] args) {
        System.out.println("[..]  Test FP");

        // Comenzando a programar, idea de TDD
        // https://en.wikipedia.org/wiki/Test-driven_development
        // Declaro la instancia de el cfp27
        // y Instancio con el new el nuevo objeto
        CentroFP cfp27    = new CentroFP();
        cfp27.setNombre("Centro 27 Formacion Profesional");
 //       cfp27.nombre = "Roberto CArlos";//
        cfp27.setDomicilio("Peru 823");
        cfp27.setFamilia("Electiricidad");

        CentroFP cfp11    = new CentroFP();
        cfp11.setNombre("Centro 11 Formacion Profesional");
        cfp11.setDomicilio("Carlos Spegazzini 450");
        cfp11.setFamilia("Municipales");

        CentroFP cfp8     = new CentroFP();
        cfp8.setNombre("Centro 8 Formacion Profesinal");
        cfp8.setDomicilio("Maza 851");
        cfp8.setFamilia("Automotor");

        
        System.out.println("" + cfp27.getNombre() + ", " + cfp27.getFamilia() );
        System.out.println("" + cfp11.getNombre() + ", " + cfp11.getFamilia() );
        System.out.println("" + cfp8.getNombre()  + ", " + cfp8.getFamilia());
        
        System.out.println("" + cfp27 );
        System.out.println("" + cfp11 );
        System.out.println("" + cfp8  );
        
        System.out.println("" + cfp27.toString() );
        System.out.println("" + cfp11.toString() );
        System.out.println("" + cfp8.toString()  );
        
        System.out.println("[OK]  Test FP");
    }
}








