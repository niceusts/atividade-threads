/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;
/**
 *
 * @author Jo�oPaulo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie duas threads. Execute o incremento cinco vezes no contador usando a thread 1. Em seguida fa�a o mesmo com o decremento usando a thread 2.
         Execute as duas threads sem que uma interfira no processo da outra.*/
        
        Contador contador = new Contador();

        Incremento tgt1 = new Incremento(contador);
        Decremento tgt2 = new Decremento(contador);

        Thread thread1 = new Thread(tgt1);
        Thread thread2 = new Thread(tgt2);

        thread1.start();
        try {
            thread1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

    }
}
