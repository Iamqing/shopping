<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/chili-1.7.pack.js"></script>
<script type="text/javascript" src="js/jquery.easing.js"></script>
<script type="text/javascript" src="js/jquery.dimensions.js"></script>
<script type="text/javascript" src="js/jquery.accordion.js"></script>
<script language="javascript">
	jQuery().ready(function(){
		jQuery('#navigation').accordion({
			header: '.head',
			navigation1: true, 
			event: 'click',
			fillSpace: true,
			animated: 'bounceslide'
		});
		$("#navigation").css("height" , $(document).height());
	});
</script>
<style type="text/css">
<!--
body {
	margin:0px;
	padding:0px;
	font-size: 12px;
}
#navigation {
	margin:0px;
	padding:0px;
	width:147px;
}
#navigation a.head {
	cursor:pointer;
	background:url(images/main_34.gif) no-repeat scroll;
	display:block;
	font-weight:bold;
	margin:0px;
	padding:5px 0 5px;
	text-align:center;
	font-size:12px;
	text-decoration:none;
}
#navigation ul {
	border-width:0px;
	margin:0px;
	padding:0px;
	text-indent:0px;
}
#navigation li {
	list-style:none; display:inline;
}
#navigation li li a {
	display:block;
	font-size:12px;
	text-decoration: none;
	text-align:center;
	padding:3px;
}
#navigation li li a:hover {
	background:url(images/tab_bg.gif) repeat-x;
		border:solid 1px #adb9c2;
}
-->
</style>
</head>
<body>
<div>
  <ul id="navigation">
    <li> <a class="head">�û�����</a>
      <ul>
        <li><a href="chkuserinfo.html" target="rightFrame">�鿴�û���Ϣ</a></li>
        <li><a href="resetuserpass.html" target="rightFrame">�����û�����</a></li>
      </ul>
    </li>
    <li> <a class="head">�鼮����</a>
      <ul>
      	<li><a href="addbook.html" target="rightFrame">����鼮</a></li>
        <li><a href="addbooktype.html" target="rightFrame">��ӷ���</a></li>
        <li><a href="managerbooktype.html" target="rightFrame">�鿴/ɾ������</a></li>
      </ul>
    </li>
    <li> <a class="head">��������</a>
      <ul>
        <li><a href="addordertype.html" target="rightFrame">��Ӷ�������</a></li>
      </ul>
    </li>
    <li> <a class="head">���Թ���</a>
      <ul>
        <li><a href="AddLink.php" target="rightFrame">�鿴����</a></li>
      </ul>
    </li>
    <li> <a class="head">�汾��Ϣ</a>
      <ul>
        <li><a href="http://www.51px.asia" target="_blank">by 51px</a></li>
      </ul>
    </li>
  </ul>
</div>
</body>
</html>
