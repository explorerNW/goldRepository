/**
 * 
 */
var UIDconstraint = /^[\d]{8}$/;
function check(form){
	        with(form){
	        	    if(UID.value == ""){	        	    	
	        	    		 $(".center .UIDalert").css({
	  	    	    	                "visibility":"visible",
	  	    	    	                "opacity":"1",
	  	    	    	                "left":"210px"
		        	    	      });	
	        	    		 $(".center .UIDalert span").text("学号不能为空！");
	        	    		 $(".center input[type = text]").css("border","2px solid red");
	        	    	    return false;
	        	    }else{	        	    		        	    	
	        	    	     if(!UIDconstraint.test(UID.value)){	        	    	    	 
	        	    	    	 $(".center .UIDalert").css({
	  	    	    	                "visibility":"visible",
	  	    	    	                "opacity":"1",
	  	    	    	                "left":"210px",
	  	    	    	                "height":"80px"
		        	    	      });	
	        	    	    	 $(".center .UPWDalert").css({
	  	    	    	                "visibility":"hidden",
	  	    	    	                "opacity":"0",
	  	    	    	                "left":"220px",
	  	    	    	                "height":"40px"
		        	    	      });	
	        	    		 $(".center .UIDalert span").text("学号格式错误！只能为数字且为8位");	     
	        	    		 $(".center input[type = text]").css("border","2px solid red");
	        	    		 $(".center input[type = password]").css("border","1px solid black");
	        	    	    	          return false;
	        	    	     }else{
		        	    	    	 if(UPWD.value == ""){	  
		        	    	    		 $(".center .UPWDalert").css({
			  	    	    	                "visibility":"visible",
			  	    	    	                "opacity":"1",
			  	    	    	                "left":"210px",
			  	    	    	                "height":"40px"
				        	    	      });	
		        	    	    		 $(".center .UIDalert").css({
			  	    	    	                "visibility":"hidden",
			  	    	    	                "opacity":"0",
			  	    	    	                "left":"220px",
			  	    	    	                "height":"40px"
				        	    	      });
			        	    		 $(".center .UPWDalert span").text("密码不能为空！");
			        	    		 $(".center input[type = password]").css("border","2px solid red");
			        	    		 $(".center input[type = text]").css("border","1px solid black");
			        	    	    	    return false;
			        	    	     }else{
			        	    	    	 $(".center .UPWDalert,.UIDalert").css({
			  	    	    	                "visibility":"hidden",
			  	    	    	                "opacity":"0",
			  	    	    	                "left":"220px",
			  	    	    	                "height":"40px"
				        	    	      });		    	             	   
			        	    	    	      return true;  
			        	    	     }
		        	    	    	
	        	                 }
	                     }
	        }
}
$(function(){
	         setInterval(change,1000);
	        function randNum(min,max){
	        	      return Math.round((Math.random()*(max-min)+min));
	        }
	        function change(){
	        	$(".center>span").css({
  			      "color":"rgb("+randNum(0,255)+","+randNum(0,255)+","+randNum(0,255)+")"   
  		        })
	        }
});
