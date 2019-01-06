package action;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ServiceImp.UserDaoImp;
import entity.User;
@WebServlet("/operator")
public class UserAtion extends HttpServlet{
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		String value = req.getParameter("operation");
		if("register".equals(value)){
			int cno=Integer.parseInt(req.getParameter("cno"));
			String username=req.getParameter("username");
			String passwd=req.getParameter("passwd");
			User user=new User();
			user.setCno(cno);
			user.setUser(username);
			user.setPasswd(passwd);
			UserDaoImp udi=new UserDaoImp();
			udi.add(user);
			out.write("<script>window.parent.location.href='index.jsp';alert('注册成功');</script>");
		}	
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
}
