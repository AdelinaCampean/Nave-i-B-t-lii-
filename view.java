import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class view extends JFrame {
	
	private JFrame frame;
	private JFrame frame2;
	private JFrame frame3;
	private JFrame frameinfo;
	private JFrame frameproc2;
	private JButton btnButon = new JButton("Meniul Aplica\u021Biei");
	private JButton btnInformatiiStudent = new JButton("Informa\u021Bii Student");
	private JButton btnRealizatiInterogarea = new JButton("Realiza\u021Bi interogarea");
	private JButton btnNewButton = new JButton("\u00CEnapoi la pagina principal\u0103");
	private JTextArea txtrFacultateaDeAutomatic = new JTextArea();
	private JFrame resultFrame;
	private JScrollPane scrollPane;
	private JTable table = new JTable();
	private JButton inapoi = new JButton("\u00CEnapoi");
	private JTextField txtCerinta = new JTextField();
	private JTextArea txtrJ = new JTextArea();
	private JTextField txtVl = new JTextField();
	private JButton btnRealizaiInterogarea2 = new JButton("Efectua\u021Bi interogarea");
	private JTextField	txtBattleOf = new JTextField();
	private JButton btnefect = new JButton("Efectua\u021Bi interogarea\r\n");

	
	private JComboBox comboBox = new JComboBox(new String[]
			{
				"Interogarea3a", "Interogarea3b", "Interogarea4a", "Interogarea4b", "Interogarea5a", "Interogarea5b", "Interogarea6a", "Interogarea6b"
			});
	
	public JFrame getFrameproc2() {
		return frameproc2;
	}
	
	public JButton getBtnefect() {
		return btnefect;
	}
	
	public String getTxtBattleOf() {
		return txtBattleOf.getText();
	}
	
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	
	public JFrame getFrameinfo() {
		return frameinfo;
	}
	
	public JTextArea getTxtrFacultateaDeAutomatic() {
		return txtrFacultateaDeAutomatic;
	}
	
	public JFrame getFrame3() {
		return frame3;
	} 
	
	public String getTxtVl() {
		return txtVl.getText();
	}

	public JButton getBtnRealizaiInterogarea2() {
		return btnRealizaiInterogarea2;
	}
	
	
	public JButton getBtnInformatiiStudent() {
		return btnInformatiiStudent;
	}
	public JTextField getCerinta() {
		return txtCerinta;
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public JFrame getFrame2() {
		return frame2;
	}

	public JTextArea getTxtrJ() {
		return txtrJ;
	}

	public void setTxtrJ(JTextArea txtrJ) {
		this.txtrJ = txtrJ;
	}
	
	public JButton getBtnButon() {
		return btnButon;
	}

	public JButton getBtnRealizatiInterogarea() {
		return btnRealizatiInterogarea;
	}

	public JFrame getResultFrame() {
		return resultFrame;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public JTable getTable() {
		return table;
	}

	public JButton getInapoi() {
		return inapoi;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void addListenerButon1(ActionListener btn) {
		btnButon.addActionListener(btn);
	}

	public void addListenerButon2(ActionListener btn) {
		btnRealizatiInterogarea.addActionListener(btn);
	}
	
	public void addListenerButon3(ActionListener btn) {
		inapoi.addActionListener(btn);
	}
	
	public void addListenerButon4(ActionListener btn) {
		btnRealizaiInterogarea2.addActionListener(btn);
	}
	
	public void addListenerButon5(ActionListener btn) {
		btnInformatiiStudent.addActionListener(btn);
	}
	public void addListenerButon6(ActionListener btn) {
		btnNewButton.addActionListener(btn);
	}
	
	public void addListenerButon7(ActionListener btn) {
		btnefect.addActionListener(btn);
	}
		
	public view() 
	{
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
		
		btnButon.setForeground(new Color(255, 255, 255));
		btnButon.setBackground(new Color(25, 25, 112));
		btnButon.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		btnButon.setBounds(598, 334, 213, 45);
		
		panel.add(btnButon);
		
		btnButon.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			}
		});
			
		btnInformatiiStudent.setForeground(new Color(255, 255, 255));
		btnInformatiiStudent.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnInformatiiStudent.setBackground(new Color(25, 25, 112));
		btnInformatiiStudent.setBounds(46, 497, 197, 33);
		panel.add(btnInformatiiStudent);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\javaaaaaaaaa.jpg"));
		lblNewLabel.setBounds(0, 0, 895, 565);
		panel.add(lblNewLabel);
	
	frame.add(panel);
	frame.setVisible(true);
	}
	
	public void view2 ()
	{
		frame2 = new JFrame();
		frame2.setResizable(false);
		frame2.setBounds(100, 100, 901, 600);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(139, 0, 139));
		panel.setBackground(new Color(250, 128, 114));
		frame2.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
				
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
		
		
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBox.setForeground(new Color(153, 204, 204));
		comboBox.setBackground(new Color(153, 0, 0));
		comboBox.setBounds(463, 289, 272, 34);
		panel.add(comboBox);
		
		//panel.setFocusTraversalPolicy((new Component[]{lblMeniul, btnRealizatiInterogarea}));
		btnRealizatiInterogarea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnRealizatiInterogarea.setForeground(new Color(255, 255, 255));
		btnRealizatiInterogarea.setBackground(new Color(102, 0, 0));
		btnRealizatiInterogarea.setBounds(548, 353, 188, 40);
		panel.add(btnRealizatiInterogarea);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\jaava2.jpg"));
		lblNewLabel.setBounds(0, 0, 895, 565);
		panel.add(lblNewLabel);

		
		frame2.add(panel);
		frame2.setVisible(true);
	}
	
public void createResultFrame() {

	resultFrame=new JFrame();
	resultFrame.setResizable(false);
	resultFrame.setBounds(100, 100, 606, 509);
	resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	resultFrame.getContentPane().setLayout(null);

	inapoi.setFont(new Font("Tahoma", Font.BOLD, 14));
	inapoi.setBounds(451, 439, 91, 32);
	
	
	JScrollPane scrollPane = new JScrollPane();

	scrollPane.setBounds(12, 228, 500, 125);

	scrollPane.setViewportView(table);
	getTxtrJ().setFont(new Font("Tahoma", Font.PLAIN, 14));
	getTxtrJ().setForeground(new Color(204, 204, 204));
	getTxtrJ().setBackground(new Color(0, 51, 102));
	getTxtrJ().setWrapStyleWord(true);
	getTxtrJ().setLineWrap(true);
	getTxtrJ().setBounds(12, 84, 480, 38);
	resultFrame.getContentPane().add(getTxtrJ());
	
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
	
	inapoi.setBounds(451, 450, 85, 21);
		
	JLabel lblNewLabel = new JLabel();
	lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\result.jpg"));
	lblNewLabel.setBounds(0, 0, 600, 437);
		
	resultFrame.getContentPane().add(inapoi);
	resultFrame.getContentPane().add(scrollPane);
	resultFrame.getContentPane().add(lblNewLabel_1);
	resultFrame.getContentPane().add(lblNewLabel);
		
	resultFrame.setVisible(true);
	
	}

public void view_proc() {
    frame3 = new JFrame();
	frame3.setResizable(false);
	frame3.setBounds(100, 100, 599, 349);
	frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	panel.setForeground(new Color(139, 0, 139));
	panel.setBackground(new Color(250, 128, 114));
	frame3.getContentPane().add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	txtVl.setBackground(new Color(32, 178, 170));
	txtVl.setHorizontalAlignment(SwingConstants.CENTER);
	txtVl.setFont(new Font("Tahoma", Font.BOLD, 16));
	txtVl.setBounds(226, 119, 86, 37);
	panel.add(txtVl);
	txtVl.setText("vl");
	txtVl.setColumns(10);
	
	btnRealizaiInterogarea2.setBackground(new Color(32, 178, 170));
	btnRealizaiInterogarea2.setFont(new Font("Tahoma", Font.BOLD, 15));
	btnRealizaiInterogarea2.setBounds(36, 211, 213, 46);
	panel.add(btnRealizaiInterogarea2);
	
	JLabel lblNewLabel_11 = new JLabel("Introduce\u021Bi tipul vasului: \r\n( vl - vas de linie,  cr - vas cruci\u0219\u0103tor)");
	lblNewLabel_11.setForeground(new Color(255, 255, 255));
	lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 16));
	lblNewLabel_11.setBounds(28, 23, 525, 46);
	panel.add(lblNewLabel_11);
	
	JLabel lblNewLabel22 = new JLabel("\r\n");
	lblNewLabel22.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\proced.jpg"));
	lblNewLabel22.setBounds(0, 0, 593, 315);
	panel.add(lblNewLabel22);

	frame3.add(panel);
	frame3.setVisible(true);
		
}

	public void frameInfos() {
		frameinfo = new JFrame();
		frameinfo.setResizable(false);
		frameinfo.setBounds(100, 100, 556, 474);
		frameinfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(139, 0, 139));
		panel.setBackground(new Color(250, 128, 114));
		frameinfo.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblProfesorndrumtorDragomir = new JLabel("Profesor \u00EEndrum\u0103tor: Dragomir Gabriel ");
		lblProfesorndrumtorDragomir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblProfesorndrumtorDragomir.setBounds(0, 24, 379, 41);
		panel.add(lblProfesorndrumtorDragomir);
		
		txtrFacultateaDeAutomatic.setEditable(false);
		txtrFacultateaDeAutomatic.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		txtrFacultateaDeAutomatic.setBackground(new Color(176, 196, 222));
		txtrFacultateaDeAutomatic.setText("Student\u0103:  C\u00E2mpean Adelina Ioana \r\nGrupa:   30227 \r\nFacultatea de Automatic\u0103 \u0219i Calculatoare \r\n               Sec\u021Bia Calculatoare  ");
		txtrFacultateaDeAutomatic.setBounds(12, 263, 345, 84);
		panel.add(txtrFacultateaDeAutomatic);
		
		btnNewButton.setBackground(new Color(176, 196, 222));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(315, 370, 223, 41);
		panel.add(btnNewButton);
	
		
		JLabel lblNewLabel55 = new JLabel("\r\n");
		lblNewLabel55.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\utcnn.jpg"));
		lblNewLabel55.setBounds(-26, -79, 747, 648);
		panel.add(lblNewLabel55);
		
		frameinfo.setVisible(true);

	}
	
	public void frame_Proc2() {

		frameproc2 = new JFrame();
		frameproc2.setResizable(false);
		frameproc2.setBounds(100, 100, 570, 393);
		frameproc2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(139, 0, 139));
		panel.setBackground(new Color(250, 128, 114));
		frameproc2.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblIntroduceiOBtlie = new JLabel("Introduce\u021Bi numele unei b\u0103t\u0103lii:");
		lblIntroduceiOBtlie.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIntroduceiOBtlie.setBounds(12, 13, 432, 53);
		panel.add(lblIntroduceiOBtlie);
		
		txtBattleOf.setBackground(new Color(100, 149, 237));
		txtBattleOf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		txtBattleOf.setText("Battle of ");
		txtBattleOf.setBounds(93, 134, 183, 45);
		panel.add(txtBattleOf);
		txtBattleOf.setColumns(10);
		
		btnefect.setBackground(new Color(95, 158, 160));
		btnefect.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnefect.setBounds(309, 266, 218, 38);
		panel.add(btnefect);
		
		JLabel lblNarvikWaterlooGettysburg = new JLabel("Narvik, Waterloo, Gettysburg, Leipzig, Deutschland, Madrid, Unmortals, Rivals ");
		lblNarvikWaterlooGettysburg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNarvikWaterlooGettysburg.setBounds(12, 57, 548, 33);
		panel.add(lblNarvikWaterlooGettysburg);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Adelina\\Desktop\\JVAAAAAAAAA.jpg"));
		lblNewLabel.setBounds(-152, -309, 964, 748);
		panel.add(lblNewLabel);
		
		frameproc2.setVisible(true);
	}

}
