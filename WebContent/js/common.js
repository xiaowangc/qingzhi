function bm(a){
	var u = $.cookie('user');
	if(u==''||typeof u == 'undefined'){
		 window.location.href="login.html";
		 
	}else{
		$.ajax({
			type:"post",
			url:"baominginfo",
			data:{
				'user':u,
				'artid':a
			},
			dataType:"json",
			success:function(da){
				alert("报名成功！")
			},
			error:function(){
				alert("falth")
			}

		})
	}
}
$(function(){
	  var u = $.cookie('user');
	  var dla = '';
	if(u==''||typeof u == 'undefined'){
		dla='<a href="login.html">登录</a>';
		$('#dla').html(dla);
	}else{
		dla='<a href="#" onclick="zx()">注销</a>';
		$('#dla').html(dla);
	}
	
})
function zx(){
	$.cookie('user','');
	 window.location.href="login.html";
}