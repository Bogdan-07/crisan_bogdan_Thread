/**
 * @author Crisan Bogdan 5DINF
 * @version 1.0
 *
 * <p>
 *     Questa Classe estende Thread e simula la creazione dello schienale di una sedia
 *     mostrando a schermo la percentuale di completamento
 */
public class SchienaleSedia extends Thread{
    public void run(){
            System.out.println("Creo lo schienale della sedia");
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int j = 1; j <= 10; j++){
                System.out.println("Schienale della sedia pronto al " + (j*10) + "%");
                try {
                    Thread.sleep(750);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
