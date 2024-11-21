package mn.iotstar.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import mn.iotstar.models.UserModel;

public class DBConnectSQL_22162032 {
	private final String serverName = "localhost";
	private final String dbName = "ktde10";
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
			System.out.println(new DBConnectSQL_22162032().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UserModel findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}
