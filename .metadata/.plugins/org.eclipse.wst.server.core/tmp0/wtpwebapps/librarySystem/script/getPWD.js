/**
 * 获取用户密码，修改密码用户页面脚本
 * 作者：聂旺
 * 时间：2016/12/25
 */
var UIDconstraint = /^[\d]{8}$/;
var passwordconstraint = /^[\d\w]{5,20}$/;
                    function check(form){                    	
                    	         with(form){                                      	        	               
                    	        	     if(UID.value == ""){
                    	        	    	        alert("学号不能为空！");
                    	        	    	        return false;
                    	        	     }else{                    	        	    	 
                    	        	    	         if(!UIDconstraint.test(UID.value)){
                    	        	    	        	      alert("学号格式错误！只能为数字且为长8位！");
                    	        	    	        	      return false;
                    	        	    	         }else{                        	        	    	        	         
                    	        	    	        	       if(resetpassword.value == ""){                    	        	    	        	    	        
                    	        	    	        	    	      alert("密码不能为空！");
                    	        	    	        	    	        return false;
                    	        	    	        	       }else if(!passwordconstraint.test(resetpassword.value)){
                    	        	    	        	    	                alert("密码格式错误！长度为5到20个字符！")
                    	        	    	        	    	                 return false;
                    	        	    	        	       }else{
                    	        	    	        	    	       return true;
                    	        	    	        	       }
                    	        	    	         }
                    	        	     }
                    	         }
                    }
                    
                    $(function(){
                    	  
                    	  $("#resetPWD").click(function(){                    		                    
                    		                    if($("table tr:nth-child(3)").children().length == 0){
                    		                           $("tr:nth-child(3)").append(""+
                    		        		                 "<td>"+
                    		                                     "<img src = images/key.png />"+
                    		        		                 "</td>"+
                    		        		                 "<td><input type = password name = resetpassword placeholder = 请输入密码 maxlength = 20 /></td>")
                    		        		                 setTimeout("change()",500);
                    		                           $("#get").attr("type","button");
                    		                    }                    		                    	                    		                   
                    		                    $("table tr:last-child span:first-child").remove();                       
                      });                      	                	  
                    	    setTimeout("disapear()",5000);
                  });       
                    function disapear(){
            	          $("table tr:last-child").remove();
                      } 
                    function change(){
                    	$("#resetPWD").attr("type","submit");
                    }
                       