<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">

<title>默涵书城-新用户注册</title>
<link href="images/register.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/verifycode.js"></script>
<script type="text/javascript" src="jQuery/jquery-1.10.2.js"></script>
</head>
<body>
<div id="header">
  <div id="header_line1"></div>
  <div>
   	<div id="header_logo"><a href="index.html"><img src="images/logo.png" alt="墨涵书城" title="墨涵书城" width="211" height="67"></a></div>
   	<div id="header_navigate">
        	<ul>
            	<li class="cartbuy"></li>
                <li><a href="#">购物车</a></li>
                <li><a href="index.html">墨涵首页</a></li>
                <li><a href="login.html">请登陆</a></li>
            </ul>
        </div>
  </div>
  <div id="header_line2"></div>
</div>
<div id="main"> 
  <div id="main_title">注册新用户</div>
    <div>
      <form id="form1" name="form1" method="post" action="${pageContext.request.contextPath }/regist.action">
        <table width="770" border="0" align="center" cellpadding="0" cellspacing="0" >
          <tr>
            <td height="60" align="right" class="font18pxStrong">&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="200" height="40" align="right" class="font18pxStrong">邮箱/手机号码：</td>
            <td>
            <input name="regname" type="text" class="input_text input_text_normal" id="textfield" tabindex="1" /></td>
            <td>&nbsp;请输入员邮箱或手机号作为用户名</td>
          </tr>
          <tr>
            <td height="40" align="right" class="font18pxStrong">登录密码：</td>
            <td><input name="regpass" type="password" class="input_text input_text_foucs" id="textfield2" tabindex="2" /></td>
            <td><p>&nbsp;密码为6-20位字符，可由英文、数字、符号组成</p></td>
          </tr>
          <tr>
            <td height="40" align="right" class="font18pxStrong">确认密码：</td>
            <td><input name="regrepass" type="password" class="input_text input_text_normal" id="textfield3" tabindex="3" /></td>
            <td>&nbsp;再次输入密码</td>
          </tr>
          <tr>
            <td height="40" align="right" class="font18pxStrong">图片验证码：</td>
            <td width="245"><input name="verifycode" type="text" class="input_text input_text_normal" id="textfield4" tabindex="4" /></td>
            <td>
              <table width="325" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="left">&nbsp;请输入图片中的字符</td>
                  <td><img src="${pageContext.request.contextPath }/verifyimg" id="verifyimg" width="100" height="20" /></td>
                  <td width="80"><a href="javascript:changeVerifyCode()">换一个</a></td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td height="40" align="right">&nbsp;</td>
            <td><input name="button" type="submit" id="button" class="button_reg_out" onmouseover="this.className='button_reg_over'" onmouseout="this.className='button_reg_out'" value=" " tabindex="5" />
                <span>${requestScope.errorinfo }</span>
            </td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td height="40" align="right">&nbsp;</td>
            <td><input id="chb_agreement" onmouseover="this.style.cursor='pointer';this.style.cursor='hand';" tabindex="6" checked="checked" type="checkbox" name="chb_agreement" />
              我已阅读并同意<a tabindex="9" href="#" target="_blank">《墨涵网交易条款》</a></td>
            <td>&nbsp;</td>
          </tr>
        </table>
      </form>
    </div>
</div>
<div id="footer1">
<table width="800" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="40" align="center">Copyright (C) 墨涵网 2008-2013, All Rights Reserved|甘ICP证080089号</td>
  </tr>
  <tr>
    <td height="60" align="center"><img src="images/validate.gif" width="128" height="47" alt="网址备案" /></td>
  </tr>
</table>
</div>
</body>
</html>
