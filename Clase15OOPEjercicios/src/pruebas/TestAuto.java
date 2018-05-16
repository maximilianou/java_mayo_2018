package pruebas;

public class TestAuto {

    public static void main(String[] args) {
        System.out.println("[..] Test Auto");
        // 1. Crear la clase Auto
        // El auto tiene patente
        // El auto tiene velocidad
        // El auto puede acelerar
        // El auto puede frenar
        Auto audi = new Auto();

        Auto peugeot = new Auto();

        Auto mercedes = new Auto();

        System.out.println("" + mercedes);
        System.out.println("" + audi);
        System.out.println("" + peugeot);

        audi.setPatente("ab 123 cd");
        peugeot.setPatente("rr 333 nn");
        mercedes.setPatente("qq 777 tt");
//        mercedes.patente = "ppp 222 uuuu";

        System.out.println("el Mercedes: " + mercedes.getPatente());
        System.out.println("el Audi    : " + audi.getPatente());
        System.out.println("el Peugeot : " + peugeot.getPatente());
        System.out.println("1. Caso de exito co la patenete --------- ");
        System.out.println("2. Caso de exito 3 auotss --------- ");
        // 2. casos de test
        //   si tiene patente, 
        //   quiero tener 3 autos con patentes distintas
        //   quiero ver que se imprima las tras patentes

        // 3. caso de velocidad
        //   quiero verificar que se construye con velocidad 0
        //   imprimiedo la velocidad en 0
        //   de los 3 autos
        System.out.println("3. Caso de exito velocidad --------- ");
//Auto.velocidad = 0;
//audi.velocidad = 0;
//auti.setVelocidad(250);
        System.out.println("" + audi);
        System.out.println("" + mercedes);
        System.out.println("" + peugeot);
        // 4. caso de acelerar
        //    luego de acelerar una vez, 
        //     el auto incrementa 10 su velocidad
        //    imprimir las velocidades de cada auto, 
        System.out.println("4. -------- acelerar() ------------");

        System.out.println("el audi: " + audi);
        audi.acelerar();
        System.out.println("el audi: " + audi);
        audi.acelerar();
        System.out.println("el audi: " + audi);
        audi.acelerar();
        System.out.println("el audi: " + audi);

        System.out.println("el mercedes : " + mercedes);
        mercedes.acelerar();
        System.out.println("el mercedes : " + mercedes);

        System.out.println("el peugeto : " + peugeot);
        peugeot.acelerar();
        peugeot.acelerar();
        peugeot.acelerar();
        System.out.println("el peugeto : " + peugeot);
        System.out.println("el mercedes : " + mercedes);

//        for (int i = 0; i < 500; i++) {
//            audi.acelerar();
//        }
//        System.out.println("el audi: " + audi);
        // 5. caso frenar
        //    cuando frena el auto, 
        //      opciones: ( Asumir )
        //         - se detiene
        //         queda en marcha, en punto muerto
        //         - disminuye la velocidad
        //         - falla los freno, fijate como programas esto.
        System.out.println("5. -------- frenar() ------------");

        peugeot.acelerar();
        peugeot.acelerar();
        peugeot.acelerar();
        peugeot.acelerar();
        peugeot.acelerar();
        peugeot.acelerar();
        peugeot.acelerar();
        peugeot.acelerar();

        System.out.println("el peugeto : " + peugeot);
        peugeot.frenar();
        System.out.println("el peugeto : " + peugeot);
        for (int roberto = 0; roberto < 1000; roberto++) {
            //System.out.println("roberto: " + roberto);
            peugeot.frenar();
        }
        System.out.println("el peugeto : " + peugeot);
        // patente vacia
        System.out.println("6. caso patente vacia ------------ ");

        System.out.println("el audi : " + audi);
        audi.setPatente("99 PPP 99"); // puedo modificar la patente
        System.out.println("el audi : " + audi);
        try {
            audi.setPatente(""); // no puedo poner vacio
            System.out.println("[ERROR] patente asignada vacia ");
        } catch (Exception ex) {
            System.out.println("[OK] patente asignada vacia ");
        }
        System.out.println("el audi : " + audi);

        // patente formato otro caso
        System.out.println("7. caso patente cualquiwerocoas ------------ ");

        System.out.println("[OK] Test Auto");
    }

}
