import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

public class Controller {
	public view myV;
	public db_connection myC;
	
	public Controller(view v, db_connection c) {
		myV = v;
		myC = c;
		myV.addListenerButon1(new buton1());
		myV.addListenerButon2(new buton2());
		myV.addListenerButon3(new buton3());
		myV.addListenerButon4(new buton4());
		myV.addListenerButon5(new buton5());
		myV.addListenerButon6(new buton6());
		myV.addListenerButon7(new buton7());

	}
	
public class buton1 implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		try {
			myV.getFrame().dispose();
			myV.view2();
			myC.conectare();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}		
}

public class buton2 implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		JTextArea txtrJ = new JTextArea();

		try {
			String combo12 = myV.getComboBox().getSelectedItem().toString();
			
			if (combo12.equalsIgnoreCase("Interogarea3a"))
			{
				myV.view_proc();
				myV.getFrame3().setVisible(true);
			}
			
			else if (combo12.equalsIgnoreCase("Interogarea3b"))
			{
				ResultSet rezultat3b=myC.Interogarea3b();
				myV.createResultFrame();
				myV.getTable().setModel(DbUtils.resultSetToTableModel(rezultat3b));  
				myV.getResultFrame().setVisible(true);
				myV.getTxtrJ().setText("2.03.b) S\u0103 se g\u0103seasc\u0103 numele navelor \u0219i anul lans\u0103rii pentru navele lansate \u00EEnainte de 1950 ordonate cresc\u0103tor dup\u0103 anul lans\u0103rii");
			
			}
			
			else if (combo12.equalsIgnoreCase("Interogarea4a"))
			{
				myV.frame_Proc2();
				myV.getFrameproc2().setVisible(true);

				}
			
			else if (combo12.equalsIgnoreCase("Interogarea4b"))
			{
				ResultSet rezultat4b=myC.Interogarea4b();
				myV.createResultFrame();
				myV.getTable().setModel(DbUtils.resultSetToTableModel(rezultat4b));  
				myV.getResultFrame().setVisible(true);
				myV.getTxtrJ().setText("2.04.b) S\u0103 se g\u0103seas\u0103 perechi de clase (clasa1, clasa2) ce sunt de acela\u0219i tip dar apar\u021Bin la \u021B\u0103ri diferite. O pereche este unic\u0103 \u00EEn rezultat");
			}
			
			else if (combo12.equalsIgnoreCase("Interogarea5a"))
			{
				ResultSet rezultat5a=myC.Interogarea5a();
				myV.createResultFrame();
				myV.getTable().setModel(DbUtils.resultSetToTableModel(rezultat5a));  
				myV.getResultFrame().setVisible(true);
				myV.getTxtrJ().setText("2.05.a) S\u0103 se g\u0103seasc\u0103 \u021B\u0103rile ale c\u0103ror clase au cele mai multe arme");
			}
			
			else if (combo12.equalsIgnoreCase("Interogarea5b"))
			{
				ResultSet rezultat5b=myC.Interogarea5b();
				myV.createResultFrame();
				myV.getTable().setModel(DbUtils.resultSetToTableModel(rezultat5b));  
				myV.getResultFrame().setVisible(true);
				myV.getTxtrJ().setText("2.05.b) S\u0103 se g\u0103seasc\u0103 datele b\u0103t\u0103liilor la care au participat navele clasei 'Deutschland'");
			}
			
			else if (combo12.equalsIgnoreCase("Interogarea6a"))
			{
				ResultSet rezultat6a=myC.Interogarea6a();
				myV.createResultFrame();
				myV.getTable().setModel(DbUtils.resultSetToTableModel(rezultat6a));  
				myV.getResultFrame().setVisible(true);
				myV.getTxtrJ().setText("2.06.a) S\u0103 se g\u0103seasc\u0103 \u021Bara ce de\u021Bine clasa cu maximul dimensiunii tunurilor cruci\u0219\u0103toarelor");
			}
			
			else if (combo12.equalsIgnoreCase("Interogarea6b"))
			{
				
				ResultSet rezultat6b=myC.Interogarea6b();
				myV.createResultFrame();
				myV.getTable().setModel(DbUtils.resultSetToTableModel(rezultat6b));  
				myV.getResultFrame().setVisible(true);
				myV.getTxtrJ().setText("2.06.b) S\u0103 se g\u0103seasc\u0103 pentru fiecare b\u0103t\u0103lie num\u0103rul navelor din fiecare categorie 'rezultat'");
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

public class buton3 implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		myV.getResultFrame().dispose();
	}	
}

public class buton4 implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		try {
			myV.getFrame3().dispose();
			ResultSet rezultat3a=myC.Interogarea3a(myV.getTxtVl());
			myV.createResultFrame();
			myV.getTable().setModel(DbUtils.resultSetToTableModel(rezultat3a));  
			myV.getResultFrame().setVisible(true);
			myV.getTxtrJ().setText("2.03.a) S\u0103 se g\u0103seasc\u0103 denumirea clasei \u0219i \u021Bara pentru clasele de tip vas de linie");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}	
  }

public class buton5 implements ActionListener{
	
	public void actionPerformed(ActionEvent arg0) {
		try {
			myV.frameInfos();
			myV.getFrameinfo().setVisible(true);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}

public class buton6 implements ActionListener{
	
	public void actionPerformed(ActionEvent arg0) {
		try {
			myV.getFrameinfo().dispose();
			myV.getFrame();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}

public class buton7 implements ActionListener{
	
	public void actionPerformed(ActionEvent arg0) {
		try {
			myV.getFrameproc2().dispose();
			ResultSet rezultat4a=myC.Interogarea4a(myV.getTxtBattleOf());
			myV.createResultFrame();
			myV.getTable().setModel(DbUtils.resultSetToTableModel(rezultat4a));  
			myV.getResultFrame().setVisible(true);
			myV.getTxtrJ().setText("2.04.a) S\u0103 se afi\u0219eze numele, deplasamentul \u0219i num\u0103rul de arme pentru navele angrenate \u00EEn b\u0103t\u0103lia 'Battle of Narvik'");
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
}



