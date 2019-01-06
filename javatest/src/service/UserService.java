package service;
import java.util.List;
import entity.User;
public interface UserService {
	public void add(User user);
	public List<User> selectq();
}
