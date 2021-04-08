$(function(){
	$.ajax({
		type:"post",
		url:"getstinfo",
		dataType:"json",
		success:function(da){
			var div = '';
			for(var i=0;i<da.length;i++){
				div += '<li><a href="single.html?id='+da[i].id+'"><span>'+da[i].artName+'</span></a></li>'
			}
			$('#newhd').html(div);
		},
		error:function(){
			alert("falth")
		}

	})
	
	$.ajax({
		type:"post",
		url:"gettuiwen",
		dataType:"json",
		success:function(da){
			var div = '';
			for(var i=0;i<da.length;i++){
				div += '<li class="ui-tabs-nav-item" id="nav-fragment-1"><a href="'+da[i].twLianjie+'"><img src="'+da[i].twTupian+'" width="80px" height="50px" alt="" /><span>​'+da[i].twBiaoti+'</span></a></li>'
			}
			$('#jchg').html(div);
		},
		error:function(){
			alert("falth")
		}

	})
	
	$.ajax({
		type:"post",
		url:"suijituiwen",
		dataType:"json",
		success:function(da){
			var div = '';
			for(var i=0;i<da.length;i++){
				div += '<p><a href="'+da[i].twLianjie+'">'+da[i].twBiaoti+'</a></p>'
			}
			$('#ymtw').html(div);
		},
		error:function(){
			alert("falth")
		}

	})
	
	 var u = $.cookie('user');
	var lyxx='';
	if(u==''||typeof u == 'undefined'){
		lyxx='<p><a href="login.html">请先登录</a></p>'
			$('#grdt').html(lyxx);
	}else{
		$.ajax({
			type:"post",
			url:"luyong",
			data:{
				'user':u
			},
			dataType:"json",
			success:function(da){
				for(var i=0;i<4;i++){
					lyxx += '<p><a href="personal.html">'+da[i].art.artName+da[i].state+'</a></p>'
				}
				$('#grdt').html(lyxx);
			},
			error:function(){
				alert("falth")
			}

		})
	}

		
})