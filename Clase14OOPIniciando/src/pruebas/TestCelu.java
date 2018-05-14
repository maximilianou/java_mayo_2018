package pruebas;

import modulo.ventas.Venta;

/**
 * TDD basico conceptual https://en.wikipedia.org/wiki/Test-driven_development
 *
 */
public class TestCelu {

    public static void main(String[] args) {
        System.out.println("[..] Test Celu Compra Venta");

        int cantidad = 10;
        // Declarar una variable o instancia de Venta
        // Inicializar la Instancia u Objeto Venta
        Venta samJ1 = new Venta();
        samJ1.setTotal(5000);
        //samJ1.total = 5000;
        System.out.println("1. --- ");
        System.out.println("" + samJ1.getTotal());

        System.out.println("2. --- ");
        Venta lG = new Venta();
        lG.setTotal(8000);
        Venta motoG5 = new Venta();
        motoG5.setTotal(7000);
        System.out.println("" + lG.getTotal());
        System.out.println("" + motoG5.getTotal());
        System.out.println("" + samJ1.getTotal());
        System.out.println("3. --- ");
        System.out.println("" + samJ1);
        System.out.println("" + samJ1.toString());
        System.out.println("" + lG);
        System.out.println("" + lG.toString());
        System.out.println("" + motoG5);
        System.out.println("" + motoG5.toString());
        System.out.println("4. --- ");
        try {
            motoG5.setTotal(0);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            motoG5.setTotal(-1000);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println("" + motoG5.getTotal());

        System.out.println("5. --- ");

        System.out.println("[OK] Test Celu Compra Venta");
    }
}
