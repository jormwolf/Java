package ServiceImp;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.UserDao;
import entity.User;
import service.UserService;
public class UserDaoImp implements UserService{
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
	UserDao	userdao=new UserDao();
	try {
		userdao.add(user);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	@Override
	public List<User> selectq() {
		UserDao	userdao=new UserDao();
		List<User> list =new ArrayList<User>();
		try {
			list=userdao.selectq();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return list;
	}
}
