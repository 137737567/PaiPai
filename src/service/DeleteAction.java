package service;

import com.opensymphony.xwork2.ActionSupport;

import entity.Goods;

public class DeleteAction extends ActionSupport{
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
		
		return super.execute();
	}
	
	
	
}
