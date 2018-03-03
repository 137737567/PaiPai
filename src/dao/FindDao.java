package dao;

import java.util.List;

import entity.Goods;

public interface FindDao {
	//查询拍品信息
	List<Goods> goodsInf(String name);
	
	
	//上传拍品
	boolean upload(Goods goods);
	
	
	//删除拍品
	boolean delete(Goods goods);
}
