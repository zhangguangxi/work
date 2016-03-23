<%@page import="com.asist.constant.AsistConstant" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/include/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="/include/common.jsp"></jsp:include>
</head>
<body>
	<!--400页面-->
	<div class="boxt5">
		<i class="dib fl icon6"></i>
		<div class="fl boxlcont">
			<h4 class="font28 color-6">很抱歉，莫有办法找到这个页面</h4>
			<p class="color-9">
				<span id="jumpTime5">5</span>秒后为您跳转到百度首页，或者您尝试以下操作
			</p>
		</div>
	</div>
</body>
<script type="text/javascript">
	//500页面
	function CountDown(iSeconds, sUrl, id) {
		this.iSeconds = iSeconds;
		this.sUrl = sUrl
		this.oJumpTo = document.getElementById(id);
		this.oTimer = null;
		this.setCountDown();
	}
	CountDown.prototype.setCountDown = function() {
		var This = this;
		this.oTimer = setInterval(function() {
			This.iSeconds--;
			if (This.iSeconds != 0) {
				This.oJumpTo.innerHTML = This.iSeconds;
			}
			if (This.iSeconds == 0) {
				window.location.href = This.sUrl;
				clearInterval(This.oTimer);
			}
		}, 1000);
	}
	var oCountDown = new CountDown(5, 'https://www.baidu.com/', 'jumpTime5');//500页面跳转
</script>
</html>