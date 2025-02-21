import java.awt.*;
import java.util.Random;


public class Task implements Runnable{

    @Override
    public synchronized void run() {
        Main.enableOrDesenableAllButtons(false);
        Main.btnIniciar.setEnabled(false);
        Random rand = new Random();

        int colorRandom = rand.nextInt(4);
        int colorPosition = rand.nextInt(4);
        switch (colorRandom){
            case 0:
                Main.ordens.add(new Ordem(Color.BLUE, colorPosition));
                break;
            case 1:
                Main.ordens.add(new Ordem(Color.GREEN, colorPosition));
                break;
            case 2:
                Main.ordens.add(new Ordem(Color.PINK, colorPosition));
                break;
            default:
                Main.ordens.add(new Ordem(Color.YELLOW, colorPosition));
        }

        switch (colorPosition){
            case 0:
                try {
                    Main.btn1.setBackground(Main.ordens.get(Main.index).getColor());
                    Thread.sleep(2000);
                    Main.btn1.setBackground(Color.WHITE);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 1:
                try {
                    Main.btn2.setBackground(Main.ordens.get(Main.index).getColor());
                    Thread.sleep(2000);
                    Main.btn2.setBackground(Color.WHITE);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                break;
            case 2:
                try {
                    Main.btn3.setBackground(Main.ordens.get(Main.index).getColor());
                    Thread.sleep(2000);
                    Main.btn3.setBackground(Color.WHITE);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                break;
            default:

                try {
                    Main.btn4.setBackground(Main.ordens.get(Main.index).getColor());
                    Thread.sleep(2000);
                    Main.btn4.setBackground(Color.WHITE);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        }
        ++Main.index;
        Main.enableOrDesenableAllButtons(true);
        Main.btnReset.setEnabled(true);
    }
}
