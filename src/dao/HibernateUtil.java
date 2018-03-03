package dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateUtil {
	private final static ThreadLocal<Session> THREAD = new ThreadLocal<Session>();
	private static SessionFactory factory = null;
	private static Configuration configuration = null;
	
	static{
		try {
			configuration = new Configuration().configure();
			ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			factory = configuration.buildSessionFactory(registry);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	public static Session getSession(){
		Session session = THREAD.get();
		if (session == null) {
			session = factory.openSession();
			THREAD.set(session);
		}
		return session;
	}
	

	public static void closeSession(){
		Session session = THREAD.get();
		if (session != null) {
			session.close();
			THREAD.set(null);
		}
	}
}
