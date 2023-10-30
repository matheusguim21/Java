package JDBC.applicaton;

import JDBC.db.DB;

import java.sql.*;

public class Program {
	public static void main(String[] args) throws SQLException {
		Connection connection = DB.getConnection();

		Statement sql = null;
		ResultSet result = null;
		try{
			sql = connection.createStatement();
			result =  sql.executeQuery("select * from " +
				"department");
			while(result.next()){
				System.out.println(result.getInt("Id") + ", " + result.getString("name"));
			}
			System.out.println(result);

		}catch (SQLException e){
			System.out.println(e.getMessage());

		}

		try {
			sql.executeQuery("INSERT INTO department VALUES(10, 'Testando')")
			;
		}catch (SQLException e){
			System.out.println(e.getMessage());
		}

	}
}
