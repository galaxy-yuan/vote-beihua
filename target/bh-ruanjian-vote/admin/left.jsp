<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->

dl,ul,li{list-style:none;}
a{color:#000;}
a:link,a:visited,a:active,a:hover{text-decoration:none;}

.meun_div{width:110px;height:auto;border-top:0;background:#fff;padding-top:10px;font-size:14px;}
.meun_top{width:80px;height:27px;line-height:27px;padding-left:20px;}
.meun_img{float:left;width:7px;height:27px;background:url(images/menu_1.gif) no-repeat;}
.meun_box ul{margin:0;padding:0 5px 0 19px;font-size:12px;}
.meun_box li{width:auto;height:20px;line-height:20px;margin:3px 0;padding-left:2px;}
.none_box {display:none;}

</style>

<script type="text/JavaScript"> 
var $=function(id) {
   return document.getElementById(id);
};

//显示子菜单
function show_menu_box(num){
	for(var j=0;j<10;j++){
		if(j!=num){
			if($('box'+j)){
				$('box'+j).style.display='none';
				$('img'+j).style.background='url(images/menu_1.gif)';
			}
		}
	}
	if($('box'+num)){   
		if($('box'+num).style.display=='block'){
		  $('box'+num).style.display='none';
		 $('img'+num).style.background='url(images/menu_1.gif)';
		}else {
		  $('box'+num).style.display='block';
		  $('img'+num).style.background='url(images/menu_2.gif)';
		}
	}
}

</script>
</head>

<body>
<table width="173" height="100%" border="0" cellpadding="0" cellspacing="0" style="table-layout:fixed;">
  <tr>
    <td style="width:4px; background-image:url(images/main_16.gif)">&nbsp;</td>
    <td width="169" valign="top">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td height="20" background="images/main_11.gif">&nbsp;</td>
		  </tr>
		  <tr>
			<td>
				<div class="meun_div" align="center">
				
					<div class="meun_top">
						<div id="img1" class="meun_img"></div>
						<a onclick="show_menu_box(1)" href="javascript:;">投票管理</a>
					</div>
					<div class="meun_box none_box" id="box1">
						<ul>
							<li><a href="../vote/list"  target="rightFrame">&middot;投票列表</a></li>
							<li><a href="../vote/add"  target="rightFrame">&middot;添加投票</a></li>
						</ul>
					</div>
					
					<div class="meun_top">
						<div id="img2" class="meun_img"></div>
						<a onclick="show_menu_box(2)" href="javascript:;">公告管理</a>
					</div>
					<div class="meun_box none_box" id="box2">
						<ul>
							<li><a href="../get.do"  target="rightFrame">&middot;公告列表</a></li>
							<li><a href="pages/user-add.jsp"  target="rightFrame">&middot;添加公告</a></li>
						</ul>
					</div>
					
					<div class="meun_top">
						<div id="img3" class="meun_img"></div>
						<a onclick="show_menu_box(3)" href="javascript:;">用户管理</a>
					</div>
					<div class="meun_box none_box" id="box3">
						<ul>
							<li><a href="../vote/user/list"  target="rightFrame">&middot;用户列表</a></li>
							<li><a href="../vote/user/add"  target="rightFrame">&middot;用户注册</a></li>
							
						</ul>
					</div>
					
					<div class="meun_top">
						<div id="img4" class="meun_img"></div>
						<a onclick="show_menu_box(4)" href="javascript:;">系统管理</a>
					</div>
					<div class="meun_box none_box" id="box4">
						<ul>
							<li><a href="../admin/mgr/list"  target="rightFrame">&middot;管理员列表</a></li>
							<li><a href="../vote/admin/add"  target="rightFrame">&middot;添加管理员</a></li>
						</ul>
					</div>
					
					<!-- <div class="meun_top">
						<div id="img5" class="meun_img"></div>
						<a onclick="show_menu_box(5)" href="javascript:;">用户管理</a>
					</div>
					<div class="meun_box none_box" id="box5">
						<ul>
							<li><a href="../main.do"  target="rightFrame">&middot;用户列表</a></li>
							<li><a href="pages/admin-add.jsp"  target="rightFrame">&middot;添加用户</a></li>
						</ul>
					</div> -->
					
				</div>
			</td>
		  </tr>
		</table>
	</td>
  </tr>
</table>
</body>
</html>
