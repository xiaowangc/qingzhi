$(function(){
	$("#form").submit(function(){
		var d=$('#form').serialize();
		$.ajax({
			type:"post",
			url:"denglu",
			data:$('#form').serialize(),
			dataType:"json",
			success:function(da){
				if(da=='100'){
					$.cookie('user',$("#qzName").val());
					alert('登录成功！');
					window.location.href="index.html"
				}else{
					alert('用户名或密码错误！')
				}
			},
			error:function(){
				alert("falth")
			}
		});
		return false; 
	
	})
})