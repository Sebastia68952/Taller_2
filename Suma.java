package Taller_2;

// Clase hija para mostrar "Sumar"
public class Suma extends Thread{
    public void run() {
        int a = 5;
        int b = 7;
        int sum = a + b;
        System.out.println("La suma de " + a + " y " + b + " es " + sum);
    }
}
