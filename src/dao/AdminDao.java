package dao;
import entity.Admin;
import entity.User;;

public interface AdminDao {

	/**
	 * µÇÂ½
	 * @param user
	 * @return
	 */
	boolean login(Admin admin);
}
