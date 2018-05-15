package pruebas;

/** TDD: Test Driven Development
 * 
 **/
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
        enfTamy.codigoUnico = "EXP123420180515";
        System.out.println("Codigo Unico: " + enfTamy.codigoUnico);
                
        System.out.println("[OK] Diagnostico !!");
    }
}
