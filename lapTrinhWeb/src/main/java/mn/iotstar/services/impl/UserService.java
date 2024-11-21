package mn.iotstar.services.impl;

import mn.iotstar.dao.IUserDao;
import mn.iotstar.dao.impl.UserDaoImpl;
import mn.iotstar.models.UserModel;
import mn.iotstar.services.IUserService;

public class UserService implements IUserService{

	//Lấy toàn bộ hàm trong tầng Dao của user
	IUserDao userDao = new UserDaoImpl();
	
	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.FindByUserName(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		}
		return null;
	}

	@Override
	public UserModel FindByUserName(String username) {
		
		return userDao.findByUserName(username);
	}

	public static void main(String[] args) {
		IUserService userService = new UserService();
		System.out.println(userService.FindByUserName("mainhu"));
	}
}
