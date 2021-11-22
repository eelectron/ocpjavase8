package ch3;

import java.io.IOException;
import java.sql.SQLException;

public class AllGoesWrong {
	public static void main(String[] args) {
		AllGoesWrong a = new AllGoesWrong();
		try {
			a.blowUp();
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("d");
		}
	}
	
	void blowUp() throws IOException, SQLException{
		throw new SQLException();
	}
}