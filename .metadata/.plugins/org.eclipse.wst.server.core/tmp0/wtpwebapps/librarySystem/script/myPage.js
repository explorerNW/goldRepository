/**
 * 用户主页脚本
 * 作者：聂旺
 * 时间：2016/12/28
 */

    $(function(){    	 
    	     $("div.myinf a.dy").click(function(){    	    	           
    	    	      $(this).next("form").find("table").css({
    	    	    	    "opacity":"1",
    	    	    	    "visibility":"visible"
    	    	      });
    	     });
    	     $("input.subs").hover(function(){
    	    	        $(this).attr("type","submit"); 
    	    	        $("input.mysubs").attr("type","button");
    	     });
    	     $("input.mysubs").hover(function(){
    	    	    $("input.subs").attr("type","button"); 
	    	        $(this).attr("type","submit"); 
	         });
    });