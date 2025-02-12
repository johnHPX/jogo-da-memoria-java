import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Main extends JFrame {

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn4;
	private JButton btn2;
	private JButton btn3;
	private JButton btnIniciar;
	private JButton btnReset;
	private JButton btns[];
//	private TrocaCor tarefa;
//	private List<Ordem> ordens = new ArrayList<Ordem>();
	private JButton btnRosa;
	private JButton btnAzul;
	private JButton btnVerde;
	private JButton btnAmarelo;
	private int p;
	private int index, rodadas;
	private JLabel lbCount;
	// cores
	private final Color ROSA = new Color(255, 102, 255);
	private final Color AZUL = new Color(0, 153, 204);
	private final Color VERDE = new Color(102, 255, 10);
	private final Color AMARELO = new Color(255, 255, 51);
	private Color cor;

	private ExecutorService executor;

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
		contentPane.add(btn1);

		btn2 = new JButton("");
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(141, 47, 96, 84);
		contentPane.add(btn2);

		btn3 = new JButton("");
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(35, 149, 96, 84);
		contentPane.add(btn3);

		btn4 = new JButton("");
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(141, 149, 96, 84);
		contentPane.add(btn4);

		btnIniciar = new JButton("INICIAR");
		btnIniciar.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnIniciar.setBounds(35, 252, 202, 41);
		contentPane.add(btnIniciar);

		btnRosa = new JButton("");

		btnRosa.setBackground(new Color(255, 102, 255));
		btnRosa.setBounds(272, 47, 45, 41);
		contentPane.add(btnRosa);

		btnAzul = new JButton("");

		btnAzul.setBackground(new Color(0, 153, 204));
		btnAzul.setBounds(272, 98, 45, 41);
		contentPane.add(btnAzul);

		btnVerde = new JButton("");

		btnVerde.setBackground(new Color(102, 255, 10));
		btnVerde.setBounds(272, 149, 45, 41);
		contentPane.add(btnVerde);

		btnAmarelo = new JButton("");

		btnAmarelo.setBackground(new Color(255, 255, 51));
		btnAmarelo.setBounds(272, 200, 45, 41);
		contentPane.add(btnAmarelo);

		btnReset = new JButton("RESET");

		btnReset.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		btnReset.setBounds(249, 252, 80, 41);
		contentPane.add(btnReset);

		btns = new JButton[9];

		btns[0] = btn1;
		btns[1] = btn2;
		btns[2] = btn3;
		btns[3] = btn4;
		btns[4] = btnIniciar;
		btns[5] = btnRosa;
		btns[6] = btnAzul;
		btns[7] = btnVerde;
		btns[8] = btnAmarelo;


		lbCount = new JLabel("Rodada: ");
		lbCount.setFont(new Font("SansSerif", Font.BOLD, 16));
		lbCount.setBounds(97, 19, 143, 16);
		contentPane.add(lbCount);

		

		

	}

	

}
