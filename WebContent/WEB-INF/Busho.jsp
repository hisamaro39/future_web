<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ page import="app.BushoInfo" %>
<%
BushoInfo busho_info = (BushoInfo) request.getAttribute("busho_info");
%>
<title>部署登録</title>
<link rel="stylesheet" href="./Layout.css" type="text/css">
</head>
<body>
<div class = "left_wrap">
<form action="/future_web/BushoServlet?action=edit" method="post">
部署一覧：<br>
<table border="1">
<tr>
<th>部署ID</th><th>部署名</th>
</tr>
<tr>
<th><%= busho_info.getId() %></th><th><%= busho_info.getName() %></th>
<th><input type="submit" value="編集">
</tr>
</table>
</form>
</div>
<div class = "right_wrap">
<form action="/future_web/BushoServlet?action=save" method="post">
部署詳細データ：<br>
部署ID:
<input type="text" name="busho_id"><br>
部署名:
<input type="text" name="busho_name"><br>
郵便番号:
<input type="text" name="post_code"><br>
入社日:
<input type="text" name="entry"><br>
退社日:
<input type="text" name="retire"><br>
<input type="submit" value="保存">
</form>
</div>
</body>
</html>