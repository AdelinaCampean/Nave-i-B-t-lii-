
import java.awt.Graphics;
import java.sql.*;
public class db_connection {

	public Connection conexiune;
	public void conectare() throws Exception
	{
		conexiune=DriverManager.getConnection("jdbc:mysql://localhost/subiectul2","root","");
	}
	
	
	//corect!!!
	public ResultSet Interogarea3a(String vas) throws SQLException {
		CallableStatement interogare3a= conexiune.prepareCall("{call interogare_3_a(?)}");
		interogare3a.setString(1,vas);
		ResultSet rezultat3a=interogare3a.executeQuery();
		return rezultat3a;			
	}
	
	public ResultSet Interogarea3b() throws SQLException {
		Statement interogare3b= conexiune.createStatement();
		ResultSet rezultat3b=interogare3b.executeQuery("SELECT nume, anul_lansarii FROM Nave WHERE (anul_lansarii < 1950) ORDER BY anul_lansarii;");
		return rezultat3b;			
	}
	
	public ResultSet Interogarea4a(String batalie) throws SQLException {
		CallableStatement interogare4a= conexiune.prepareCall("{call interogare_4_a(?)}");
		interogare4a.setString(1, batalie);
		ResultSet rezultat4a=interogare4a.executeQuery();
		return rezultat4a;			
	}
	
	public ResultSet Interogarea4b() throws SQLException {
		Statement interogare4b= conexiune.createStatement();
		ResultSet rezultat4b=interogare4b.executeQuery("SELECT clasa1.clasa as \"Clasa1\", clasa2.clasa as \"Clasa2\" FROM Clase clasa1 INNER JOIN Clase clasa2 ON (clasa1.tip=clasa2.tip) WHERE (clasa1.tara <> clasa2.tara AND clasa1.clasa<clasa2.clasa);");
		return rezultat4b;			
	}
	
	public ResultSet Interogarea5a() throws SQLException {
		Statement interogare5a= conexiune.createStatement();
		ResultSet rezultat5a=interogare5a.executeQuery("SELECT tara FROM Clase WHERE nr_arme >= all(select nr_arme from Clase); ");
		return rezultat5a;			
	}
	
	public ResultSet Interogarea5b() throws SQLException {
		Statement interogare5b= conexiune.createStatement();
		ResultSet rezultat5b=interogare5b.executeQuery("SELECT Data FROM Batalii WHERE data = ANY( SELECT Batalii.data FROM Batalii inner join Consecinte on (Batalii.nume=Consecinte.batalie) inner join Nave ON (Consecinte.nava=Nave.nume) WHERE (Nave.clasa='Deutschland'));");
		return rezultat5b;			
	}
	
	public ResultSet Interogarea6a() throws SQLException {
		Statement interogare6a= conexiune.createStatement();
		ResultSet rezultat6a=interogare6a.executeQuery("SELECT tara FROM Clase WHERE tip = 'cr' and diametru_tun = (select MAX(diametru_tun) from Clase);");
		return rezultat6a;			
	}
	
	public ResultSet Interogarea6b() throws SQLException {
		Statement interogare6b= conexiune.createStatement();
		ResultSet rezultat6b=interogare6b.executeQuery("SELECT c.Batalie, (Select Count(rezultat) From Consecinte Where rezultat= 'nevatamat' and batalie=c.batalie) as Nevatamat, (Select COUNT(rezultat) FROM CONSECINTE WHERE rezultat = 'avariat' and batalie = c.batalie) as Avariat,(Select COUNT(rezultat) FROM CONSECINTE WHERE rezultat = 'scufundat' and batalie=c.batalie) as Scufundat FROM CONSECINTE c Group by Batalie;");
		return rezultat6b;			
	}
	
}
