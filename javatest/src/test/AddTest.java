package test;
import java.sql.SQLException;
import dao.UserDao;
import entity.User;

public class AddTest {
public static void main(String[] args) {
	User user=new User();
	user.setCno(1);
	user.setUser("大明");
	user.setPasswd("123");
	UserDao ud=new UserDao();
	try {
		ud.add(user);
		System.out.println("数据插入成功");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.err.println("数据插入失败");
		e.printStackTrace();
	}
}
}
