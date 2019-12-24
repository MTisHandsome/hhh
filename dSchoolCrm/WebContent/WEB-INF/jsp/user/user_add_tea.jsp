<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link type="text/css" rel="stylesheet" href="../js/calendar.css">
<script type="text/javascript" src="../js/calendar.js"></script>
<script type="text/javascript" src="../js/calendar-zh.js"></script>
<script type="text/javascript" src="../js/calendar-setup.js"></script>
<head>
<meta charset="utf-8">
<title>用户管理-添加</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="../css/x-admin.css" media="all">


</head>

<body>
	<div class="x-body">
		<form class="" action="../two/addteas.action">
			<input type="hidden" value="${user.userId}" name="userId">
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label"> <span
					class="x-red">*</span>姓名
				</label>
				<div class="layui-input-inline">
					<input type="hidden" value="${user.userName}" name="userName">
					<label for="L_username" class="layui-form-label"> ${user.userName}
				</label>
				</div>
				
			</div>

			<input type="hidden" value="${user.userEmal}" name="userEmal">
			<input type="hidden" value="${user.userPassword}" name="userPassword">
			<input type="hidden" value="${user.userSex}" name="userSex">
			<input type="hidden" value="${user.userDate}" name="userDate">
			<input type="hidden" value="${user.userSchedule}" name="userSchedule">
			<input type="hidden" value="${user.schoolId}" name="schoolId">
			
			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>选择教练
				</label>
				<div class="layui-input-inline">
					<!-- <input type="text" id="L_username" name="userSchedule"
						class="layui-input">-->
					<select name="teaUserid" class="layui-select" style="width: 130px">
						<c:forEach items="${tea}" var="tea">
							<option value="${tea.teaId}">${tea.teaName}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			

			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>选择车辆
				</label>
				<div class="layui-input-inline">
					<!-- <input type="text" id="L_username" name="userSchedule"
						class="layui-input">-->
					<select name="carId" class="layui-select" style="width: 130px">
						<c:forEach items="${car}" var="car">
							<option value="${car.carId}">${car.carCard}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label> <input
					class="layui-btn" lay-filter="add" type="submit" value="保存"
					onclick="return pas()">
			</div>
		</form>
	</div>
	<script src="./lib/layui/layui.js" charset="utf-8">
		
	</script>
	<script src="./js/x-layui.js" charset="utf-8">
		
	</script>

	<script>
		function pas() {
			var userName = document.getElementById("userName").value;
			var emal = document.getElementById("emal").value;
			var pass = document.getElementById("pass").value;
			var repass = document.getElementById("repass").value;
			var sex = document.getElementById("sex").value;
			var time = document.getElementById("time").value;

			if (userName != null && userName != "") {
				if (emal != null && emal != "") {
					if (pass != repass) {
						alert("密码不一致");
						return false;
					} else {
						return true;
					}
				} else {
					alert("账号不能为空");
					return false;
				}
			} else {
				alert("姓名不能为空");
				return false;

			}

		}
	</script>

	<script>
		var _hmt = _hmt || [];
		(function() {
			var hm = document.createElement("script");
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(hm, s);
		})();
	</script>
</body>

</html>