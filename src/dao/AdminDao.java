package dao;
import entity.Admin;
import entity.User;;

public interface AdminDao {

	/**
	 * ��½
	 * @param user
	 * @return
	 */
	boolean login(Admin admin);
}
