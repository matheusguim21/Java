package JDBC.db;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DB {
	private static Connection conn = null;

	public static Connection getConnection(){
		if(conn == null){
			try {
			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException | ClassNotFoundException e) {
				throw new DBException(e.getMessage());
			}
		}
		return  conn ;
	}

	public static void closeConnection(){
		try {
			if(!conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	private static Properties loadProperties(){
		try (FileInputStream fs = new FileInputStream("./src/JDBC/db/db" +
				".properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DBException(e.getMessage());
		}

	}
}
