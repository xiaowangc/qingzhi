$(function(){
	$.ajax({
		type:"post",
		url:"duiwei",
		dataType:"json",
		success:function(da){
			var div = '';
			div += '<tr>'
					+'<th>活动名称</th>'
					+'<th>活动时间</th>'
					+'<th>活动地点</th>'
					+'<th>活动内容</th>'
					+'<th>需要人数</th>'
					+'<th>报名人数</th>'
					+'<th>状态</th>'
					+'<th>操作</th>'
					+'</tr>'
			for(var i=0;i<da.length;i++){
				div += '<tr>'
						+'<th>'+da[i].artName+'</th>'
						+'<td>'+da[i].artTime+'</td>'
						+'<td>'+da[i].artSite+'</td>'
						+'<td>'+da[i].artLeirong+'</td>'
						+'<td>'+da[i].artXqrs+'</td>'
						+'<td>'+da[i].artYyrs+'</td>'
						+'<td>'+da[i].artState+'</td>'
						
						if(da[i].artState=='正在招募'){
							div +='<td><input type="button" value="报名" onclick="bm('+da[i].id+')"/></td>'
									+'</tr>'	
						}else{
							div +='<td>不可报名</td>'
							+'</tr>'
						}
						
			}
			$('#dwtab').html(div);
		},
		error:function(){
			alert("falth")
		}

	})

	
})