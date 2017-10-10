/**
 * 
 */
   var literature = ["《最终》<br>作者：李小雨<br>租金：￥10/月","《骆驼祥子》<br>作者：老舍<br>租金：￥30/月",
	                 "《麦田里的守望者》<br>作者:杰罗姆·大卫·塞林格<br>租金：￥30/月","《流年里的花开》<br>作者:张岚 <br>租金：￥6/月",
	                 "《茶馆》<br>作者:老舍<br>租金：￥35/月","《你好青春》<br>作者:陈真,赵卜成<br>租金：￥10/月",
	                 "《朝花夕拾》<br>作者:鲁迅<br>租金：￥30/月","《中国古代文学作品选》<br>作者:于菲<br>租金：￥5/月",
	                 "《中国古典文学》<br>作者:人民文学出版社<br>租金：￥30/月","《狂人日记》<br>作者:鲁迅<br>租金：￥30/月"];
   
   var economy = ["《大数据经济·新常态》<br>作者:<br>租金：￥30/月","《经济学300年》<br>作者:<br>租金：￥30/月:",
	               "《证券投资学》<br>作者:<br>租金：￥30/月","《国富论》<br>作者:<br>租金：￥30/月","" +
	               		"《中国未来30年》<br>作者:<br>租金：￥30/月","《一本书读懂经济学》<br>作者:<br>租金：￥30/月",
	               		"《共享经济2.0》<br>作者:<br>租金：￥30/月","《Uber》<br>作者:<br>租金：￥30/月",
	               		"《欲望经济学》<br>作者:<br>租金：￥30/月","《经济学发展战略学》<br>作者:李成勋<br>租金：￥30/月"];
   
   var History = ["《左传·战国策》<br>作者:<br>租金：￥30/月","《资治通鉴》<br>作者:<br>租金：￥30/月",
	                "《摸金笔记》<br>作者:<br>租金：￥30/月","《历史学》<br>作者:<br>租金：￥30/月",
	                "《盖世功臣·曾国藩》<br>作者:<br>租金：￥30/月","《一本书读懂中国历史》<br>作者:<br>租金：￥30/月",
	                "《中华上下五千年》<br>作者:<br>租金：￥30/月","《中国全史》<br>作者:<br>租金：￥30/月",
	                "《中国历史》<br>作者:<br>租金：￥30/月","《浮光标影看平身》<br>作者:<br>租金：￥30/月"];
   
   var military = ["《陆军特种作战旅》<br>作者:<br>租金：￥30/月","《暗战》<br>作者:<br>租金：￥30/月",
	                 "《大海战》<br>作者:<br>租金：￥30/月","《军事装备维修保障概论》<br>作者:<br>租金：￥30/月",
	                 "《老兵口述抗战》<br>作者:<br>租金：￥30/月","《军事知识百科》<br>作者:<br>租金：￥30/月",
	                 "《二战全史》<br>作者:<br>租金：￥30/月","《世界最经典坦克》<br>作者:<br>租金：￥30/月",
	                 "《敢为天下先》<br>作者:<br>租金：￥30/月","《张之洞家训》<br>作者:<br>租金：￥30/月"];
   
   var political = ["《真正的复兴》<br>作者:<br>租金：￥30/月","《廉政审计》<br>作者:<br>租金：￥30/月",
	                 "《考研政治》<br>作者:<br>租金：￥30/月","《大国治理》<br>作者:<br>租金：￥30/月",
	                 "《大国智慧》<br>作者:<br>租金：￥30/月","《民国人物与民国政治》<br>作者:<br>租金：￥30/月",
	                 "《毛泽东选集》<br>作者:<br>租金：￥30/月","《安文化》<br>作者:<br>租金：￥30/月",
	                 "《权利运行的轨迹》<br>作者:<br>租金：￥30/月","《中国建筑60年》<br>作者:<br>租金：￥30/月"];
   
   var geography = ["《PLUTO》<br>作者:<br>租金：￥30/月","《布利尔讲世界地理》<br>作者:<br>租金：￥30/月",
	                   "《远洋驰骋》<br>作者:<br>租金：￥30/月","《地理空间部分标识体系》<br>作者:<br>租金：￥30/月",
	                   "《波起东海》<br>作者:<br>租金：￥30/月","《Arc地理信息系统》<br>作者:<br>租金：￥30/月",
	                   "《世界地图集》<br>作者:<br>租金：￥30/月","《长安与丝绸之路》<br>作者:<br>租金：￥30/月",
	                   "《世界地理地图集》<br>作者:<br>租金：￥30/月","《地理发现》<br>作者:<br>租金：￥30/月"];
   
   var medical = ["《免疫学》<br>作者:<br>租金：￥30/月","《医学影像学》<br>作者:<br>租金：￥30/月",
				       "《骨内科》<br>作者:<br>租金：￥30/月","《南方医话》<br>作者:<br>租金：￥30/月",
				       "《常见肿瘤病理》<br>作者:<br>租金：￥30/月","《博士看中医》<br>作者:<br>租金：￥30/月",
				       "《儿科疾病鉴别诊断学》<br>作者:<br>租金：￥30/月","《护理心理学》<br>作者:<br>租金：￥30/月",
				       "《心电图》<br>作者:<br>租金：￥30/月","《医学遗传学》<br>作者:<br>租金：￥30/月"];

    var Uconstraint = /^[\d]{8}$/;
               
   function check(form){
	          with(form){
	        	             if(UID.value == ""){
	        	            	      alert("用户名不能为空！");
	        	            	      return false;
	        	             }else{
	        	            	 if(!Uconstraint.test(UID.value)){
	            	                   alert("证号错误！必须为数字且不能超过8位！");	            	                   
	            	                   return false;
	                             }else if(UPWD.value == ""){
	        	            	         alert("密码不能为空！");	        	            	         
	        	            	         return false;
	        	            	 }else{
	        	                	     return true;
	        	                 }
	        	             }
	          }
   }
$(function(){	    
                	   $("div.commendLeft ul>li").bind("mouseover",function(){
                		           var i = 1;
                		           var bookInfor = [];
                		           var bookType = $(this).text();  
                		              switch(bookType){
                		              case "文学":
                		            	     bookType = "literature";                		            	     
                		            	     bookInfor = literature;                		            	     
                		            	     break;
                		              case "经济":
             		            	     bookType = "economy";
             		            	     bookInfor = economy;             		            	     
             		            	     break;
                		              case "历史":
             		            	     bookType = "history";
             		            	     bookInfor =  History;              		            	     
             		            	     break;
                		              case "军事":
             		            	     bookType = "military";
             		            	     bookInfor =  military;
             		            	     break;
                		              case "政治":
             		            	     bookType = "political";
             		            	     bookInfor = political;
             		            	     break;
                		              case "地理":
             		            	     bookType = "geography";             		            	     
             		            	     bookInfor = geography;
             		            	     break;
                		              case "医学":
             		            	     bookType = "medical";             		            	    
             		            	     bookInfor = medical;
             		            	     break;                		              
                		              }
                		        $("div.commendCenter ul>li>a>img").each(function(){
                		        	            $(this).attr("src","images/books/"+bookType+"/"+i+".jpg");                     		        	            
                		        	            $(this).parent().find("span").get(0).innerHTML = bookInfor[i-1];                         		        	            
                		        	            if(i>10){                		        	            	
                		        	            	 i = 1;
                		        	            }else{
                		        	            	i++;	
                		        	            }                		        	                              		        	           
                		        });
                	   });                	   
                	   $("input[id = login]").bind("click",function(){ 
                		             if($("div[class = loginUI]").css("display") == "block"){
                		            	 $("div[class = loginUI]").css("display","none");
                		             }else{
                		            	 $("div[class = loginUI]").css("display","block");
                		             }                		            
                	   });
                	   $("img[id = fork]").bind("click",function(){
			                		   if($("div[class = loginUI]").css("display") == "block"){
			      		            	 $("div[class = loginUI]").css("display","none");
			      		             }else{
			      		            	 $("div[class = loginUI]").css("display","block");
			      		             }			                		   
                	   });                	  
});
       
       $(function(){
        	     $("#login2").click(function(){          	    	             
	        	    	 if($("#userType").text() != "游客"){
	         	    	       $("#login").css("opacity","0");      
	         	     }else{
	         	    	       $("#login").css("opacity","1");       	    	      
	         	     }
        	     });        	                 	    
        	     if($("#userType").text() != "游客"){
   	    	       $("#login").css({
   	    	    	       "opacity":"0",
   	    	    	       "visibility":"hidden"   	    	    	
   	    	       });   	
   	    	    $(".top ul>li:nth-child(2)").append("<a href = /librarySystem/myPage.jsp class = myPage>我的主页</a>");	        	              
		   	     }else{
		   	    	       $("#login").css({
		   	    	    	"opacity":"1",
		   	    	    	"visibility":"visible"		   	    	    	   
		   	    	       });			   	    	    
		   	     }
        	     if($("#userType").text() == "管理员"){
        	    	        $("a.myPage").attr("href","/librarySystem/adminPage");	    
        	     }
        });
       
       var UID = document.getElementById("UID");
       var UtypeS = document.getElementById("UtypeS");
       var UtypeAD = document.getElementById("UtypeAD");
       var form1 = document.getElementById("form1");
       window.onload = function(){    	                           
    	                   UtypeS.addEventListener("click",function(){    	                	                 
                                            form1.setAttribute("action","/librarySystem/UserDeal"); 
                                            UID.setAttribute("placeholder","学号");
					       },false);
					         UtypeAD.addEventListener("click",function(){
					    	               form1.setAttribute("action","/librarySystem/AdminDeal"); 
					    	               UID.setAttribute("placeholder","工号");
					       },false);
    	                   if(UtypeS.checked){
    	                	            UID.setAttribute("placeholder","学号");
    	                	            form1.setAttribute("action","/librarySystem/UserDeal"); 
    	                   }
    	                   if(UtypeAD.checked){
    	                	             UID.setAttribute("placeholder","工号");
    	                	             form1.setAttribute("action","/librarySystem/AdminDeal"); 
    	                   }
    	                   
       }
       



