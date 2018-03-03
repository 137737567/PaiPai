package imp;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import dao.FindDao;
import dao.HibernateUtil;
import entity.Goods;

import org.hibernate.Transaction;

public class FindDaoImp implements FindDao{
 
	@Override
	public List<Goods> goodsInf(String name) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		List<Goods> list  =null;
		try {
			if (name ==null) {
				list = (List<Goods>)session.createQuery("from Goods").list();
			}else {
				list = (List<Goods>)session.createQuery("from Goods where gName="+name).list();			
			}
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.rollback();
		}finally{
			HibernateUtil.closeSession();
		}
		return list;
	}

	@Override
	public boolean upload(Goods goods) {
		// TODO Auto-generated method stub
		Session session =HibernateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		boolean tag = false;
		try {
			System.out.println(goods);
			session.save(goods);
			tag = true;
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.rollback();
		}finally{
			HibernateUtil.closeSession();
		}
		return tag;
	}

	
	
	@Override
	public boolean delete(Goods goods) {
		// TODO Auto-generated method stub
		Session session =HibernateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		boolean tag = false;
		try {
			System.out.println(goods);
			session.delete(goods);
			tag = true;
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.rollback();
		}finally{
			HibernateUtil.closeSession();
		}
		return tag;
	}

	

}