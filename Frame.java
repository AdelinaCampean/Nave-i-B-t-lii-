import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import java.awt.Choice;
import javax.swing.UIManager;
import javax.swing.JLayeredPane;

public class Frame {

	private JFrame frame;
	private JTextField txtVl;
	private JTextField txtBattleOf;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
	initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//frame procedura 
		/*frame23 = new JFrame();
		frame23.setResizable(false);
		frame23.setBounds(100, 100, 599, 349);
		frame23.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(139, 0, 139));
		panel.setBackground(new Color(250, 128, 114));
		frame23.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtVl = new JTextField();
		txtVl.setBackground(new Color(32, 178, 170));
		txtVl.setHorizontalAlignment(SwingConstants.CENTER);
		txtVl.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtVl.setBounds(238, 105, 86, 37);
		panel.add(txtVl);
		txtVl.setText("vl");
		txtVl.setColumns(10);
		
		JButton btnRealizaiInterogarea = new JButton("Efectua\u021Bi interogarea");
		btnRealizaiInterogarea.setBackground(new Color(32, 178, 170));
		btnRealizaiInterogarea.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRealizaiInterogarea.setBounds(37, 198, 213, 46);
		panel.add(btnRealizaiInterogarea);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce\u021Bi tipul vasului: \r\n( vl - vas de linie,  cr - vas cruci\u0219\u0103tor)");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(28, 23, 525, 46);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\proced.jpg"));
		lblNewLabel.setBounds(0, 0, 593, 315);
		panel.add(lblNewLabel);
		frame23.setVisible(true);
		*/
		
		///frame rezultat
		/*frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 901, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(139, 0, 139));
		panel.setBackground(new Color(250, 128, 114));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setForeground(new Color(153, 204, 204));
		comboBox.setBackground(new Color(153, 0, 0));
		comboBox.setBounds(463, 289, 272, 34);
		panel.add(comboBox);
		
		JButton btnRealizatiInterogarea = new JButton("Realiza\u021Bi interogarea");
		btnRealizatiInterogarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRealizatiInterogarea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnRealizatiInterogarea.setForeground(new Color(255, 255, 255));
		btnRealizatiInterogarea.setBackground(new Color(102, 0, 0));
		btnRealizatiInterogarea.setBounds(548, 353, 187, 40);
		panel.add(btnRealizatiInterogarea);
		
		
		JLabel lblMeniul = new JLabel("MENIUL APLICA\u021AIEI\r\n");
		lblMeniul.setForeground(new Color(102, 0, 0));
		lblMeniul.setBounds(499, 63, 295, 73);
		lblMeniul.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 34));
		panel.add(lblMeniul);
		
		JLabel lblAlegeiInterogareaPe = new JLabel("Alege\u021Bi interogarea pe care dori\u021Bi s\u0103 o executa\u021Bi: ");
		lblAlegeiInterogareaPe.setForeground(new Color(102, 0, 0));
		lblAlegeiInterogareaPe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAlegeiInterogareaPe.setBounds(360, 239, 383, 28);
		panel.add(lblAlegeiInterogareaPe);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(153, 102, 0));
		lblNewLabel.setForeground(new Color(204, 204, 102));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\jaava2.jpg"));
		lblNewLabel.setBounds(0, 0, 895, 565);
		panel.add(lblNewLabel);

		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblMeniul, btnRealizatiInterogarea}));
*/

		//PRIMUL FRAME
/*
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 901, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(139, 0, 139));
		panel.setBackground(new Color(250, 128, 114));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblAdelina = new JLabel("B\u0103t\u0103lii cu Nave \u0219i Consecin\u021Be ");
		lblAdelina.setForeground(new Color(0, 204, 204));
		lblAdelina.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 59));
		lblAdelina.setBounds(97, 13, 621, 59);
		panel.add(lblAdelina);
		
		JButton btnButon = new JButton("Meniul Aplica\u021Biei");
		btnButon.setForeground(new Color(255, 255, 255));
		btnButon.setBackground(new Color(25, 25, 112));
		btnButon.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		
		btnButon.setBounds(598, 334, 213, 45);
		panel.add(btnButon);
		
		JButton btnNewButton = new JButton("Informa\u021Bii Student");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBackground(new Color(25, 25, 112));
		btnNewButton.setBounds(46, 497, 197, 33);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\javaaaaaaaaa.jpg"));
		lblNewLabel.setBounds(0, 0, 895, 565);
		panel.add(lblNewLabel);
	
		*/
		//result frame
		
		/*JFrame resultFrame;

		resultFrame=new JFrame();
		resultFrame.setResizable(false);
		resultFrame.setBounds(100, 100, 606, 509);
		resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		resultFrame.getContentPane().setLayout(null);
		//JButton inapoi = new JButton("\u00CEnapoi");
		inapoi.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		inapoi.setBounds(451, 439, 91, 32);
		resultFrame.getContentPane().add(inapoi);
		JTable table = new JTable();
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 222, 500, 125);
		resultFrame.getContentPane().add(scrollPane);		
		
		scrollPane.setViewportView(table);		
		resultFrame.getContentPane().add(scrollPane);
		
		JTextArea txtrJ = new JTextArea();
		txtrJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtrJ.setForeground(new Color(204, 204, 204));
		txtrJ.setBackground(new Color(0, 51, 102));
		txtrJ.setWrapStyleWord(true);
		txtrJ.setLineWrap(true);
		txtrJ.setBounds(12, 84, 480, 38);
		resultFrame.getContentPane().add(txtrJ);
		
		JLabel lblNewLabel_2 = new JLabel("Cerin\u021Ba interog\u0103rii alese este:");
		lblNewLabel_2.setBackground(new Color(119, 136, 153));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(12, 39, 301, 32);
		resultFrame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Rezultatul interog\u0103rii alese este: ");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 171, 283, 38);
		resultFrame.getContentPane().add(lblNewLabel_1);
		
		inapoi.setBounds(451, 450, 85, 21);
		
		resultFrame.getContentPane().add(inapoi);
		
			JLabel lblNewLabel = new JLabel();
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\result.jpg"));
			lblNewLabel.setBounds(0, 0, 600, 437);
			resultFrame.getContentPane().add(lblNewLabel);
			resultFrame.setVisible(true);
	*/
	
	
	//frame info stud

/*	frame = new JFrame();
	frame.setResizable(false);
	frame.setBounds(100, 100, 556, 474);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	panel.setForeground(new Color(139, 0, 139));
	panel.setBackground(new Color(250, 128, 114));
	frame.getContentPane().add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblProfesorndrumtorDragomir = new JLabel("Profesor \u00EEndrum\u0103tor: Dragomir Gabriel ");
	lblProfesorndrumtorDragomir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
	lblProfesorndrumtorDragomir.setBounds(0, 24, 379, 41);
	panel.add(lblProfesorndrumtorDragomir);
	
	JTextArea txtrFacultateaDeAutomatic = new JTextArea();
	txtrFacultateaDeAutomatic.setEditable(false);
	txtrFacultateaDeAutomatic.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
	txtrFacultateaDeAutomatic.setBackground(new Color(176, 196, 222));
	txtrFacultateaDeAutomatic.setText("Student\u0103:  C\u00E2mpean Adelina Ioana \r\nGrupa:   30227 \r\nFacultatea de Automatic\u0103 \u0219i Calculatoare \r\n               Sec\u021Bia Calculatoare  ");
	txtrFacultateaDeAutomatic.setBounds(12, 263, 345, 84);
	panel.add(txtrFacultateaDeAutomatic);
	
	JButton btnNewButton = new JButton("\u00CEnapoi la pagina principal\u0103");
	btnNewButton.setBackground(new Color(176, 196, 222));
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	btnNewButton.setBounds(315, 370, 223, 41);
	panel.add(btnNewButton);
	
	
	
	JLabel lblNewLabel = new JLabel("\r\n");
	lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\utcnn.jpg"));
	lblNewLabel.setBounds(-26, -79, 747, 648);
	panel.add(lblNewLabel);*/
		
		//frame proc2
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 570, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(139, 0, 139));
		panel.setBackground(new Color(250, 128, 114));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblIntroduceiOBtlie = new JLabel("Introduce\u021Bi numele unei b\u0103t\u0103lii:");
		lblIntroduceiOBtlie.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIntroduceiOBtlie.setBounds(12, 13, 432, 53);
		panel.add(lblIntroduceiOBtlie);
		
		txtBattleOf = new JTextField();
		txtBattleOf.setBackground(new Color(100, 149, 237));
		txtBattleOf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		txtBattleOf.setText("Battle of ");
		txtBattleOf.setBounds(93, 134, 183, 45);
		panel.add(txtBattleOf);
		txtBattleOf.setColumns(10);
		
		JButton btnNewButton = new JButton("Efectua\u021Bi interogarea\r\n");
		btnNewButton.setBackground(new Color(95, 158, 160));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(309, 266, 218, 38);
		panel.add(btnNewButton);
		
		JLabel lblNarvikWaterlooGettysburg = new JLabel("Narvik, Waterloo, Gettysburg, Leipzig, Deutschland, Madrid, Unmortals, Rivals ");
		lblNarvikWaterlooGettysburg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNarvikWaterlooGettysburg.setBounds(12, 57, 548, 33);
		panel.add(lblNarvikWaterlooGettysburg);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\JVAAAAAAAAA.jpg"));
		lblNewLabel.setBounds(-152, -309, 964, 748);
		panel.add(lblNewLabel);

}
	public void actionPerformed(ActionEvent e) {
		}
}

