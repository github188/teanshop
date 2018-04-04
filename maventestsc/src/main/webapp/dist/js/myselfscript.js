$(function() {
	$('[data-toggle="popover"]').popover();
	initHtml();

});

/**
 * 取得uid,放入数据，加载bootstrap-table
 */
function initHtml() {
	//用户登录的uid
	var uid = 0;
	$.post("MyselfServlet?type=2", function(data) {
		uid = data[0];
		uids = data[1];
		var a = 0;
		var checkself = false;
		userIfo_lock();
		set_Province();
		setQuestion();

		if(uid == 0) {
			$("#own_sel>#uid").val(uid);
			setForm_uid(uids);
			loadData(uids, checkself);
			loadHome(uids, a);
			notLog();
		} else {
			checkself = true;
			a = 1;
			loadHead(uid);
			if(uid == uids) {
				setForm_uid(uid);
				loadData(uid, checkself);
				logged();
				loadHome(uid, a);
				loadCollect(uid, a);
				loadAttention(uid, a);
			} else {
				setForm_uid(uids);
				loadData(uids, checkself);
				loadHome(uids, a);
				logged_other();
			}
		}
	}, "json");
}

function setForm_uid(uid) {
	$("#user_form>#uid").val(uid);
	$("#userInfo_form>#uid").val(uid);
}

function loadCollect(uid, a) {
	var myself = $("#own_sel>#uid").val();
	$("#collects_tab").bootstrapTable({
		columns: [

			{
				field: "collect_id",
				title: "ID",
				align: "center"
			}, {
				field: "fid",
				title: "ID",
				align: "center"
			}, {
				field: "fname",
				title: "话题",
				align: "left",
				width: "40%",
				formatter: function(val, rowdata) {
					return "<a href='CommenServlet?fid=" + rowdata.fid + "&uid=" + myself + "&a=" + a + "&b=1&ssl=1'>" + rowdata.fname + "</a>";

				}
			}, {
				field: "cname",
				title: "版块",
				align: "center",
				width: "15%"
			}, {
				field: "unich",
				title: "作者",
				align: "center",
				width: "10%"
			}, {
				field: "answer",
				title: "回帖",
				align: "center",
				width: "5%"
			}, {
				field: "control",
				title: "操作",
				align: "center",
				width: "10%",
				formatter: function(val, rowdata) {
					return "<button onclick='deleteCollect(" + rowdata.collect_id + ")' class='btn btn-primary'><span class='glyphicon glyphicon-trash'></span>  取消收藏</button>";
				}
			}
		],
		method: 'post',
		url: "CollectServlet?type=1&uid=" + uid,
		cache: true,
		dataType: 'json',
		pagination: true,
		onlyInfoPagination: false,
		paginationLoop: true,
		sidePagination: 'client', // client or server
		pageNumber: 1,
		pageSize: 10,
		pageList: [10, 25, 50, 100],
		showHeader: true,
		showPaginationSwitch: true,
		showRefresh: true,
		showToggle: true
	});
	$("#collects_tab").bootstrapTable('hideColumn', "collect_id");
	$("#collects_tab").bootstrapTable('hideColumn', "fid");
}

function loadHome(uid, a) {
	var myself = $("#own_sel>#uid").val();
	$("#home_tab").bootstrapTable({
		columns: [{
			field: "fid",
			title: "ID",
			align: "center"
		}, {
			field: "fname",
			title: "话题",
			align: "left",
			width: "40%",
			formatter: function(val, rowdata) {
				return "<a href='CommenServlet?fid=" + rowdata.fid + "&uid=" + myself + "&a=" + a + "&b=1&ssl=1'>" + rowdata.fname + "</a>";
				//CommenServlet?fid="+rowdata.fid+"&uid="+uid+"+&a="+a+"&b=0
			}
		}, {
			field: "cname",
			title: "版块",
			align: "center",
			width: "15%"
		}, {
			field: "unich",
			title: "作者",
			align: "center",
			width: "10%"
		}, {
			field: "answer",
			title: "回帖",
			align: "center",
			width: "5%"
		}, {
			field: "control",
			title: "操作",
			align: "center",
			width: "10%",
			formatter: function(val, rowdata) {
				return "<button onclick='deletePost(" + rowdata.fid + ")' class='btn btn-primary btn_del_post'><span class='glyphicon glyphicon-trash'></span>  删除</button>";
			}
		}],
		method: 'post',
		url: "MyPostFicationServlet?type=1&uid=" + uid,
		cache: true,
		dataType: 'json',
		pagination: true,
		onlyInfoPagination: false,
		paginationLoop: true,
		sidePagination: 'client', // client or server
		pageNumber: 1,
		pageSize: 10,
		pageList: [10, 25, 50, 100],
		showHeader: true,
		showPaginationSwitch: true,
		showRefresh: true,
		showToggle: true
	});

	$("#home_tab").bootstrapTable('hideColumn', "fid");
}

function loadAttention(uid) {
	var myself = $("#own_sel>#uid").val();
	$("#attention_tab").bootstrapTable({
		columns: [

			{
				field: "ssid",
				title: "ssid",
				align: "center"
			},
			{
				field: "uid",
				title: "uid",
				align: "center"
			}, {
				field: "unich",
				title: "关注的人",
				align: "center",
				formatter: function(val, rowdata) {
					return "<a href='MyselfServlet?type=1&uid=" + myself + "&uids=" + rowdata.uid + "'>"+ rowdata.unich + "</a>";
				}
			}, {
				field: "control",
				title: "操作",
				align: "center",
				width: "10%",
				formatter: function(val, rowdata) {
					return "<button onclick='deleteAttention(" + rowdata.ssid + ")' class='btn btn-primary'><span class='glyphicon glyphicon-trash'></span>  取消关注</button>";
				}
			}
		],
		method: 'post',
		url: "CollectServlet?type=3&uid=" + uid,
		cache: true,
		dataType: 'json',
		pagination: true,
		onlyInfoPagination: false,
		paginationLoop: true,
		sidePagination: 'client', // client or server
		pageNumber: 1,
		pageSize: 10,
		pageList: [10, 25, 50, 100],
		showHeader: true,
		showPaginationSwitch: true,
		showRefresh: true,
		showToggle: true,
	});
	$("#attention_tab").bootstrapTable('hideColumn', "uid");
	$("#attention_tab").bootstrapTable('hideColumn', "ssid");

}

/**
 * 给form_info放入数据
 */
function loadData(uid, checkself) {
	$.post("UserControlServlet?state=4", {
			uid: uid
		},
		function(userData) {
			//	uname VARCHAR(10) not NULL,  -- 用户
			//	unich VARCHAR(30) not null,  -- 昵称
			//	upwd VARCHAR(20) not NULL,  -- 密码
			//	sex VARCHAR(2) not NULL,  -- 性别
			//	ubirth VARCHAR(20) not null, -- 出生日期
			//	uqianm VARCHAR(30),      -- 个性签名
			//	uphone VARCHAR(20) not NULL,   -- 电话
			//	imges VARCHAR(20) not NULL,  -- 图片
			//	tid int not NULL,   -- 类型     -- type 表格
			//	wid INT not NULL,  -- 问题      -- wenti 表格
			//	dname VARCHAR(20) not NULL,  -- 答案
			//	jifen int,  -- 积分
			//	province_id int , -- 省份id
			//	city_id int  -- 县市id-->
			//	显示下拉框且塞入数据
			if(checkself) {
				$("#province_id").get(0).selectedIndex = userData.province_id;
				changeProvince();
				$("#unich").val(userData.unich);
				$("#ubirth").val(userData.ubirth);
				$("#uqianm").val(userData.uqianm);
				document.getElementById("face").src = userData.imges;
				$("#imges").val(userData.imges);
				if(userData.sex == "男") {
					document.getElementById("sex1").checked = true;
				} else {
					document.getElementById("sex2").checked = true;
				}
				$("#city_id").get(0).selectedIndex = userData.city_id;
				$("#uname").val(userData.uname);
				$("#wid").get(0).selectedIndex = userData.wid;

			} else {
				$("#province_id").get(0).selectedIndex = userData.province_id;
				changeProvince();
				$("#unich").val(userData.unich);
				$("#ubirth").val(userData.ubirth);
				$("#uqianm").val(userData.uqianm);
				document.getElementById("face").src = userData.imges;
				$("#imges").val(userData.imges);
				if(userData.sex == "男") {
					document.getElementById("sex1").checked = true;
				} else {
					document.getElementById("sex2").checked = true;
				}
				$("#city_id").get(0).selectedIndex = userData.city_id;
			}

		}, "json");
}

/**
 * 加载个人下拉框
 * @param {Object} uid
 */
function loadHead(uid) {
	$("#own_sel>#uid").val(uid);
	$.post("UserControlServlet?state=4", {
			uid: uid
		},
		function(userData) {
			document.getElementById("head_sel").src = userData.imges;
			$("#head_unich").text(userData.unich);
		}, "json");
}

/**
 * 去个人资料
 */
function tomyself() {
	var uid = $("#own_sel>#uid").val();
	location.href = "MyselfServlet?type=1&uid=" + uid + "&uids=" + uid;
}

/**
 * 锁上userInfo
 */
function userIfo_lock() {
	$("#unich").attr("disabled", "disabled");
	$("#ubirth").attr("disabled", "disabled");
	$("#uqianm").attr("disabled", "disabled");
	$("#sex1").attr("disabled", "disabled");
	$("#sex2").attr("disabled", "disabled");
	$("#province_id").attr("disabled", "disabled");
	$("#city_id").attr("disabled", "disabled");
	$("#face").attr("disabled", "disabled");
}

/**
 * 未上锁
 */
function userIfo_unlock() {
	$("#unich").removeAttr("disabled");
	$("#ubirth").removeAttr("disabled");
	$("#uqianm").removeAttr("disabled");
	$("#sex1").removeAttr("disabled");
	$("#sex2").removeAttr("disabled");
	$("#province_id").removeAttr("disabled");
	$("#city_id").removeAttr("disabled");
	$("#face").removeAttr("disabled");
}

/**
 * 未登录的状态
 */
function notLog() {
	$("#settings_li").css({
		"visibility": "hidden"
	});
	$("#collect_li").css({
		"visibility": "hidden"
	});

	$("#presentation_li").css({
		"visibility": "hidden"
	});

	$("#home_tab").bootstrapTable('hideColumn', "control");
	$("#own_sel").css({
		"display": "none"
	});

	$("#log_and_reg").css({
		"display": "block"
	});

}

/**
 * 已登录
 */
function logged() {
	$("#settings_li").css({
		"visibility": "visible"
	});
	$("#collect_li").css({
		"visibility": "visible"
	});

	$(".btn_del_post").css({
		"visibility": "visible"
	});

	$("#face_a").css({
		"visibility": "visible"
	});
	$("#update_userinfo_btn").css({
		"visibility": "visible"
	});

	$("#presentation_li").css({
		"visibility": "visible"
	});

}

function logged_other() {
	$("#settings_li").css({
		"visibility": "hidden"
	});
	$("#collect_li").css({
		"visibility": "hidden"
	});
	$("#presentation_li").css({
		"visibility": "hidden"
	});

	$("#home_tab").bootstrapTable('hideColumn', "control");

}

/**
 * 编辑资料
 */
function userInfo_update() {
	userIfo_unlock();
	$("#update_userinfo_btn").css({
		"visibility": "hidden"
	});
	$("#reset_userinfo_btn").css({
		"visibility": "visible"
	});
	$("#save_userinfo_btn").css({
		"visibility": "visible"
	});
}

/*加载省份信息*/
function set_Province() {
	$.post("ProvinceServlet", function(data) {
		for(var i = 0; i < data.length; i++) {
			$("#province_id").append("<option value='" + data[i].province_id + "'>" + data[i].province_name + "</option>");
		}
	}, "json");
}

/**
 * 加载所有问题
 */
function setQuestion() {
	$.post("QuestionServlet", function(data) {
		for(var i = 0; i < data.length; i++) {
			$("#wid").append("<option value='" + data[i].wid + "'>" + data[i].wname + "</option>");
		}
	}, "json");
}

/**
 * 刷新当前页面
 */
function refresh() {
	window.location.reload();
}

/*加载城市信息*/
function changeProvince() {

	var province_id = $("#province_id").val();
	$("#city_id").empty();

	$.post("CityServlet?province_id=" + province_id, function(data) {
		for(var i = 0; i < data.length; i++) {
			$("#city_id").append("<option value='" + data[i].city_id + "' class='cities'>" + data[i].city_name + "</option>");
		}
	}, "json");

}

/* 检查昵称 */
function check_unich() {
	var checkin = false;
	var unich = $("#unich").val();
	if(unich == null || unich.trim().length == 0) {
		$("#unich_span").text("✘ 昵称不能为空");
		$("#unich_span").css({
			"color": "red"
		});
	} else {
		$("#unich_span").text("");
		checkin = true;
	}
	return checkin;
}

/*检查原密码*/
function check_order_upwd() {
	var checkin = false;
	var unich = $("#order_upwd").val();
	if(unich == null || unich.trim().length == 0) {
		$("#order_upwd_span").text("✘ 原密码不能为空");
		$("#order_upwd_span").css({
			"color": "red"
		});
	} else {
		$("#order_upwd_span").text("");
		checkin = true;
	}
	return checkin;
}

/* 检查新密码1*/
function check_upwd() {
	var checkin = false;
	var reg = /^[a-z0-9_-]{6,18}$/;
	var upwd = $("#upwd").val();
	if(upwd == null || upwd.trim().length == 0) {
		$("#upwd_span").text("✘ 新密码不能为空");
		$("#upwd_span").css({
			"color": "red"
		});
	} else {
		if(reg.test(upwd)) {
			$("#upwd_span").text("");
			checkin = true;
		} else {
			$("#upwd_span").text("✘ 新密码必须6-18位的字母，数字");
			$("#upwd_span").css({
				"color": "red"
			});
		}
	}
	return checkin;
}

/**检查重复输入密码2*/
function check_upwd2() {
	var checkin = false;
	var upwd = $("#upwd").val();
	var upwd2 = $("#upwd2").val();
	if(upwd == upwd2) {
		$("#upwd2_span").text("");
		checkin = true;
	} else {
		$("#upwd2_span").text("✘ 两次密码输入不一致");
		$("#upwd2_span").css({
			"color": "red"
		});
	}

	return checkin;
}

/**检查密保答案*/
function check_dname() {
	var dname = $("#dname").val();
	if(dname == null || dname.trim().length == 0) {
		$("#dname_span").text("✘ 密保答案不能为空");
		$("#dname_span").css({
			"color": "red"
		});
	} else {
		$("#dname_span").text("");
		checkin = true;
	}
}

/* 更改用户信息*/
function userInfo_change() {
	$("#imges").val($("#face").attr("src"));
	if(check_unich()) {
		var userInfo_form = $("#userInfo_form").serialize();
		userIfo_lock();
		$("#update_userinfo_btn").css({
			"visibility": "visible"
		});
		$("#reset_userinfo_btn").css({
			"visibility": "hidden"
		});
		$("#save_userinfo_btn").css({
			"visibility": "hidden"
		});
		$.ajax({
			type: "post",
			dataType: "json",
			url: "UserInfoServlet?state=3",
			data: userInfo_form,
			async: true,
			success: function(data) {
				if(date == 1) {
					alert("保存成功！");
					$("#upwd").val("");
					$("#order_upwd").val("");
					$("#upwd2").val("");
					$("#dname").val("");
				} else {
					alert("修改失败！");
				}
			}
		});

	}

}

/**修改密码方法*/
function upwd_change() {
	var checkin = false;
	if(check_order_upwd() && check_unich() && check_upwd2()) {
		checkin = true;
	}
	if(checkin) {

		var user_form = $("#user_form").serialize();
		$.ajax({
			type: "post",
			dataType: "json",
			url: "UserControlServlet?state=3",
			data: user_form,
			async: true,
			success: function(data) {
				if(data == 1) {
					alert("密码修改成功！");
				} else if(data == 2) {
					alert("原密码错误！");
				} else if(data == 3) {
					alert("密保错误！");
				} else {
					alert("修改失败！");
				}
			}
		});

	} else {
		alert("请检查信息");
	}

}
/**更换头像方法*/
function change_face() {
	var child = open("Face.html", "", "width=100px;height=100px");
}

/**取消收藏* @param {Object} fid*/
function deleteCollect(collect_id) {
	$.post(
		"CollectServlet?type=2", {
			collect_id: collect_id
		},
		function(data) {
			$("#collects_tab").bootstrapTable("refresh");
		}
	);
}

/** 删除帖子 * @param {Object} fid*/
function deletePost(fid) {
	$.post(
		"MyPostFicationServlet?type=2", {
			fid: fid
		},
		function(data) {
			$("#home_tab").bootstrapTable("refresh");
		}
	);
}

/**
 * 取关
 * @param {Object} ssid
 */
function deleteAttention(ssid) {
	$.post(
		"CollectServlet?type=4", {
			ssid: ssid
		},
		function(data) {
			$("#attention_tab").bootstrapTable("refresh");
		}
	);

}

//function adds() {
//
//	var cid = $("#sele6").val()
//	var fbol = $("#fbold").val()
//	var fname = $("#fnames").val()
//	var shij = getdatas1();
//
//	$.ajax({
//		type: "post",
//		url: "HomepageServlet",
//		async: true,
//		dataTyepe: "json",
//		data: {
//			"index": 22,
//			"cid": cid,
//			"fbol": fbol,
//			"fname": fname,
//			"uid": uids,
//			"shij": shij
//		},
//		success: function(data) {
//
//			if(data == 1) {
//				alert("发帖成功")
//				$("#myModal3").modal("hide");
//
//			}
//		}
//	});
//}


function backHome(){
	var uid = $("#own_sel>#uid").val();
	location.href="HomepageServlet?index=15&uid="+uid; 
}
