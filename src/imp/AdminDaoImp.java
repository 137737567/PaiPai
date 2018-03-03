package imp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.AdminDao;
import dao.HibernateUtil;
import entity.Admin;
import entity.User;

public class AdminDaoImp implements AdminDao{
	@Override
	public boolean login(Admin admin) {
		// TODO Auto-generated method stub
		Session session = dao.HibernateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		boolean tag = false;
		try {
			Admin f_admin=(Admin)session.createQuery("from Admin a where a.name=:uName and a.passWord=:upassword").setParameter("uName", admin.getName()).setParameter("upassword", admin.getPassWord()).uniqueResult();
			if (f_admin.getPassWord().equals(admin.getPassWord())) {
				tag = true;
			}
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
