public class ThreadSchienaleSedia extends Thread{
    public void run(){
            System.out.println("Creo lo schienale della sedia");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int j = 1; j <= 10; j++){
                System.out.println("Schienale della sedia pronto al " + (j*10) + "%");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
