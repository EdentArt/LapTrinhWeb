package mn.iotstar.services;

import mn.iotstar.models.UsersModel_22162032;

public interface IUserService {
	UsersModel_22162032 login(String username, String password);
	
	UsersModel_22162032 FindByUserName(String username);
	
	

}
