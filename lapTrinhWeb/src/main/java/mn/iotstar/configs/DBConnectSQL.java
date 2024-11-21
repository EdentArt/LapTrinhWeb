package mn.iotstar.configs;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import mn.iotstar.models.UserModel;

public class DBConnectSQL {

	private final String serverName = "localhost";
	private final String dbName = "tuan2";
	private final String portNumber = "1433";
	private final String instance = ""; // Nếu không có instance, để chuỗi rỗng
	private final String userID = "sa"; // Điền userID nếu cần
	private final String password = "2004"; // Điền password nếu cần

	public Connection getConnection() throws Exception {
            // URL kết nối
            String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;

            if (instance == null || instance.trim().isEmpty())
                url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
         
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            return DriverManager.getConnection(url, userID, password);
    }

	// Test chương trình. Kích chuột phải chọn run as -> java application
	public static void main(String[] args) {
		try {
			System.out.println(new DBConnectSQL().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UserModel findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}
=======
public class DBConnectSQL {

	private final String serverName = "DESKTOP-T2CV8JR";

	 private final String dbName = "ltweb";


	 private final String portNumber = "1433";


	 private final String userID = "sa";


	 private final String password = "1234567@a$";



	 public Connection getConnection() throws Exception {



	 String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;


	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");


	 return DriverManager.getConnection(url, userID, password);



	 }



	 // Test chương trình. Kích phải chuột chọn run as->java application



	 public static void main(String[] args) {



	 try {



	 System.out.println(new DBConnectSQL().getConnection());



	 } catch (Exception e) {



	 e.printStackTrace();



	 }



	 }



>>>>>>> 5d3cbdaa1e8fd69ae42b5139e021fdd6cd93b565
}
