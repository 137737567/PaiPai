package entity;

import java.io.Serializable;

public class Admin implements Serializable {
	private int adminId;
	private String name;
	private String passWord;
	
	public Admin(int adminId, String name, String passWord) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.passWord = passWord;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Admin() {
		super();
	}
	
	
}
