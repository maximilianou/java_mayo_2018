package pruebas;

/**
 * TDD: Test Driven Development
 *
 *
 */
public class TestDiagnostico {

    public static void main(String[] args) {
        System.out.println("[..] Diagnostico !!");

        // crear un diagnostico
        // el diagnositco es de pacientes
        // todos los diatnositicos son iguales
        // el diagonosito es un rotulo
        //  - un diagnositco es de 1 unico pacientes
        //  - ( despues sigo preguntando, quiero cobrar, quiero algo que ande)
        Diagnostico enfTamy = new Diagnostico();
        enfTamy.setCodigoUnico("EXP123420180515");
        System.out.println("Codigo Unico: " + enfTamy.getCodigoUnico());

        Diagnostico enfNaty = new Diagnostico();
        enfNaty.setCodigoUnico("EXP888820180515");
        System.out.println("Codigo Unico: " + enfNaty.getCodigoUnico());

        Diagnostico enfEly = new Diagnostico();
        enfEly.setCodigoUnico("EXP111120180515");
        System.out.println("Codigo Unico: " + enfEly.getCodigoUnico());

        enfTamy.setPaciente("Tamara");
        enfNaty.setPaciente("Natalia");
        enfEly.setPaciente("Elizabeth");

        System.out.println("" + enfTamy);
        System.out.println("" + enfNaty);
        System.out.println("" + enfEly);
        System.out.println("" + enfTamy
                .toString() );
        System.out.println("" + enfNaty.toString() );
        System.out.println("" + enfEly.toString() );
        System.out.println("1. --------------");
        // verifico que el codigo no puede ser vacio
        try{
            enfTamy.setCodigoUnico("");
            System.out.println("Mira PUDE PONER VACIO EL CODIGO" );
        }catch(Exception e){
            System.out.println("Verificate Esto: " + e.getMessage());
        }
        System.out.println("2. --------------");
        System.out.println("3. --------------");
        System.out.println("4. --------------");
        System.out.println("5. --------------");
        
        System.out.println("[OK] Diagnostico !!");
    }
}
