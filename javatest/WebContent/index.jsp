<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="entity.User" %>
<%@ page import="dao.UserDao" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
</script>
</head>
<body>
<div>
<form action="operator?operation=register" id="sb" method="post" >
<tr>
学号：<input type="text" class="textinput"  id="cno" name="cno" />
</tr>
<div >
姓名：<input type="text" class="textinput"  id="username" name="username" />
</div>
<div >
密码：<input type="password" class="textinput"  id="passwd" name="passwd" />
</div>
<input  type="submit"  value="添加" name="a" border="0"/>
</div>
<div>
<%
	UserDao us=new UserDao();
List<User> list = new ArrayList<User>();
	list=us.selectq();
	for(User user:list){	
%>
<div>cno:
<%=user.getCno() %>
</div>
<div>
user:
<%=user.getUser() %>
</div>
<div>
passwd:
<%=user.getPasswd() %>
</div>
<% 
	}
%>
</div>
</body>
</html>