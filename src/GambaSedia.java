public class GambaSedia extends Thread {
    private int numGamba;

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