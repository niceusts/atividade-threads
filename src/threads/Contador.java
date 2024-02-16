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

    public void inc() {
        contador++;
    }

    public void dec() {
        contador--;
    }

    public int getContador() {
        return contador;
    }
}
