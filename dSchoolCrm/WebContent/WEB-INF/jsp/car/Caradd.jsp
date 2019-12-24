<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>角色管理-添加</title>
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
		<form action="" method="post" class="layui-form layui-form-pane">
			<div class="layui-form-item">
				<label for="name" class="layui-form-label"> <span
					class="x-red">*</span>车牌号
				</label>
				<div class="layui-input-inline">
					<input type="text" id="id" name="name" required 
						lay-verify="required" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="name" class="layui-form-label"> <span
					class="x-red">*</span>车型
				</label>
				<div class="layui-input-inline">
					<input type="text" id="name" name="name" required
						lay-verify="required"  autocomplete="off" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label for="L_username" class="layui-form-label"> <span
					class="x-red">*</span>校区
				</label>
				<div class="layui-input-inline">
					<!-- <input type="text" id="L_username" name="userSchedule"
						class="layui-input">-->
					<select name="scoreSchedule" class="layui-select"
						style="width: 130px" id="sel">
						<c:forEach items="${school}" var="school">
							<option value="${school.schoolId}">${school.schoolName}</option>
						</c:forEach>
					</select>
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
				var id = document.getElementById("id").value;
				console.log(id);
				var name = document.getElementById("name").value;
				console.log(name);
				var sel = document.getElementById("sel").value;
				console.log(sel);
				$.ajax({
					url : "../car/add.action",
					type : "post",
					data : {
						'carCard' : id,
						'carShape' : name,
						'schoolId' : sel
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