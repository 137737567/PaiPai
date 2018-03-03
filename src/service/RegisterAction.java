package service;


import imp.UserDaoImp;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

import entity.User;

public class RegisterAction extends ActionSupport{
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
		if (userDao.register(user)) {
			System.out.println("×¢²á³É¹¦£¡");
			return SUCCESS;
		}
		return INPUT;
	}
}
