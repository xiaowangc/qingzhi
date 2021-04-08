$(function(){
	  var u = $.cookie('user');
	if(u==''||typeof u == 'undefined'){
		 window.location.href="login.html";
		 
	}else{
		$.ajax({
			type:"post",
			url:"luyong",
			data:{
				'user':u
			},
			dataType:"json",
			success:function(da){
				var div = '';
				div += '<tr>'
						+'<th>活动名称</th>'
						+'<th>活动时间</th>'
						+'<th>活动地点</th>'
						+'<th>活动内容</th>'
						+'<th>状态</th>'
						+'</tr>'
				for(var i=0;i<da.length;i++){
					div += '<tr>'
							+'<th>'+da[i].art.artName+'</th>'
							+'<td>'+da[i].art.artTime+'</td>'
							+'<td>'+da[i].art.artSite+'</td>'
							+'<td>'+da[i].art.artLeirong+'</td>'
							+'<td>'+da[i].state+'</td>'
							
				}
				$('#dntab').html(div);
			},
			error:function(){
				alert("falth")
			}

		})
	}
	
})