//向所有从者图标设置悬浮操作

  $(document).ready(function(){
	  /*动画*/
	  $("#server-information").toggleClass('magictime vanishIn');
		$(".img").addClass("magictime foolishIn");
  
  /*注册右键点击事件*/
   $(function(){
    $.contextMenu({
         autoHide:true,
        selector: '.server-image', 
        callback: function(key, options) {
            var m = "clicked: " + key;
            window.console && console.log(m) || alert(m); 
        },
        items: {
            "1": {name: "详细资料"},
            "2": {name: "播放语音"},
            
            "3": {name: "播放宝具"},
            "4": {name: "删除"},
          
        }
    });
    //左键点击事件
    //显示详细资料
    $('.server-image').on('click', function(e){
    	var ID=$(this).children()[0].id;
    	var id=ID.split("-")[1];
    	var list=[];
    	$.ajax({ url: path+"/Package/server.do",
    		data:"id="+id,
    		success: function(res){
            list=res.split("-");
            if(list.length<=1){
            	alert(res)
            }else{
            	  $("#server-information").css('display','block');
                  
                  $("#gender").attr("value",list[0]);
                   $("#type").attr("value",list[1]);
                    $("#start").attr("value",list[2]);
                     $("#LV1_ATK").attr("value",list[3]);
                      $("#LV1_HP").attr("value",list[4]);
                      $("#LVMAX4_ATK").attr("value",list[5]);
                      $("#LVMAX4_HP").attr("value",list[6]);
                      $("#maxATK").attr("value",list[7]);
                       $("#maxHP").attr("value",list[8]);
                        $("#Region").attr("value",list[9]);
                        $("#CV").attr("value",list[10]);
                         $("#ILLUST").attr("value",list[11]);
                          $("#tool").attr("value",list[12]);
                           $("#cutename").attr("value",list[13]);
            }
          }});
    	
     
    })
});
	


 
  //鼠标悬浮事件
  $(".server-image").on('mouseenter',function(){
  	
  	//添加悬浮窗
  	$(this).append("<div class='server-icon-hover-box'><label class='server-icon-hover-box-label'>"+$(this).children()[0].name+"</label></div>");
  		$(".server-icon-hover-box").css('background-color','black').css('position','absolute').css("border-radius",'15px').css("z-index",'15');
      $(".server-icon-hover-box-label").css("color",'white').css('margin','3px');
  })
  //鼠标离开事件
   $(".server-image").on('mouseleave',function(){
     $(".server-icon-hover-box").remove();
  })
  })

