package mn.iotstar.services;

import mn.iotstar.models.UserModel;

public interface IUserService {
	UserModel login(String username, String password);
	
	UserModel FindByUserName(String username);
	
	

}