package pruebas;

import entidades.Material;
import entidades.MaterialPorKilo;
import entidades.MaterialPorLitro;

public class TestMateriales {

    public static void main(String[] args) {
        System.out.println("[..] Materiales Test");

        // Quiero ver el tema de la herencia
        // la jerarquia de clases
        // la reutilizacion de codigo
        // la redefinicion del metodo tu estring
        MaterialPorLitro pintura = new MaterialPorLitro();
        pintura.setNombre("Pintura");
        MaterialPorLitro silicona = new MaterialPorLitro();
        silicona.setNombre("Silicona");

        MaterialPorKilo clavo = new MaterialPorKilo();
        clavo.setNombre("Clavo");
        MaterialPorKilo tornillo = new MaterialPorKilo();
        tornillo.setNombre("Tornillo");

        System.out.println("1. --------------");

        System.out.println("" + pintura);
        System.out.println("" + silicona);
        System.out.println("" + clavo);
        System.out.println("" + tornillo);

        System.out.println("2. --------------");
        Material cola = new MaterialPorLitro();
//        Material cola2 = new Material();
        
        cola.setNombre("Cola");
        Material cemento = new MaterialPorKilo();
        cemento.setNombre("Cemento");

        System.out.println("" + cola    );
        System.out.println("" + cemento );
        
        System.out.println("3. --------------");

        System.out.println("[OK] Materiales Test");
    }

    //    class Interna{ // no quiero cosas oculata o confusas
    //    }
}

//class OtraQueNoQuiero{
//}
//class OtraQueNoQuieroDOS{
//}

