package service;


import imp.UserDaoImp;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

import entity.User;

public class UserLoginAction extends ActionSupport{
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		UserDao userDao =new UserDaoImp();
		if (userDao.login(user)) {
			System.out.println("普通用户登陆成功！！");
			return SUCCESS;
		}
		return INPUT;
	}
}
