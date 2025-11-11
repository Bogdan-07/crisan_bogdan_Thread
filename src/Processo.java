
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Crisan Bogdan 5DINF
 * @version 1.0
 *
 * <p>
 *     Questa classe gestisce la creazione di una o più sedie, composte da schienale e gambe,
 *     mostrando a schermo la percentuale di completamento di ciascuna componente della sedia e in fine,
 *     la percentuale di completamento dell'assemblaggio della sedia stessa
 */
public class Processo {
    public static void main(String[] args) {
        Scanner inputUtente = new Scanner(System.in);

        System.out.print("Inserire il numero di sedie da produrre: ");
        int numSedie = inputUtente.nextInt();

        for (int i = 1; i <= numSedie; i++){
            ArrayList<Thread> processiInEsec = new ArrayList<>();

            GambaSedia gamba1 = new GambaSedia(1);
            GambaSedia gamba2 = new GambaSedia(2);
            GambaSedia gamba3 = new GambaSedia(3);
            GambaSedia gamba4 = new GambaSedia(4);
            SchienaleSedia schienaleSedia = new SchienaleSedia();

            processiInEsec.add(gamba1);
            processiInEsec.add(gamba2);
            processiInEsec.add(gamba3);
            processiInEsec.add(gamba4);
            processiInEsec.add(schienaleSedia);

            for (int j = 0; j < processiInEsec.size(); j++ )
                processiInEsec.get(j).start();

            for (int k = 0; k < processiInEsec.size(); k++){
                try{
                    processiInEsec.get(k).join();
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Assemblo le varie parti della sedia");
            for (int l = 1; l <= 10; l++){
                System.out.println("Sedia numero " + i + " assemblata al " + (l*10) + "%");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}