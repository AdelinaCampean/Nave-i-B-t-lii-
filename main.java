import java.sql.*;

public class main {

	public static void main(String[] args)
	{
		
		
		view vedere = new view();
		db_connection conectare = new db_connection();
		Controller control = new Controller(vedere,conectare);
	}
	
}
