<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>默涵书城-会员登陆</title>
<link href="images/login.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/verifycode.js"></script>
<script type="text/javascript" src="jQuery/jquery-1.10.2.js"></script>
</head>
<body>
<div id="header">
  <div id="header_line1"></div>
  <div id="header_logo"><a href="index.jsp"><img src="images/logo.png" alt="墨涵书城" title="墨涵书城" width="211" height="67"></a></div>
</div>
<div id="main">
  <table width="870" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td>&nbsp;</td>
      <td height="50">&nbsp;</td>
    </tr>
    <tr>
      <td width="400"><img src="images/login_ad.png" width="387" height="341" /></td>
      <td width="470" height="347" valign="top" style="background:url(images/login_bg.png) no-repeat;"><table width="400" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="60"><table width="400" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td align="right"><table width="400" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="right">还不是墨涵网用户？</td>
                  <td width="73"><a href="${pageContext.request.contextPath }/regist.jsp"><img src="images/button_reg1.png" width="73" height="24" /></a></td>
                </tr>
              </table></td>
            </tr>
          </table></td>
          </tr>
        <tr>
          <td valign="top">
          <form id="form1" name="form1" method="post" action="${pageContext.request.contextPath }/login.action">
            <table width="400" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="100" height="30" align="right">用户名：</td>
                <td colspan="3"><label for="textfield"></label>
                  <input name="username" type="text" class="input_text" id="textfield" /></td>
              </tr>
              <tr>
                <td height="25" align="right">&nbsp;</td>
                <td colspan="3">请填写邮箱地址或手机号</td>
              </tr>
              <tr>
                <td height="30" align="right">密码：</td>
                <td colspan="3"><input name="password" type="text" class="input_text" id="textfield2" /> 
                  &nbsp;&nbsp;<a href="#">忘记密码</a></td>
              </tr>
              <tr>
                <td height="25" align="right">&nbsp;</td>
                <td colspan="3">请输入长度为6-20位的密码</td>
              </tr>
              <tr>
                <td height="30" align="right">验证码：</td>
                <td width="105"><input name="verifyCode" type="text" class="input_text_valid" id="textfield3" /></td>
                <td width="105"><img src="${pageContext.request.contextPath }/verifyimg	" id="verifyimg"  width="100" height="20" /></td>
                <td><a href="javascript:changeVerifyCode()">换一张</a></td>
              </tr>
              <tr>
                <td height="25" align="right">&nbsp;</td>
                <td colspan="3">请输入图片中的字符</td>
              </tr>
              <tr>
                <td height="30">&nbsp;</td>
                <td colspan="3"><input type="image" name="imageField" id="imageField" src="images/button_login.png" /><span>${requestScope.errorinfo }</span></td>
              </tr>
            </table>
          </form></td>
        </tr>
      </table></td>
    </tr>
  </table>

</div>
</body>
</html>