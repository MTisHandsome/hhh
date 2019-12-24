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
		<form class="" action="">
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label"> <span
					class="x-red">*</span>姓名
				</label>
				<div class="layui-input-inline">
					<input type="text" id="name" name="teaName" class="layui-input">
				</div>
				<div class="layui-form-mid layui-word-aux">
					<span class="x-red">*</span>必填
				</div>
			</div>


			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>性别
				</label>
				<div class="layui-input-inline">
					男<input type="radio" id="sex" name="teaSex" value="男"> 女<input
						type="radio" id="sex" name="teaSex" value="女">
					<!--  <input type="text" id="username" name="userSex" class="layui-input">	-->
				</div>
			</div>


			<div class="layui-form-item">
				<label for="L_pass" class="layui-form-label"> <span
					class="x-red">*</span>电话
				</label>
				<div class="layui-input-inline">
					<input type="text" id="phone" name="teaPhone" required
						lay-verify="pass" autocomplete="off" class="layui-input">
				</div>
			</div>



			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>教学科目
				</label>
				<div class="layui-input-inline">
					<!-- <input type="text" id="L_username" name="userSchedule"
						class="layui-input">-->
					<select name="teaClass" class="layui-select" id="km">
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</div>
			</div>

			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>校区
				</label>
				<div class="layui-input-inline">
					<!-- <input type="text" id="L_username" name="userSchedule"
						class="layui-input">-->
					<select name="" class="layui-select" id="school">
						<c:forEach items="${school}" var="school">
							<option value="${school.schoolId}">${school.schoolName}</option>
						</c:forEach>
					</select>
				</div>
			</div>

			<div class="layui-form-item">
				<label for="L_pass" class="layui-form-label"> <span
					class="x-red">*</span>驾龄
				</label>
				<div class="layui-input-inline">
					<input type="text" id="year" name="teaYear" required
						lay-verify="pass" autocomplete="off" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				
				<button class="layui-btn" lay-submit="" type="submit"
					lay-filter="save">保存</button>
				<button class="layui-btn" lay-submit="" lay-filter="cancel">取消</button>
			</div>
		</form>
	</div>
	<script src="../lib/layui/layui.js" charset="utf-8">
		
	</script>
	<script src="../js/x-layui.js" charset="utf-8">
		
	</script>
	<script>
		layui.use([ 'form', 'layer' ], function() {
			$ = layui.jquery;
			var form = layui.form(), layer = layui.layer;

			//监听提交
			form.on('submit(save)', function(data) {
				var name = document.getElementById("name").value;
				console.log(name);
				var sex = document.getElementById("sex").value;
				console.log(sex);
				var phone = document.getElementById("phone").value;
				console.log(phone);
				var km = document.getElementById("km").value;
				console.log(km);
				var school = document.getElementById("school").value;
				console.log(school);
				var year = document.getElementById("year").value;
				console.log(year);
				
				$.ajax({
					url : "../tea/add.action",
					type : "post",
					data : {
						'teaName' : name,
						'teaSex' : sex,
						'teaPhone' : phone,
						'teaClass' : km,
						'teaYear' : year,
						'schoolId' : school
					},
					dataType : "TEXT",
					success : function(data) {
					}
				});
				//发异步，把数据提交给url 
				layer.alert("保存成功", {
					icon : 6
				}, function() {

					// 获得frame索引
					var index = parent.layer.getFrameIndex(window.name);
					//关闭当前frame
					parent.layer.close(index);
				});
				return false;
			});
		});
	</script>

	<script>
		function pas() {
			var userName = document.getElementById("userName").value;
			var emal = document.getElementById("emal").value;
			var phone = document.getElementById('phone').value;

			if (userName != null && userName != "") {
				if (!(/^1[3456789]\d{9}$/.test(phone))) {
					alert("手机号码有误，请重填");
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