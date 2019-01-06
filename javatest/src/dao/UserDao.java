package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entity.User;
public class UserDao extends BasiceDao{
	public void add(User user) throws SQLException{
		Connection conn=super.getConnection();
		String sql="insert into tt(cno,user,passwd) values(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, user.getCno());
		ps.setString(2, user.getUser());
		ps.setString(3, user.getPasswd());
		ps.executeUpdate();
		ps.close();
		conn.close();	
	}
	public List<User> selectq() throws SQLException{
		Connection conn=super.getConnection();
		String sql="select * from tt";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		System.out.println(ps);
		List<User> list = new ArrayList<User>();
		while(rs.next()){
			User u =new User();
			u.setCno(rs.getInt("cno"));
			u.setUser(rs.getString("user"));
			u.setPasswd(rs.getString("passwd"));
			list.add(u);
		}
		return list;
	}
}
