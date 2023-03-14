package Taller_2;

public class Principal {
    public static void main(String[] args) {
        // Crea los hilos
        Musica hiloMusica = new Musica("musica.mp3");
        Mundo hiloMundo = new Mundo();
        Suma hiloSuma = new Suma();
        Dia hiloDia = new Dia();
        
        // Inicia los hilos
        hiloMusica.start();
        hiloMundo.start();
        hiloSuma.start();
        hiloDia.start();
    }
}