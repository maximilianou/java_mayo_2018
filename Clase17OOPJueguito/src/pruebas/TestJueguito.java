package pruebas;

public class TestJueguito {

    public static void main(String[] args) {
        System.out.println("[..]  Jugando Test");
        Juego tateti = new JuegoMultiJugadorTurno();
        tateti.setNombre("Ta Te Ti");
        //tateti.jugadores = 2;
        tateti.setTiempo(false);
        //tateti.limiteJugadas = 9;
        System.out.println("" + tateti);

        System.out.println("1. -----------------");
        Juego solitario = new JuegoIndividual();
        solitario.setNombre("Aracnido");
        //solitario.jugadores = 1;
        solitario.setTiempo(false);
        // por cuestiones de simplicidad
        // no todos los juegos tienen limite de jugadas
//        solitario.limiteJugadas = 0;
        System.out.println("" + solitario);

        Juego firstpersonshooter = new JuegoMutliJugadorTiempoReal();
        firstpersonshooter.setNombre("Medalla de Honor");
        // catidad de jugadores varia segun el juego
        //firstpersonshooter.jugadores = 10;
        firstpersonshooter.setTiempo(true);
        System.out.println("" + firstpersonshooter);
        System.out.println("2. -----------------");

        // No puedo instanciar un Juego si no digo
        // especificametne que juego es y que regals tiene
//        Juego unJuego = new Juego();
//        unJuego.setNombre("Acertijo?");
//        System.out.println("" +  unJuego);
        
        System.out.println("3. -----------------");

        Juego sudoku = new Sudoku();
        sudoku.setNombre("Sudoku que esta jugando Guille");
        Juego sudoku2 = new Sudoku();
        sudoku2.setNombre("Sudoku que esta jugando Mara");
        Juego buscaMinas = new BuscaMinas();
        buscaMinas.setNombre("BuscaMinas que juega Santi");
        Juego buscaMinas2 = new BuscaMinas();
        buscaMinas2.setNombre("BuscaMinas que juega SantiH");
        Juego solitarioCartas = new SolitarioAracnido();
                
        System.out.println("4. -----------------");

        System.out.println("[OK]  Jugando Test");
    }

}
