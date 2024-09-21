package mn.iotstar.dao;

import java.util.List;

import mn.iotstar.models.UserModel;

public interface IUserDao {

	List<UserModel> findAll();
	
	UserModel findById(int id);
	
	void insert(UserModel user);
	
	UserModel findByUserName(String username);
	
	
}
