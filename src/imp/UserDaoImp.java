package imp;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.HibernateUtil;
import dao.UserDao;
import entity.User;

public class UserDaoImp implements UserDao{
	/**
	 * 用户注册
	 */
	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		Session session =HibernateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		boolean tag = false;
		try {
			System.out.println(user);
			session.save(user);
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

	/**
	 * 用户登录
	 */
	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		Transaction transaction =null;
		try {
			Session session =HibernateUtil.getSession();
			transaction =session.beginTransaction();
//			User f_user = (User)session.get(User.class, user.getUserName());
//			if (f_user.getPassWord().equals(user.getPassWord())) {
//				tag = true;
//			}
			System.out.println(session);
			System.out.println(user);
			User f_user=(User)session.createQuery("from User u where u.userName=:uName and u.passWord=:upassword").setParameter("uName", user.getUserName()).setParameter("upassword", user.getPassWord()).uniqueResult();
			if (f_user.getPassWord().equals(user.getPassWord())) {
			}
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			transaction.rollback();
		}finally{
			HibernateUtil.closeSession();
		}
		return true;
	}

}
