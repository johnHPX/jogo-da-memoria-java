import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.lang.System.exit;

public class Main extends JFrame {

    private JPanel contentPane;

    public static JButton btn1;
    public static JButton btn4;
    public static JButton btn2;
    public static JButton btn3;
    public static JButton btnIniciar;
    public static JButton btnReset;
    public static JButton btnPink;
    public static JButton btnBlue;
    public static JButton btnGreen;
    public static JButton btnYellow;

    private int jogadas;
    public static int index, rodadas;
    private JLabel lbCount;

	public static List<Ordem> ordens = new ArrayList<Ordem>();
    public List<Ordem> userChoices = new ArrayList<Ordem>();

    private Color collor;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setVisible(true);
    }

    /**
     * Create the frame.
     */
    public Main() {
        setTitle("Jogo da Memória");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setBounds(100, 100, 357, 354);
        setResizable(false);
        contentPane = new JPanel();

        setContentPane(contentPane);
        contentPane.setLayout(null);

        btn1 = new JButton("");

        btn1.setBackground(Color.WHITE);
        btn1.setBounds(35, 47, 96, 84);
        btn1.setEnabled(false);
        contentPane.add(btn1);

        btn2 = new JButton("");
        btn2.setBackground(Color.WHITE);
        btn2.setBounds(141, 47, 96, 84);
        btn2.setEnabled(false);
        contentPane.add(btn2);

        btn3 = new JButton("");
        btn3.setBackground(Color.WHITE);
        btn3.setBounds(35, 149, 96, 84);
        btn3.setEnabled(false);
        contentPane.add(btn3);

        btn4 = new JButton("");
        btn4.setBackground(Color.WHITE);
        btn4.setBounds(141, 149, 96, 84);
        btn4.setEnabled(false);
        contentPane.add(btn4);

        btnIniciar = new JButton("INICIAR");
        btnIniciar.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
        btnIniciar.setBounds(35, 252, 202, 41);
        contentPane.add(btnIniciar);

        btnPink = new JButton("");

        btnPink.setBackground(Color.PINK);
        btnPink.setBounds(272, 47, 45, 41);
        btnPink.setEnabled(false);
        contentPane.add(btnPink);

        btnBlue = new JButton("");

        btnBlue.setBackground(Color.BLUE);
        btnBlue.setBounds(272, 98, 45, 41);
        btnBlue.setEnabled(false);
        contentPane.add(btnBlue);

        btnGreen = new JButton("");

        btnGreen.setBackground(Color.GREEN);
        btnGreen.setBounds(272, 149, 45, 41);
        btnGreen.setEnabled(false);
        contentPane.add(btnGreen);

        btnYellow = new JButton("");

        btnYellow.setBackground(Color.YELLOW);
        btnYellow.setBounds(272, 200, 45, 41);
        btnYellow.setEnabled(false);
        contentPane.add(btnYellow);

        btnReset = new JButton("RESET");

        btnReset.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
        btnReset.setBounds(249, 252, 80, 41);
        btnReset.setEnabled(false);
        contentPane.add(btnReset);

        lbCount = new JLabel("Rodada: ");
        lbCount.setFont(new Font("SansSerif", Font.BOLD, 16));
        lbCount.setBounds(97, 19, 143, 16);
        contentPane.add(lbCount);

        acoes();
    }

    private void fixBugBackgorundBtn(){
        btn1.setBackground(Color.WHITE);
        btn2.setBackground(Color.WHITE);
        btn3.setBackground(Color.WHITE);
        btn4.setBackground(Color.WHITE);
    }

    public static void enableOrDesenableAllButtons(boolean c){
        btn1.setEnabled(c);
        btn2.setEnabled(c);
        btn3.setEnabled(c);
        btn4.setEnabled(c);

        btnPink.setEnabled(c);
        btnBlue.setEnabled(c);
        btnGreen.setEnabled(c);
        btnYellow.setEnabled(c);
    }

    private void resert(){
        ordens.clear();
        lbCount.setText("Rodadas: 0");
        btnIniciar.setText("Iniciar");

        btn1.setBackground(Color.WHITE);
        btn2.setBackground(Color.WHITE);
        btn3.setBackground(Color.WHITE);
        btn4.setBackground(Color.WHITE);

        enableOrDesenableAllButtons(false);

        btnReset.setEnabled(false);

        jogadas = 0;
        rodadas = 0;
        index = 0;

        btnIniciar.setEnabled(true);
    }

    private boolean verificChoices(){
        boolean ok = true;

        if (userChoices.size() == ordens.size()){
            for (int i = 0; i < ordens.size(); i++){
                if (ordens.get(i).getColor() == userChoices.get(i).getColor() && ordens.get(i).getPosition() ==  userChoices.get(i).getPosition()){
                    ok = true;
                }else{
                    ok = false;
                    break;
                }
            }
        }

        return ok;
    }

    private void acoes() {

        btn1.addActionListener(actionEvent -> {
            fixBugBackgorundBtn();
            btn1.setBackground(collor);
            userChoices.add(new Ordem(collor, 0));
            if (!verificChoices()){
                JOptionPane.showMessageDialog(null, "Errou!!");
                resert();
                return;
            }
            ++jogadas;
            if (jogadas == index){
                btnIniciar.setEnabled(true);
            }
        });

        btn2.addActionListener(actionEvent -> {
            fixBugBackgorundBtn();
            btn2.setBackground(collor);
            userChoices.add(new Ordem(collor, 1));
            if (!verificChoices()){
                JOptionPane.showMessageDialog(null, "Errou!!");
                resert();
                return;
            }
            ++jogadas;
            if (jogadas == index){
                btnIniciar.setEnabled(true);
            }

        });

        btn3.addActionListener(actionEvent -> {
            fixBugBackgorundBtn();
            btn3.setBackground(collor);
            userChoices.add(new Ordem(collor, 2));
            if (!verificChoices()){
                JOptionPane.showMessageDialog(null, "Errou!!");
                resert();
                return;
            }
            ++jogadas;
            if (jogadas == index){
                btnIniciar.setEnabled(true);
            }


        });

        btn4.addActionListener(actionEvent -> {
            fixBugBackgorundBtn();
            btn4.setBackground(collor);
            userChoices.add(new Ordem(collor, 3));
            if (!verificChoices()){
                JOptionPane.showMessageDialog(null, "Errou!!");
                resert();
                return;
            }
            ++jogadas;
            if (jogadas == index){
                btnIniciar.setEnabled(true);
            }

        });

        btnBlue.addActionListener(actionEvent -> {
            collor = Color.BLUE;
        });

        btnYellow.addActionListener(actionEvent -> {
            collor = Color.YELLOW;
        });

        btnGreen.addActionListener(actionEvent -> {
            collor = Color.GREEN;
        });

        btnPink.addActionListener(actionEvent -> {
            collor = Color.PINK;
        });

        btnIniciar.addActionListener(actionEvent -> {
            userChoices.clear();
            jogadas = 0;
            fixBugBackgorundBtn();

            ExecutorService executor = Executors.newCachedThreadPool();

            lbCount.setText("Rodadas: "+ ++rodadas);

            executor.submit(new Task());
            executor.shutdown();

            btnIniciar.setText("Continuar");
        });

        btnReset.addActionListener(actionEvent -> {
            resert();
        });

    }

}
