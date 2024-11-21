package mn.iotstar.models;

import java.io.Serializable;
import java.sql.Date;

public class UsersModel_22162032 implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int UserID;
	private String Username;
	private String Password;
	private int isSeller;
	private int isAdmin;
	private String avatar;
	
	public UsersModel_22162032() {
		super();
	}

	public UsersModel_22162032(int UserID, String Username, String Password, int isSeller, int isAdmin,
			String avatar) {
		super();
		this.UserID = UserID;
		this.Username = Username;
		this.Password = Password;
		this.isSeller = isSeller;
		this.isAdmin = isAdmin;
		this.avatar = avatar;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getIsSeller() {
		return isSeller;
	}

	public void setIsSeller(int isSeller) {
		this.isSeller = isSeller;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Users_22162032 [UserID=" + UserID + ", Username=" + Username + ", Password=" + Password + ", isSeller="
				+ isSeller + ", isAdmin=" + isAdmin + ", avatar=" + avatar + "]";
	}

}
