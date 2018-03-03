package service;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import imp.FindDaoImp;

import com.opensymphony.xwork2.ActionSupport;

import dao.FindDao;
import entity.Goods;

public class FindAction extends ActionSupport {

	private Goods goods;
	private String gName;
	
	
	
	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletResponse response= ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		PrintWriter out= response.getWriter();
		FindDao fd = new FindDaoImp();
		List<Goods> list = fd.goodsInf(gName);
		if(list!=null){
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.setAttribute("goods", list);
		}else {
			out.write("对不起，未查询到结果！");
		}
		return SUCCESS;
	}
}
