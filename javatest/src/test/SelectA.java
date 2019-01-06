package test;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.UserDao;
import entity.User;
public class SelectA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao ud = new UserDao();
		List<User> list = new ArrayList<User>();
		try {
			list=ud.selectq();
			for(User user:list){
				System.out.println(user);}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
