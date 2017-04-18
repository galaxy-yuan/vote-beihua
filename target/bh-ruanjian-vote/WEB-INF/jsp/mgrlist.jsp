<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%> 

    <script src="<%=basePath %>/js/jquery-3.2.0.js"></script>
    <link href="<%=basePath %>/css/mgr.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="<%=basePath %>/css/common.css">
    <link href="<%=basePath %>/css/modal.css" rel="stylesheet">
    <script src="<%=basePath %>/js/pop.js" type="text/javascript"></script>
    <script type="text/javascript" src="<%=basePath %>/js/modal.js"></script>
    <script type="text/javascript" src="<%=basePath %>/js/jquery.page.js" ></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>管理员列表</title>
    <style>
    *{ margin:0; padding:0; list-style:none;}
    a{ text-decoration:none;}
    a:hover{ text-decoration:none;}
    .tcdPageCode{padding: 15px 20px;text-align: left;color: #ccc;text-align:center;}
    .tcdPageCode a{display: inline-block;color: #428bca;display: inline-block;height: 25px;	line-height: 25px;	padding: 0 10px;border: 1px solid #ddd;	margin: 0 2px;border-radius: 4px;vertical-align: middle;}
    .tcdPageCode a:hover{text-decoration: none;border: 1px solid #428bca;}
    .tcdPageCode span.current{display: inline-block;height: 25px;line-height: 25px;padding: 0 10px;margin: 0 2px;color: #fff;background-color: #428bca;	border: 1px solid #428bca;border-radius: 4px;vertical-align: middle;}
    .tcdPageCode span.disabled{	display: inline-block;height: 25px;line-height: 25px;padding: 0 10px;margin: 0 2px;	color: #bfbfbf;background: #f2f2f2;border: 1px solid #bfbfbf;border-radius: 4px;vertical-align: middle;}
</style>
</head>
<%
  

%>
<body>
<div class="mgr" id="" >
    <div class="mgr-child" >
        <form class="mgr-form">
            <input type="text" class="search" value="请输入关键词" onfocus="if(this.value=='请输入关键词') this.value=''" />
            <input  type="button" class="search-bt" value="搜索">
            <input type="reset" class="" value="重置">
        </form>
    </div>
</div>
<div class="line"></div>
<div class="mgr-data">
    <button class="mgr-data-button"  id="add-key" data-title="新增管理员" data-url="" >新增管理员</button>
<table class="mgr-table" border="0" cellspacing="0">
    <thead>
    <tr>
        <td>账号</td>
        <td>密码</td>
        <td>是否管理员</td>
        <td>是否停用</td>
        <td>操作</td>
    </tr>
    </thead>
  <c:forEach items="${data.list}" var="mgr" >
  <tr>
      <td>${mgr.name} </td>
      <td>${mgr.pwd}</td>
      <td>
      <c:if test="${mgr.isroot}=='0'">否</c:if>
      <c:if test="${mgr.isroot}=='1'">是</c:if>
      </td>
      <td>${mgr.isstop}</td>
      <td>
          <label class="mgr-data-lable-modify">编辑</label>
          <label class="mgr-data-lable-delete">删除</label>
      </td>
  </tr>
  </c:forEach>
  
    <tr>
        <td>dd</td>
        <td>dd</td>
        <td>dd</td>
        <td>dd</td>
        <td>
            <label class="mgr-data-lable-modify">编辑</label>
            <label class="mgr-data-lable-delete">删除</label>
        </td>
    </tr>
</table>
<div class="page">
        <div class="tcdPageCode"></div>
        <script>
       var count = ${data.pageCount}
        var pagenum = ${data.pageNum}
        $(".tcdPageCode").createPage({
            pageCount:count ,
            current:pagenum,
            backFn:function(p){
                console.log(p);
                
            }
        });
    </script>
       
       
     <div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';"></div>

</div>

</div>
</body>
</html>