package service;
import imp.AdminDaoImp;
import imp.FindDaoImp;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminDao;
import dao.FindDao;
import entity.Admin;
import entity.Goods;

public class UploadAction extends ActionSupport{
	private Goods goods;
	
	
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		FindDao up=new FindDaoImp();
		if (up.upload(goods)) {
			System.out.println("拍品增加成功！！");
			return SUCCESS;
		}
			return INPUT;
	}
}
