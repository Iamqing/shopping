<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>ī�����</title>
<link href="../images/manageraddress.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="top_nav">
  <div id="top_nav_left">
	<ul>
      <li><a href="#">�ղ�ī��</a>&nbsp;|&nbsp;</li>
      <li><a href="#">����,cn126**1</a>&nbsp;|&nbsp;</li>
      <li><a href="logout.html">[�˳���¼]</a>&nbsp;|&nbsp;</li>
      <li><a href="../login.html">[���¼]</a>&nbsp;|&nbsp;</li>
      <li><a href="personal.jsp">[��������]</a>&nbsp;|&nbsp;</li>
      <li><a href="../register.html">[���ע��]</a></li>
    </ul>
  </div>
  <div id="top_nav_right">
  	<ul>
    	<li><a href="#">ī���ͷ�</a></li>
        <li><a href="#">��������</a>&nbsp;|&nbsp;</li>
        <li><a href="myorder.html">�ҵĶ���</a>&nbsp;|&nbsp;</li>
        <li><a href="../cart.html">���ﳵ(0)</a>&nbsp;|&nbsp;</li>
   	  <li><a href="../index.html">ī����ҳ</a>&nbsp;|&nbsp;</li>
    </ul>
  </div>
</div>
<!--logo��ʼ-->
<div id="personInfoLogo"><img src="../images/logo.png"></div>
<!--logo����-->
<!--���Ŀ�ʼ-->
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
	          <td height="30" align="center"><a href="updateheaderimg.html">����ͷ��</a></td>
            </tr>
          </table></td>
        </tr>
	    <tr>
	      <td height="30" bgcolor="#E6E6E6">&nbsp;&nbsp;&nbsp;<span class="font14pxblackStrong">�ҵ���Ϣ</span></td>
        </tr>
	    <tr>
	      <td><table width="150" border="0" cellspacing="0" cellpadding="0">
	        <tr>
	          <td width="30" height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="myorder.html">���򵽵ı���</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="manageraddress.html">�ҵ��ջ���ַ</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="modifypass.html">�޸�����</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="personal.html">������Ϣ</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">�ҵ��ղ�</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">�ҵĻ���</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">���۹���</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">�˿�άȨ</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">�ҵĲ�Ʊ</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">�ҵ�����</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td><a href="javascript:void(0)">�ҵ��Ż�ȯ</a></td>
            </tr>
	        <tr>
	          <td height="30" align="center"><img src="../images/li_style.png" width="4" height="4" alt="" /></td>
	          <td>������ĵ���</td>
            </tr>
          </table></td>
        </tr>
      </table>
	</div>
<div id="main_right">
  	<ul style="height:10px;"></ul>
    <!--����-->
  <table cellspacing="0" cellpadding="0" style="width:800px; height:32px; border:1px solid #C4D5E0; background-color:#F9FAFC;">
  	  <tr>
  	    <td class="font12pxblackStrong">&nbsp;&nbsp;&nbsp;&nbsp;�޸�����</td>
      </tr>
  </table>
  <!--����-->
  <table width="800" border="0" cellspacing="0" cellpadding="0">
    <form action="${pageContext.request.contextPath }/changepwd.action" method="post">
      <tr>
        <td height="40"><table width="800" cellspacing="0" cellpadding="0" style=" border:1px solid #CCC; border-top:none; display:block; margin-bottom:20px;">
          <tr>
            <td width="200" height="30" align="right">&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td height="30" align="right">�����룺</td>
            <td><input name="oldpwd" type="password" id="textfield3" size="40" /></td>
          </tr>
          <tr>
            <td height="30" align="right">�����룺</td>
            <td><input name="newpwd" type="password" id="textfield4" size="40" /></td>
            </tr>
          <tr>
            <td height="30" align="right">ȷ�������룺</td>
            <td><input name="repwd" type="password" id="textfield5" size="40" /></td>
          </tr>
          <tr>
            <td height="30">&nbsp;</td>
            <td><input type="submit" name="button" id="button" value="����" class="button_search" /></td>
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
<!--���Ľ���-->
</body>
</html>
