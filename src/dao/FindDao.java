package dao;

import java.util.List;

import entity.Goods;

public interface FindDao {
	//��ѯ��Ʒ��Ϣ
	List<Goods> goodsInf(String name);
	
	
	//�ϴ���Ʒ
	boolean upload(Goods goods);
	
	
	//ɾ����Ʒ
	boolean delete(Goods goods);
}
