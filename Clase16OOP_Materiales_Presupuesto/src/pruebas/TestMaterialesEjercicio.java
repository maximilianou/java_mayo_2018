package pruebas;

import entidades.MaterialPorKilo;
import entidades.MaterialPorLitro;
import entidades.MaterialPorMetroCuadrado;
import entidades.MaterialPorUnidad;

/**
 * Ejercicio:
 *   Crear una instancia de cada Tipo de Material
 *   Luego necesit que se calcule la
 *   Suma del presupuesto de los materiales
 * Para esto necesito 
 *  1. que todos los materiales tengan el toString()
 *     asi puedo ir verificando o testeando lo que hago
 *  2. que la clase Material tenga el precio
 *     encapsulado
 *  3. que se logre la suma total de los materiales
 *     en una variable sumaTotalPresupuestada
 * 
 */
public class TestMaterialesEjercicio {
    public static void main(String[] args) {
        System.out.println("[..] Materiales Ejercicio");
        
        MaterialPorKilo comidaPerro = new MaterialPorKilo();
        comidaPerro.setNombre("Dog Chau");
        comidaPerro.setPrecio(1000);
//        comidaPerro.precio = 3000;
        System.out.println("" + comidaPerro);
        System.out.println("" + comidaPerro.getPrecio());
        System.out.println("1. ---------- ");        
        
        MaterialPorLitro agua = new MaterialPorLitro();
        agua.setNombre("Ives");
        agua.setPrecio(200);
        System.out.println("" + agua);
                
        System.out.println("2. ---------- ");    
        
        MaterialPorMetroCuadrado arena = new MaterialPorMetroCuadrado();
        arena.setNombre("Arena Les");
        arena.setPrecio(500);
        System.out.println("" + arena);
        
        System.out.println("3. ---------- "); 
        
        MaterialPorUnidad ladrillo = new MaterialPorUnidad();
        ladrillo.setNombre("Huecos");
        ladrillo.setPrecio(800);
        System.out.println("" + ladrillo);
                
        System.out.println("4. ---------- ");        
        
        double totalPresupuestado = 0;
//        totalPresupuestado += comidaPerro.getPrecio();
        totalPresupuestado = totalPresupuestado + comidaPerro.getPrecio();
        totalPresupuestado += agua.getPrecio();
        totalPresupuestado += arena.getPrecio();
        totalPresupuestado += ladrillo.getPrecio();
        System.out.println("Total Presupuesto: " + totalPresupuestado);
        
        System.out.println("5. ---------- ");        
        
        System.out.println("[OK] Materiales Ejercicio");
    }
    
}
