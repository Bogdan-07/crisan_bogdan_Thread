/**
 * @author Crisan Bogdan 5DINF
 * @version 1.0
 *
 * <p>
 *     Questa Classe estende Thread e simula la creazione di una gamba di una sedia
 *     mostrando a schermo la percentuale di completamento
 */
public class GambaSedia extends Thread {
    private final int numGamba;

    public GambaSedia(int numGamba){
        this.numGamba = numGamba;
    }

    public void run(){
            System.out.println("Creo la Gamba della sedia");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 1; i <= 10; i++){
                System.out.println("Gamba della " + numGamba + "° sedia pronta al " + (i*10) + "%");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}