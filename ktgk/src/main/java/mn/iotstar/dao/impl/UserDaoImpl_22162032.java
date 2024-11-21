package mn.iotstar.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import mn.iotstar.configs.DBConnectSQL;
import mn.iotstar.dao.IUserDao;
import mn.iotstar.models.UsersModel_22162032;

public class UserDaoImpl_22162032 extends DBConnectSQL implements IUserDao {

	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<UsersModel_22162032> findAll() {
		String sql = "select * from users";

		List<UsersModel_22162032> list = new ArrayList<>(); // Tạo 1 list để truyền dữ liệu

		try {
			conn = super.getConnection(); // kết nối database
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next() /* Next từng dòng tới cuối bảng */ ) {
				list.add(new UsersModel_22162032(rs.getInt("id"), rs.getString("username"), rs.getString("password"),
						rs.getString("email"), rs.getString("fullname"), rs.getString("images"), rs.getString("phone"),
						rs.getInt("roleid"), rs.getDate("createDate"))); // Add vào
			}
			return list;
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UsersModel_22162032 findById(int id) {
		String sql = "SELECT * FROM users WHERE id = ? ";
		try {
			conn = new DBConnectSQL().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				UsersModel_22162032 user = new UsersModel_22162032();
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

	@Override
	public void insert(UsersModel_22162032 user) {

		// TODO Auto-generated method stub

		String sql = "INSERT INTO users(id, username, password, images, fullname, email, phone, roleid, createDate) VALUES (?, ?, ?, ?, ?)";

		try {
			conn = super.getConnection(); // Ket noi database ps =
			conn.prepareStatement(sql); // Nem cau sql vao cho thuc thi

			ps.setInt(1, user.getId());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getImages());
			ps.setString(6, user.getFullname());

			ps.executeUpdate();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	//Test chương trình. Kích chuột phải chọn run as -> java application
	public static void main(String[] args) {

		UserDaoImpl_22162032 userDao = new UserDaoImpl_22162032();

		userDao.insert(new UsersModel_22162032(0, userDao.getDbName(), userDao.getDbName(), userDao.getDbName(),
				userDao.getDbName(), userDao.getDbName(), userDao.getDbName(), 0, null));

		List<UsersModel_22162032> list = userDao.findAll();
		for (UsersModel_22162032 user : list) {
			System.out.println(user);
		}
	}

	private String getDbName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UsersModel_22162032 findByUserName(String username) {
		String sql = "SELECT * FROM users WHERE username = ? ";
		try {
			conn = new DBConnectSQL().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			rs = ps.executeQuery();
			while (rs.next()) {
				UsersModel_22162032 user = new UsersModel_22162032();
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
	
}
