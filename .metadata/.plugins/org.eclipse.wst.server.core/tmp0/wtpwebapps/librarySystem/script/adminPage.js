/**
 * 管理员页面脚本
 * 作者：聂旺
 * 时间：2016/12/27
 */
var selfHeight = [];
	var i = 0;
$(function(){	      	
	              $("div.centerLeft>ul>li>ul").each(function(){	            
	                             selfHeight[i++] = $(this).css("height");	                                   	                             
	              });
	       $("div.centerLeft>ul>li>ul").css({
	    	   "height":"0px",
	    	   "display":"none"	    
	       });
	       $("div.centerLeft>ul>li>span").click(function(){	    	
	    	                  if($(this).children("span").css("transform") == "matrix(-1, 0, 0, -1, 0, 0)"){
	    	                	  $(this).children("span").css("transform","rotate(90deg)");
	    	                	       $(this).next("ul").css({
	    	                	    	   "height":"0",
	    	                	    	   "display":"none"	    	                	    	 
	    	                	       });
	    	                  }else{	    	 	    	                	                
	    	                	  $(this).children("span").css("transform","rotate(180deg)");	    	    	                	      
	    	                	       $(this).next("ul").css({
	    	                	    	   "height":selfHeight[$("div.centerLeft>ul>li").index($(this).parent("li"))],
	    	                	    	   "display":"block"	    	                	    	   
	    	                	       });	    	                	       
	    	                  }  	    	                  
	       });
	       $("div.centerLeft>ul>li>span").mouseover(function(){
	    	                   $(this).children("span").css("border-bottom","6px solid #80ff00");
	       });
	       $("div.centerLeft>ul>li>span").mouseout(function(){
               $(this).children("span").css("border-bottom","6px solid white");
           });
	       $(".center .centerRight form").attr("action","/librarySystem/BookDeal");
	       
	       $(".center ul>li>ul>li>a").click(function(){	   	    	                        						    	                				    		          					      
	    	                 switch($(this).text()){
	    	                 case "添加图书":	    	                	          
	    	                	 $(".center .centerRight table tr:nth-child(1) td:first-child").text("书编号");
	    	                	 $(".center .centerRight table tr:nth-child(1) td:last-child").find("input").attr("name","bookNumber");
	    	                	        $(".center .centerRight table").css({
	    	                	        	     "opacity":"1",
	    	                	        	     "visibility":"visible"
	    	                	        });
	    	                	   	 $(".center .centerRight table tr").css({
	                	        	     "opacity":"1",
	                	        	     "visibility":"visible"
	                	            });
	    	                	        $(".center .centerRight table tr:last-child input").attr("value","添加");
	    	                	        $(".center .centerRight form").attr("onsubmit","return check1(this);");
	    	                	 break;
	    	                 case "更新图书":
	    	                	 $(".center .centerRight table tr:nth-child(1) td:first-child").text("书编号");
	    	                	 $(".center .centerRight table tr:nth-child(1) td:last-child").find("input").attr("name","bookNumber");
	    	                	        $(".center .centerRight table").css({
			                	        	     "opacity":"1",
			                	        	     "visibility":"visible"
			                	        });
	    	                	        $(".center .centerRight table tr").css({
		                	        	     "opacity":"1",
		                	        	     "visibility":"visible"
		                	            });
	    	                	        $(".center .centerRight table tr:last-child input").attr("value","更新");
	    	                	        $(".center .centerRight form").attr("onsubmit","return check2(this);");
	    	                	 break;	  
	    	                 case "删除图书":			 
	    	                	 $(".center .centerRight table tr:nth-child(1) td:first-child").text("书编号");
	    	                	 $(".center .centerRight table tr:nth-child(1) td:last-child").find("input").attr("name","bookNumber");
			    	                	 $(".center .centerRight table").css({
		                	        	     "opacity":"1",
		                	        	     "visibility":"visible"
		                	            });			    	              
			    	                	 for(var i = 3;i<7;i++){
			    	                		    $(".center .centerRight table tr:nth-child("+i+")").css({
			    	                		    	"opacity":"0",
				                	        	     "visibility":"hidden"
			    	                		    }) ;
			    	                	 }
			    	                	 $(".center .centerRight table tr:last-child input").attr("value","删除");
			    	                	 $(".center .centerRight form").attr("onsubmit","return check3(this);");
	    	                	 break;
	    	                 case "查看":
			    	                	 $(".center .centerRight table").css({
		                	        	     "opacity":"1",
		                	        	     "visibility":"visible"
		                	            });			    	              
			    	                	 $(".center .centerRight table tr:nth-child(1) td:first-child").text("学号");
			    	                	 $(".center .centerRight table tr:nth-child(1) td:last-child").find("input").attr("name","UID");
			    	                	 for(var i = 2;i<7;i++){
			    	                		    $(".center .centerRight table tr:nth-child("+i+")").css({
			    	                		    	"opacity":"0",
				                	        	     "visibility":"hidden"
			    	                		    }) ;
			    	                	 }
			    	                	 $(".center .centerRight table tr:last-child input").attr("value","查看");
			    	                	 $(".center .centerRight form").attr("onsubmit","return check4(this);");
			    	                	 $(".center .centerRight form").attr("action","/librarySystem/Borrow");			    	                	 
	    	                	 break;
	    	                 }	    	                 
	       });	 	   
	       	    
	       if($(".center .centerRight table.show tr:nth-child(2) td").text() == ""){
	    	       $(".center .centerRight table.show").css({
  	    	    	      "opacity":"0",
  	    	              "visibility":"hidden"
  	    	       });
  	       }else{
  		    	   $(".center .centerRight table.show").css({
  	 	              "opacity":"1",
  	 	              "visibility":"visible"
  	               });   
  	       }
});

var bookNumberConstraint = /^[\d]{13}$/;
var bookPriceConstraint = /^[\d]{2}$/;
var bookCountConstraint = /^[\d]{1,4}$/;
var authorNameConstraint = /^[^!@#$%^&*]{1,20}$/;
var publishNameConstraint = /^[^!@#$%^&*]{1,20}$/;
function check1(form){
	            with(form){	            	            
	            	    if(bookNumber.value == ""){
	            	    	        alert("编号不能为空！");
	            	    	        return false;
	            	    }else if(!bookNumberConstraint.test(bookNumber.value)){
	            	    	        	            alert("编号格式错误！只能为数字且长度为13位！");
	            	    	        	            return false;
	            	    }else if(bookName.value == ""){
	            	    	              alert("书名不能为空！");
	            	    	              return false;
	            	    }else if(authorName.value == ""){
	            	    	              alert("作者不能为空！");
  	    	                              return false;
	            	    }else if(!authorNameConstraint.test(authorName.value)){
	            	    	               alert("作者名不能含有 ! @ # $ % ^ & * 特殊字符");
 	    	                               return false;
	            	    }else if(publishName.value == ""){
	            	    	               alert("出版社不能为空！");
 	    	                               return false;
	            	    }else if(pubishNameConstarint.test(publishName.value)){
					            	       alert("出版社不能含有 ! @ # $ % ^ & * 特殊字符");
				                           return false;
	            	    }else if(bookPrice.value == ""){
	            	    	               alert("租价不能为空！");
	            	    	               return false;
	            	    }else if(!bookPriceConstraint.test(bookPrice.value)){
	            	    	               alert("租价只能为数字！");
	            	    	               return false;
	            	    }else if(bookCount.value == ""){
	            	    	               alert("数量不能为空！");
	            	    	               return false;
	            	    }else if(!bookCountConstraint.test(bookCount.value)){
	            	    	                alert("数量格式错误！只能为数字,且长度最多为4位！");
	            	    	                return false;
	            	    }else if($(".center>span").text() != ""){
		            	         alert("此书已存在！");
		            	         return false;
		                }else{
		                	    alert(deal.value);		                	
		                        return false;
		                    }	            	    	    
	            	    }
}
function check3(form){
	         with(form){	        	            
			        	 if(bookNumber.value == ""){
			        		       if(bookName.value == ""){
			        		    	   alert("编号和书名不能全为空！");
			        		    	   return false;
			        		       }else{
			        		    	       if(!bookNameConstraint.test(bookName.value)){
			        		    	    	           alert("书名格式不正确！");
			        		    	    	           return false;
			        		    	       }else{
			        		    	    	           return true;
			        		    	       }
			        		       }		 	    	        		 	    	       
					 	 }else if(!bookNumberConstraint.test(bookNumber.value)){
					 	    	       alert("编号格式错误！只能为数字且长度为13位！");
					 	    	        	   return false;
					 	 }else{
					 		      return true;
					 	 }
	         }
}
function check4(form){	              
	             with(form){
	            	           if(UID.value == ""){
	            	        	          alert("学号不能为空！");
	            	        	          return false;
	            	           }else{
	            	        	          return true;
	            	           }
	             }
}




