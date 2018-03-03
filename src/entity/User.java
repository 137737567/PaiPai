package entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable{
	private int userId;
	private Set<Goods> goods = new HashSet<Goods>();
	private String userName;
	private String passWord;

	public User(int userId, Set<Goods> goods, String userName, String passWord) {
		super();
		this.userId = userId;
		this.goods = goods;
		this.userName = userName;
		this.passWord = passWord;
	}


	public Set<Goods> getGoods() {
		return goods;
	}


	public void setGoods(Set<Goods> goods) {
		this.goods = goods;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public User() {
		super();
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", goods=" + goods + ", userName="
				+ userName + ", passWord=" + passWord + "]";
	}
	
	
}
