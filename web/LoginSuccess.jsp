<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>LoginSuccess.jsp</title>
</head>
<body>
<jsp:useBean id="user" type="dto.User" scope="request" />
恭喜<jsp:getProperty property="name" name="user" />登录成功！
</body>
</html>
