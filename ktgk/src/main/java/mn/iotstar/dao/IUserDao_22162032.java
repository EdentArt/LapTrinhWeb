package mn.iotstar.dao;

import java.util.List;

import mn.iotstar.models.UsersModel_22162032;

public interface IUserDao_22162032 {

	List<UsersModel_22162032> findAll();
	
	UsersModel_22162032 findById(int id);
	
	void insert(UsersModel_22162032 user);
	
	UsersModel_22162032 findByUserName(String username);
	
	
}
