package mn.iotstar.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import mn.iotstar.configs.DBConnectSQL;
import mn.iotstar.dao.IUserDao;
import mn.iotstar.models.UserModel;

public class UserDaoImpl extends DBConnectSQL implements IUserDao {
=======
import mn.iotstar.configs.DBConnectMySQL;
import mn.iotstar.dao.IUserDao;
import mn.iotstar.models.UserModel;

public class UserDaoImpl extends DBConnectMySQL implements IUserDao{
>>>>>>> 5d3cbdaa1e8fd69ae42b5139e021fdd6cd93b565

	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;
<<<<<<< HEAD

	@Override
	public List<UserModel> findAll() {
		String sql = "select * from users";

		List<UserModel> list = new ArrayList<>(); // Tạo 1 list để truyền dữ liệu

		try {
			conn = super.getConnection(); // kết nối database
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next() /* Next từng dòng tới cuối bảng */ ) {
				list.add(new UserModel(rs.getInt("id"), rs.getString("username"), rs.getString("password"),
						rs.getString("email"), rs.getString("fullname"), rs.getString("images"), rs.getString("phone"),
						rs.getInt("roleid"), rs.getDate("createDate"))); // Add vào
			}
			return list;
		}

		catch (Exception e) {
=======
	
	@Override
	public List<UserModel> findAll() {
		String sql ="select * from users";
		
		List<UserModel> list = new ArrayList<>(); //Tạo 1 list để truyền dữ liệu
		
		try
		{
			conn = super.getDatabaseConnection(); //kết nối database
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next() /*Next từng dòng tới cuối bảng*/ ) {
				list.add(
						new UserModel(
								rs.getInt("id"), 
								rs.getString("username"), 
								rs.getString("password"), 
								rs.getString("email"), 
								rs.getString("fullname"), 
								rs.getString("images"))); //Add vào
			}
			return list;
		}
		
		catch (Exception e)
		{
>>>>>>> 5d3cbdaa1e8fd69ae42b5139e021fdd6cd93b565
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserModel findById(int id) {
<<<<<<< HEAD
		String sql = "SELECT * FROM users WHERE id = ? ";
		try {
			conn = new DBConnectSQL().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				UserModel user = new UserModel();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setUsername(rs.getString("username"));
				user.setFullname(rs.getString("fullname"));
				user.setPassword(rs.getString("password"));
				user.setImages(rs.getString("images"));
				user.setRoleid(Integer.parseInt(rs.getString("roleid")));
				user.setPhone(rs.getString("phone"));
				user.setCreateDate(rs.getDate("createDate"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
=======
		// TODO Auto-generated method stub
>>>>>>> 5d3cbdaa1e8fd69ae42b5139e021fdd6cd93b565
		return null;
	}

	@Override
	public void insert(UserModel user) {
<<<<<<< HEAD

		// TODO Auto-generated method stub

		String sql = "INSERT INTO users(id, username, password, images, fullname, email, phone, roleid, createDate) VALUES (?, ?, ?, ?, ?)";

		try {
			conn = super.getConnection(); // Ket noi database ps =
			conn.prepareStatement(sql); // Nem cau sql vao cho thuc thi
=======
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO users(id, username, email, password, images, fullname) VALUES (?, ?, ?, ?, ?, ?)";
		
		try {
			conn = super.getDatabaseConnection(); //Ket noi database
			ps = conn.prepareStatement(sql); //Nem cau sql vao cho thuc thi
>>>>>>> 5d3cbdaa1e8fd69ae42b5139e021fdd6cd93b565

			ps.setInt(1, user.getId());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getImages());
			ps.setString(6, user.getFullname());
<<<<<<< HEAD

			ps.executeUpdate();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	//Test chương trình. Kích chuột phải chọn run as -> java application
	public static void main(String[] args) {

		UserDaoImpl userDao = new UserDaoImpl();

		userDao.insert(new UserModel(0, userDao.getDbName(), userDao.getDbName(), userDao.getDbName(),
				userDao.getDbName(), userDao.getDbName(), userDao.getDbName(), 0, null));

=======
			
			ps.executeUpdate();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		UserDaoImpl userDao = new UserDaoImpl();
	
		userDao.insert(new UserModel(4, "abc1", "abc1@gmail.com", "1234", "", "abcdegh"));
		
>>>>>>> 5d3cbdaa1e8fd69ae42b5139e021fdd6cd93b565
		List<UserModel> list = userDao.findAll();
		for (UserModel user : list) {
			System.out.println(user);
		}
	}

<<<<<<< HEAD
	private String getDbName() {
=======
	@Override
	public UserModel findByUserName(String username) {
>>>>>>> 5d3cbdaa1e8fd69ae42b5139e021fdd6cd93b565
		// TODO Auto-generated method stub
		return null;
	}

<<<<<<< HEAD
	@Override
	public UserModel findByUserName(String username) {
		String sql = "SELECT * FROM users WHERE username = ? ";
		try {
			conn = new DBConnectSQL().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while (rs.next()) {
				UserModel user = new UserModel();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setUsername(rs.getString("username"));
				user.setFullname(rs.getString("fullname"));
				user.setPassword(rs.getString("password"));
				user.setImages(rs.getString("images"));
				user.setRoleid(Integer.parseInt(rs.getString("roleid")));
				user.setPhone(rs.getString("phone"));
				user.setCreateDate(rs.getDate("createDate"));
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
=======
>>>>>>> 5d3cbdaa1e8fd69ae42b5139e021fdd6cd93b565
}
