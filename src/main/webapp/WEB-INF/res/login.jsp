<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/2
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="445" height="125" border="1" align="center" style="background:#cFf">
    <form action="/login"  name="actionForm" id="actionForm"  method="post" >
    <tr>
        <td colspan="4" align="center"><strong>个人网上银行</strong></td>
    </tr>
    <tr>
        <td width="139" align="right">卡号：</td>
        <td colspan="3">&nbsp;<input type="text" name="cardNo" /></td>
    </tr>
    <tr>
        <td align="right">密码：</td>
        <td colspan="3">&nbsp;<input type="text" name="password" /></td>
    </tr>
    <
    <tr>
        <td colspan="4" align="center"><input type="submit"  value="登录网上银行"/></td>
    </tr>
    </form>
</table>
</body>
</html>
