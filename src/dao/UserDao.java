package dao;
import entity.User;;

public interface UserDao {
	/**
	 * ע��
	 * @param user
	 * @return
	 */
	boolean register(User user);
	
	
	/**
	 * ��½
	 * @param user
	 * @return
	 */
	boolean login(User user);
}
