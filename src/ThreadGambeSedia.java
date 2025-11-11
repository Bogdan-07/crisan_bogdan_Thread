public class ThreadGambeSedia extends Thread {
    public void run(){
        for (int i = 1; i <= 4; i++) {
            System.out.println("Creo la " + i + "° Gamba della sedia");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int j = 1; j <= 10; j++){
                System.out.println(i + "° Gamba della sedia pronta al " + (j*10) + "%");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
