package pruebas;

/** <pre>
 * Ejercicio:
 *
 * // Definir una clase Compra
 * // Las compras pueden haber sido entregadas
 * //      en domicilio, por delivery
 * //      en nuestro local, sin delivery
 * // Si es con domicilio,
 * //    agregar un metodo imprimirTotal()
 * //       que agrega un 10% al total de la compra, si es delivery
 * //       que no agrega nada al total, si es en el local
 * </pre>
 */
public class TestCompras {
    public static void main(String[] args) {
        System.out.println("[..] Test Comprando");
        
        // crear clase de Compra
        Compra pizza;
        
        // Instanciar clase de Compra
        pizza = new Compra(); // aqui esta el constructor
        
        // asignar valor total de compra
        pizza.setTotal(200);
        System.out.println("la pizza : " + pizza.getTotal() );
        
        pizza.setDelivery(true);
        
        // imprimirTotal() programar el metodo
        //    que agrega un 10% si es por delivery
        // por lo tanto, 
        //    agregar un atributo delivery true o false
        pizza.imprmirTotal();

        System.out.println("1. termine caso de prueba CON delivery");
        Compra hamburguesa = new Compra();
        hamburguesa.setTotal(230);
        hamburguesa.setDelivery(false);
        System.out.println("la hamburguesa: " +  hamburguesa.getTotal());
        hamburguesa.imprmirTotal();
        System.out.println("2. termine caso de prueba SIN delivery");
        
        System.out.println("[OK] Test Comprando");
    }
}







