<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>墨涵书城</title>
<link href="../images/manageraddress.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="top_nav">
  <div id="top_nav_left">
	<ul>
      <li><a href="#">收藏墨涵</a>&nbsp;|&nbsp;</li>
      <li><a href="#">您好,cn126**1</a>&nbsp;|&nbsp;</li>
      <li><a href="logout.html">[退出登录]</a>&nbsp;|&nbsp;</li>
      <li><a href="../login.html">[请登录]</a>&nbsp;|&nbsp;</li>
      <li><a href="personal.jsp">[个人设置]</a>&nbsp;|&nbsp;</li>
      <li><a href="../register.html">[免费注册]</a></li>
    </ul>
  </div>
  <div id="top_nav_right">
  	<ul>
    	<li><a href="#">墨涵客服</a></li>
        <li><a href="#">购买流程</a>&nbsp;|&nbsp;</li>
        <li><a href="myorder.html">我的订单</a>&nbsp;|&nbsp;</li>
        <li><a href="../cart.html">购物车(0)</a>&nbsp;|&nbsp;</li>
   	  <li><a href="../index.html">墨涵首页</a>&nbsp;|&nbsp;</li>
    </ul>
  </div>
</div>
<!--logo开始-->
<div id="personInfoLogo"><img src="../images/logo.png"></div>
<!--logo结束-->
<!--正文开始-->
<div id="main">
	<div id="main_left">
	  <table width="150" border="0" cellspacing="0" cellpadding="0">
	    <tr>
	      <td valign="top"><table width="150" border="0" cellspacing="0" cellpadding="0">
	        <tr>
	          <td>&nbsp;</td>
            </tr>
	        <tr>
	          <td align="center"><img src="../headerimage/default.png" width="100" height="100" style="border:1px solid #EEEEEE; padding:5px; background:#FFF;" /></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><a href="updateheaderimg.html">更改头像</a></td>
            </tr>
          </table></td>
        </tr>
	    <tr>
	      <td height="30" bgcolor="#E6E6E6">&nbsp;&nbsp;&nbsp;<span class="font14pxblackStrong">我的信息</span></td>
        </tr>
	    <tr>
	      <td><table width="150" border="0" cellspacing="0" cellpadding="0">
	        <tr>
	          <td width="30" height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="myorder.html">已买到的宝贝</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="manageraddress.html">我的收货地址</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="modifypass.html">修改密码</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="personal.html">个人信息</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">我的收藏</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">我的积分</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">评价管理</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">退款维权</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">我的彩票</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">我的网游</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">我的优惠券</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td>购买过的店铺</td>
            </tr>
          </table></td>
        </tr>
      </table>
	</div>
<div id="main_right">
  	<ul style="height:10px;"></ul>
    <!--标题-->
  <table cellspacing="0" cellpadding="0" style="width:800px; height:32px; border:1px solid #C4D5E0; background-color:#F9FAFC;">
  	  <tr>
  	    <td class="font12pxblackStrong">&nbsp;&nbsp;&nbsp;&nbsp;修改密码</td>
      </tr>
  </table>
  <!--搜索-->
  <table width="800" border="0" cellspacing="0" cellpadding="0">
    <form action="${pageContext.request.contextPath }/changepwd.action" method="post">
      <tr>
        <td height="40"><table width="800" cellspacing="0" cellpadding="0" style=" border:1px solid #CCC; border-top:none; display:block; margin-bottom:20px;">
          <tr>
            <td width="200" height="30" align="right">&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td height="30" align="right">旧密码：</td>
            <td><input name="oldpwd" type="password" id="textfield3" size="40" /></td>
          </tr>
          <tr>
            <td height="30" align="right">新密码：</td>
            <td><input name="newpwd" type="password" id="textfield4" size="40" /></td>
            </tr>
          <tr>
            <td height="30" align="right">确认新密码：</td>
            <td><input name="repwd" type="password" id="textfield5" size="40" /></td>
          </tr>
          <tr>
            <td height="30">&nbsp;</td>
            <td><input type="submit" name="button" id="button" value="保存" class="button_search" /></td>
          </tr>
          <tr>
            <td height="30">&nbsp;</td>
            <td>&nbsp;</td>
            </tr>
          </table></td>
      </tr>
    </form>
  </table>
  <table width="800" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td><img src="../images/ad1.png" width="800" height="276" /></td>
    </tr>
</table>
 </div>
</div>
<!--正文结束-->
</body>
</html>
