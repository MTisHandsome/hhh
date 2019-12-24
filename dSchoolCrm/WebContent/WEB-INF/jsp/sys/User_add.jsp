<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<form class="" action="../user/add.action">
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label"> <span
					class="x-red">*</span>姓名
				</label>
				<div class="layui-input-inline">
					<input type="text" id="userName" name="userName"
						class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red">*</span>必填
				</div>
			</div>

			<div class="layui-form-item">
				<label for="L_pass" class="layui-form-label"> <span
					class="x-red">*</span>账号
				</label>
				<div class="layui-input-inline">
					<input type="text" id="emal" name="userEmal" required
						lay-verify="pass" autocomplete="off" class="layui-input">
				</div>

			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> <span
					class="x-red">*</span>密码
				</label>
				<div class="layui-input-inline">
					<input type="password" id="pass" name="userPassword" required
						lay-verify="pass" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> <span
					class="x-red">*</span>确认密码
				</label>
				<div class="layui-input-inline">
					<input type="password" id="repass" name="repass" required
						lay-verify="repass" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>性别
				</label>
				<div class="layui-input-inline">
					男<input type="radio" id="sex" name="userSex" value="男"> 女<input
						type="radio" id="sex" name="userSex" value="女">
					<!--  <input type="text" id="username" name="userSex" class="layui-input">	-->
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>入校时间
				</label>
				<div class="layui-input-inline">
					<!--  <input type="text" id="L_username" name="userDate"
						class="layui-input">-->
					<input type="text" id="EntTime"  name="userDate"
						onclick="return showCalendar('EntTime', 'y-mm-dd');" />
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>考试进度
				</label>
				<div class="layui-input-inline">
					<!-- <input type="text" id="L_username" name="userSchedule"
						class="layui-input">-->
					<select name="userSchedule">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
					</select>
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label> <input
					class="layui-btn" lay-filter="add" type="submit" value="添加"
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
			
			if(userName!=null&&userName!=""){
				if(emal!=null&&emal!=""){
					if(pass!=repass){
						alert("密码不一致");
						return false;
					}else{
						return true;
					}
				}else{
					alert("账号不能为空");
					return false;
				}
			}else{
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