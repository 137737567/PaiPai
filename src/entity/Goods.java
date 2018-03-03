package entity;
import java.io.Serializable;
import java.util.*;

import javax.xml.crypto.Data;


public class Goods implements Serializable{
	private int goodsId;
	private User user;
	private String gName;
	private String describe;
	private Date sTime;
	private Date eTime;
	private double startPrice;
	private double nowPrice;
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public Date getsTime() {
		return sTime;
	}
	public void setsTime(Date sTime) {
		this.sTime = sTime;
	}
	public Date geteTime() {
		return eTime;
	}
	public void seteTime(Date eTime) {
		this.eTime = eTime;
	}
	public double getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(double startPrice) {
		this.startPrice = startPrice;
	}
	public double getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(double nowPrice) {
		this.nowPrice = nowPrice;
	}
	public Goods(int goodsId, User user, String gName, String describe,
			Date sTime, Date eTime, double startPrice, double nowPrice) {
		super();
		this.goodsId = goodsId;
		this.user = user;
		this.gName = gName;
		this.describe = describe;
		this.sTime = sTime;
		this.eTime = eTime;
		this.startPrice = startPrice;
		this.nowPrice = nowPrice;
	}
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", user=" + user + ", gName="
				+ gName + ", describe=" + describe + ", sTime=" + sTime
				+ ", eTime=" + eTime + ", startPrice=" + startPrice
				+ ", nowPrice=" + nowPrice + "]";
	}

 
}
