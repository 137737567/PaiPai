package dao;
import entity.User;;

public interface UserDao {
	/**
	 * ×¢²á
	 * @param user
	 * @return
	 */
	boolean register(User user);
	
	
	/**
	 * µÇÂ½
	 * @param user
	 * @return
	 */
	boolean login(User user);
}
