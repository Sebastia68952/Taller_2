package Taller_2;

import java.time.LocalDate;

// Clase hija para mostrar "decir que dia es hoy"
public class Dia extends Thread {
        public void run() {
            LocalDate date = LocalDate.now();
            System.out.println("Hoy es " + date);
        }  
}
