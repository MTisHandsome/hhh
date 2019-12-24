<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户管理</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" href="../css/x-admin.css" media="all">
</head>
<script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
<script>
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
			$.get("del.action", ids, function(data) {
				if (data == "ok") {
					alert("删除成功!");
					location.href = "list.action"
				} else {
					alert("删除失败!请选择要删除的内容");
				}
			});
		});
	})
</script>
<body>
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a><cite>首页</cite></a> <a><cite>未分配教练及车辆的学员信息</cite></a>
		</span> <a class="layui-btn layui-btn-small"
			style="line-height: 1.6em; margin-top: 3px; float: right"
			href="javascript:location.replace(location.href);" title="刷新"><i
			class="layui-icon" style="line-height: 30px">ဂ</i></a>
	</div>
	<div class="x-body">
		<form class="layui-form x-center" action="" style="width: 500px">
			<div class="layui-form-pane" style="margin-top: 15px;">
				<div class="layui-form-item">
					<!--  
					<div class="layui-input-inline" style="width: 400px">
						<input type="text" name="username" placeholder="搜索内容"
							autocomplete="off" class="layui-input">
					</div>
					
					<div class="layui-input-inline" style="width: 80px">
						<button class="layui-btn" lay-submit="" lay-filter="sreach">
							<i class="layui-icon">&#xe615;</i>
						</button>
					</div>
				-->	
				</div>
			</div>
		</form>
		<xblock>
		<button class="layui-btn layui-btn-danger" id="del">
			<i class="layui-icon">&#xe640;</i>批量删除
		</button>
		<a href="../user/toAdd.action">
			<button class="layui-btn">
				<i class="layui-icon">&#xe608;</i>添加
			</button>
		</a> <span class="x-right" style="line-height: 25px">共有数据：88 条</span></xblock>
		<table class="layui-table" id="tableId">
			<thead>
				<tr>
					<th><input type="checkbox" id="all"></th>
					<th>ID</th>
					<th>姓名</th>
					<th>账号</th>
					<th>密码</th>

					<th>性别</th>
					<th>入校时间</th>
					<th>考试进度</th>
					<th>操作</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${list}" var="user">
					<tr>
						<td><input type="checkbox" value="${user.userId}" name="id"></td>
						<td>${user.userId}</td>
						<td>${user.userName}</td>
						<td>${user.userEmal}</td>
						<td>${user.userPassword}</td>
						<td>${user.userSex}</td>
						<td>${user.userDate}</td>
						<td>${user.userSchedule==1?"科目1":""}
							${user.userSchedule==2?"科目2":""} ${user.userSchedule==3?"科目3":""}
							${user.userSchedule==4?"科目4":""}</td>
						<td class="td-manage"><a title="编辑"
							href="../user/toEdit.action?id=${user.userId}" class="ml-5"
							style="text-decoration: none"> <i class="layui-icon">&#xe642;</i>
						</a> <a style="text-decoration: none"
							onclick="user_management_password('分配校区','10001','600','400')"
							href="to.action?id=${user.userId}" title="分配校区"> <i
								class="layui-icon">&#xe631;</i>
						</a> <a title="删除" href="../user/deleteUser.action?id=${user.userId}"
							style="text-decoration: none"> <i class="layui-icon">&#xe640;</i>
						</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<div id="page"></div>
	</div>
	<br />
	<br />
	<br />
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

			var start = {
				min : laydate.now(),
				max : '2099-06-16 23:59:59',
				istoday : false,
				choose : function(datas) {
					end.min = datas; //开始日选好后，重置结束日的最小日期
					end.start = datas //将结束日的初始值设定为开始日
				}
			};

			var end = {
				min : laydate.now(),
				max : '2099-06-16 23:59:59',
				istoday : false,
				choose : function(datas) {
					start.max = datas; //结束日选好后，重置开始日的最大日期
				}
			};

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
		/*用户-添加*/
		function user_management_add(title, url, w, h) {
			x_admin_show(title, url, w, h);
		}
		/*用户-查看*/
		function user_management_show(title, url, id, w, h) {
			x_admin_show(title, url, w, h);
		}

		/*用户-停用*/
		function member_stop(obj, id) {
			layer
					.confirm(
							'确认要停用吗？',
							function(index) {
								//发异步把用户状态进行更改
								$(obj)
										.parents("tr")
										.find(".td-manage")
										.prepend(
												'<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="layui-icon">&#xe62f;</i></a>');
								$(obj)
										.parents("tr")
										.find(".td-status")
										.html(
												'<span class="layui-btn layui-btn-disabled layui-btn-mini">已停用</span>');
								$(obj).remove();
								layer.msg('已停用!', {
									icon : 5,
									time : 1000
								});
							});
		}

		/*用户-启用*/
		function member_start(obj, id) {
			layer
					.confirm(
							'确认要启用吗？',
							function(index) {
								//发异步把用户状态进行更改
								$(obj)
										.parents("tr")
										.find(".td-manage")
										.prepend(
												'<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="layui-icon">&#xe601;</i></a>');
								$(obj)
										.parents("tr")
										.find(".td-status")
										.html(
												'<span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span>');
								$(obj).remove();
								layer.msg('已启用!', {
									icon : 6,
									time : 1000
								});
							});
		}
		// 用户-编辑
		function user_management_edit(title, url, id, w, h) {
			x_admin_show(title, url, w, h);
		}
		/*密码-修改*/
		function user_management_password(title, url, id, w, h) {
			x_admin_show(title, url, w, h);
		}
		/*用户-删除*/
		function member_del(obj, id) {
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