<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/19
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>拦截器</title>
    <script src="js/jquery-2.1.0.js"></script>
</head>
<body>
<h1>登录成功</h1>
<a href="user/testInterceptor.do" >testInterceptor</a>

${user.username}

<script >
    $(function () {
        $.ajax({
            url:"user/testInterceptor.do",
            type:"get" ,
            dataType:"json" ,
            success:function(data){
                alert(2) ;
            }
        })
    })
</script>
</body>
</html>
