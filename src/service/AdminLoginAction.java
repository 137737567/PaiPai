package service;
import imp.AdminDaoImp;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminDao;
import entity.Admin;

public class AdminLoginAction extends ActionSupport{
	private Admin admin;
	
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
	AdminDao ad= new AdminDaoImp();
	if (ad.login(admin)) {
		System.out.println("管理员登陆成功！");
		return SUCCESS;
	}
		return INPUT;
	}
}
