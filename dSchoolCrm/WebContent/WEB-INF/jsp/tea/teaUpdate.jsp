<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>角色管理-修改信息</title>
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
		<form action="" method="post" />
		<input type="hidden" id="ids" value="${tea.teaId}" name="teaId" />
		<div class="layui-form-item">
			<label for="L_email" class="layui-form-label"> <span
				class="x-red">*</span>姓名
			</label>
			<div class="layui-input-inline">
				<input type="text" name="teaName" required id="name"
					lay-verify="required" value="${tea.teaName}" autocomplete="off"
					class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label for="name" class="layui-form-label"> <span
				class="x-red">*</span>性别
			</label>

			<div class="layui-input-inline">
				<div class="layui-form-item">
					男 <input type="radio" name="teaSex" required id="sex"
						lay-verify="required" value="男" autocomplete="off"
						${tea.teaSex=="男"?'checked':''}> 女 <input type="radio"
						id="sex" name="teaSex" required lay-verify="required" value="女"
						autocomplete="off" ${tea.teaSex=="女"?'checked':''}>
				</div>
			</div>


			<div class="layui-form-item">
				<label for="name" class="layui-form-label"> <span
					class="x-red">*</span>电话
				</label>
				<div class="layui-input-inline">
					<input type="text" id="phone" name="teaPhone" required
						lay-verify="required" value="${tea.teaPhone}" autocomplete="off"
						class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>教学科目
				</label>
				<div class="layui-input-inline">

					<select name="teaClass" class="layui-select" id="km">
						<option value="2" ${tea.teaClass==2?'selected':''}>2</option>
						<option value="3" ${tea.teaClass==3?'selected':''}>3</option>
					</select>
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>校区
				</label>
				<div class="layui-input-inline">

					<select name="teaClass" class="layui-select" id="school">
						<c:forEach items="${school}" var="school">
							<option value="${school.schoolId}"
								${school.schoolId==tea.schoolId?'selected':''}>${school.schoolName}</option>
						</c:forEach>
					</select>
				</div>
			</div>

			<div class="layui-form-item layui-form-text">
				<label for="desc" class="layui-form-label"> 驾龄</label>
				<div class="layui-input-block">
					<input type="text" name="teaYear" required id="year"
						lay-verify="required" value="${tea.teaYear}" autocomplete="off"
						style="width: 60px" class="layui-input" placeholder="数字">
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
					var ids = document.getElementById("ids").value;
					console.log(ids);
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
						url : "../tea/edit.action",
						type : "post",
						data : {
							'teaId' : ids,
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
			var _hmt = _hmt || [];
			(function() {
				var hm = document.createElement("script");
				var s = document.getElementsByTagName("script")[0];
				s.parentNode.insertBefore(hm, s);
			})();
		</script>
</body>

</html>