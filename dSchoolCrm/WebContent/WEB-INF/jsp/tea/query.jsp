<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>角色管理</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="../css/x-admin.css" media="all">
<script type="text/javascript">
	$(function() {
		//全选
		var oall = document.getElementById("all");
		var oid = document.getElementsByName("id");
		oall.onclick = function() {
			for (var i = 0; i < oid.length; i++) {
				//所有的选择框和全选一致
				oid[i].checked = oall.checked;
			}
		};
		//点击复选框
		for (var i = 0; i < oid.length; i++) {
			oid[i].onclick = function() {
				//判断是否全部选中,遍历集合
				for (var j = 0; j < oid.length; j++) {
					if (oid[j].checked == false) {
						oall.checked = false;
						break;
					} else {
						oall.checked = true;
					}
				}
			};
		}
		//点击删除
		$("#del").click(function() {
			var ids = "";
			var n = 0;
			for (var i = 0; i < oid.length; i++) {
				if (oid[i].checked == true) {//选中为true
					var id = oid[i].value;
					if (n == 0) {
						ids += "ids=" + id;
					} else {
						ids += "&ids=" + id;
					}
					n++;
				}
			}
			//上面会拼接出一个名为ids的数组ids=1&ids=2&ids=3&ids=4……
			$.get("delall.action", ids, function(data) {
				if (data == "ok") {
					alert("删除成功!");
					location.href = "allTea.action"
				} else {
					alert("删除失败!请选择要删除的内容");
				}
			});
		});
	})
</script>
</head>
<body>
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a><cite>首页</cite></a> <a><cite>角色管理</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="layui-icon" style="line-height: 30px">ဂ</i></a>
	</div>
	<div class="x-body">
		<c:forEach items="${list}" var="tea">
			<div class="layui-input-inline">

				</label> <label for="L_email" class="layui-form-label"> <span
					class="x-red"></span>教练ID
				</label> <label for="L_username" class="layui-form-label">
					${tea.teaId}</label> </label> <label for="L_email" class="layui-form-label">
					<span class="x-red"></span>教练姓名
				</label> <label for="L_username" class="layui-form-label">
					${tea.teaName}</label>




				<!--  
		<button class="layui-btn layui-btn-danger">
			<i class="layui-icon"><img src="images/daoru.png" width="15"
				height="15"></img></i>导入
		</button>-->
				

					<span class="x-right" style="line-height: 25px">共有xx名学员</span>
				
				</xblock>
				<table class="layui-table">
					<thead>
						<tr>
							<th width="8%"><input type="checkbox" name="" id="all"
								value=""></th>
							<th width="9%">学员ID</th>
							<th width="16%">学员姓名</th>

							<th width="11%">操作</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${tea.users}" var="user">
							<tr>
								<td><input type="checkbox" value="${user.userId}" name="id"></td>

								<td>${user.userId}</td>
								<td>${user.userName}</td>



								<td class="td-manage"><a title="删除"
									href="../tea/delTeaId.action?id=${user.userId}"
									 style="text-decoration: none">
										<i class="layui-icon">&#xe640;</i>
								</a></td>

							</tr>
						</c:forEach>

					</tbody>
				</table>


			</div>
		</c:forEach>
		<br /> <br /> <br />
		<script src="../lib/layui/layui.js" charset="utf-8"></script>
		<script src="../js/x-layui.js" charset="utf-8"></script>
		<script>
			layui.use([ 'laydate', 'element', 'laypage', 'layer' ], function() {
				$ = layui.jquery;//jquery
				laydate = layui.laydate;//日期插件
				lement = layui.element();//面包导航
				laypage = layui.laypage;//分页
				layer = layui.layer;//弹出层

				//以上模块根据需要引入
				laypage({
					cont : 'page',
					pages : 100,
					first : 1,
					last : 100,
					prev : '<em><</em>',
					next : '<em>></em>'
				});
			});

			//批量删除提交
			function delAll() {
				layer.confirm('确认要删除吗？', function(index) {
					//捉到所有被选中的，发异步进行删除
					layer.msg('删除成功', {
						icon : 1
					});
				});
			}
			/*添加*/
			function role_management_add(title, url, w, h) {
				x_admin_show(title, url, w, h);
			}

			//修改密码
			function role_management_permissions(title, url, id, w, h) {
				x_admin_show(title, url, w, h);
			}
			//查看
			function role_management_look(title, url, id, w, h) {
				x_admin_show(title, url, w, h);
			}
			//编辑
			function role_management_edit(title, url, id, w, h) {
				x_admin_show(title, url, w, h);
			}
			/*删除*/
			function role_del(obj, id) {
				layer.confirm('确认要删除吗？', function(index) {
					//发异步删除数据
					$(obj).parents("tr").remove();
					layer.msg('已删除!', {
						icon : 1,
						time : 1000
					});
				});
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