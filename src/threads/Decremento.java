/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;


/**
 *
 * @author Jo�oPaulo
 */
public class Decremento implements Runnable {

    private final Contador contador;

    public Decremento(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 4; i >= 0; i--) {
            synchronized (contador) {
                contador.dec();
                System.out.println("Thread Decremento: " + contador.getContador());
           
            }
        }
    }

    public void start() {   

    }   
}