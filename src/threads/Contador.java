/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Jo�oPaulo
 */
class Contador {
    private int contador = 0;

    public synchronized void inc() {
        contador++;
    }

    public synchronized void dec() {
        contador--;
    }

    public synchronized int getContador() {
        return contador;
    }
}