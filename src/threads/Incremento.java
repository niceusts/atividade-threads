/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;
/**
 *
 * @author Jo�oPaulo
 */
public class Incremento implements Runnable{  
    
     private Contador contador;

    public Incremento(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (contador) {
                contador.inc();
                System.out.println("Thread Incremento: " + contador.getContador());
            }
        }
    }
    public void start() {   

    }   
}
