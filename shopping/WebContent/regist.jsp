<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">

<title>Ĭ�����-���û�ע��</title>
<link href="images/register.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/verifycode.js"></script>
<script type="text/javascript" src="jQuery/jquery-1.10.2.js"></script>
</head>
<body>
<div id="header">
  <div id="header_line1"></div>
  <div>
   	<div id="header_logo"><a href="index.html"><img src="images/logo.png" alt="ī�����" title="ī�����" width="211" height="67"></a></div>
   	<div id="header_navigate">
        	<ul>
            	<li class="cartbuy"></li>
                <li><a href="#">���ﳵ</a></li>
                <li><a href="index.html">ī����ҳ</a></li>
                <li><a href="login.html">���½</a></li>
            </ul>
        </div>
  </div>
  <div id="header_line2"></div>
</div>
<div id="main"> 
  <div id="main_title">ע�����û�</div>
    <div>
      <form id="form1" name="form1" method="post" action="${pageContext.request.contextPath }/regist.action">
        <table width="770" border="0" align="center" cellpadding="0" cellspacing="0" >
          <tr>
            <td height="60" align="right" class="font18pxStrong">&nbsp;</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td width="200" height="40" align="right" class="font18pxStrong">����/�ֻ����룺</td>
            <td>
            <input name="regname" type="text" class="input_text input_text_normal" id="textfield" tabindex="1" /></td>
            <td>&nbsp;������Ա������ֻ�����Ϊ�û���</td>
          </tr>
          <tr>
            <td height="40" align="right" class="font18pxStrong">��¼���룺</td>
            <td><input name="regpass" type="password" class="input_text input_text_foucs" id="textfield2" tabindex="2" /></td>
            <td><p>&nbsp;����Ϊ6-20λ�ַ�������Ӣ�ġ����֡��������</p></td>
          </tr>
          <tr>
            <td height="40" align="right" class="font18pxStrong">ȷ�����룺</td>
            <td><input name="regrepass" type="password" class="input_text input_text_normal" id="textfield3" tabindex="3" /></td>
            <td>&nbsp;�ٴ���������</td>
          </tr>
          <tr>
            <td height="40" align="right" class="font18pxStrong">ͼƬ��֤�룺</td>
            <td width="245"><input name="verifycode" type="text" class="input_text input_text_normal" id="textfield4" tabindex="4" /></td>
            <td>
              <table width="325" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="left">&nbsp;������ͼƬ�е��ַ�</td>
                  <td><img src="${pageContext.request.contextPath }/verifyimg" id="verifyimg" width="100" height="20" /></td>
                  <td width="80"><a href="javascript:changeVerifyCode()">��һ��</a></td>
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
              �����Ķ���ͬ��<a tabindex="9" href="#" target="_blank">��ī�����������</a></td>
            <td>&nbsp;</td>
          </tr>
        </table>
      </form>
    </div>
</div>
<div id="footer1">
<table width="800" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="40" align="center">Copyright (C) ī���� 2008-2013, All Rights Reserved|��ICP֤080089��</td>
  </tr>
  <tr>
    <td height="60" align="center"><img src="images/validate.gif" width="128" height="47" alt="��ַ����" /></td>
  </tr>
</table>
</div>
</body>
</html>
