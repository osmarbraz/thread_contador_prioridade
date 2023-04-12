
/**
 * Programa principal.
 *
 * @author osmar
 */
public class Principal {

    public static void main(String args[]) {
        
        Runnable r1 = new Contador("t1");
        Runnable r2 = new Contador("t2");
        
        Thread t1 = new Thread(r1);
        t1.setPriority(10);
        
        Thread t2 = new Thread(r2);
        t2.setPriority(1);
        
        t1.start();
        t2.start();

    }
}
