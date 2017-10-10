/**
 * @author Mr.Nie
 */
var data = {a:1}
var baseURL = "http://localhost:8080/vueTest/";
var vue2 = new Vue({
	      el:"#vue2",
	      data:{
	    	    data,	    	    
	    	    redUname:false,
	    	    value: null,
	    	    PWD: null, 
	    	    redPWD:false,
	    	    fixed: false,
	    	    hidden: true,
	    	    regex: /[\d]{11}/g,
	    	    regex2: /[!@#$%^&*！@#￥%……&*]{1,}/g
	      },
	      methods:{ 
	    	  
	      },
	      computed:{
	    	             
	      },
	      watch:{
		    	  value:function(){
		            	 if((this.value).match(this.regex2) != null || (this.value) == ""){
	            		     this.redUname = true;
			          }else{
			        	     this.redUname = false;
			          }    
		             },
		             PWD:function(){
		            	 if(this.PWD == null || this.PWD == ""){
	      	          	this.redPWD = true;
	      			}else{
	      	        	  this.redPWD = false;
	       		   }
		             }
	      }
});
              function show(){
            	                 vue2.fixed = true;
            	                 vue2.hidden = false;
              }
              function cancle(){
	                 vue2.fixed = false;
	                 vue2.hidden = true;
              }
                         var vue3 = new Vue({
                        	             el: "#vue3",
                        	             data:{
                        	            	       price: 0,
                        	            	       count: 0,
                        	            	       priceRegex: /[^\d|.]{1,5}/g,
                        	            	       countRegex: /[^\d]{1,5}/g,
                        	            	       responseData:null
                        	             },
                        	             computed:{
                        	            	 		   totalCost:function(){                        	            	        	             
                        	            	        	              return this.price*this.count;
                        	            	           }                        	            	           
                        	             },
                        	             methods:{                        	            	            
                        	            	            numberCheck:function(value, flag){
                        	            	            	var vue = this;             
                        	            	            	  if(flag == 1){
                        	            	            		  if((this.priceRegex).test(value)){
                            	            	            		  this.price = (value).slice(0,(value).length-1);
                            	            	            	  }  
                        	            	            	  }else if((this.countRegex).test(value)){
                        	            	            		  this.count = (value).slice(0,(value).length-1); 
                        	            	            	  }
                        	            	            	  
                        	            	            	  
				      	            	        	    },
				      	            	        	    zeroCheck:function(val){	
				      	            	        	    	       if(val == "price" && this.price == 0){
				      	            	        	    	    	    	this.price = '';
				      	            	        	    	       }else if(val == "count" && this.count == 0){	
				      	            	        	    	    	         this.count = '';
				      	            	        	               }
				      	            	        	    },
				      	            	        	    getSometing:_.debounce(
				      	            	        	    		function(){}
				      	            	        	    			    ),
				      	            	        	   ajax:function(){
				      	            	        		        var vue = this;
				      	            	        		             axios({
				      	            	        		            	     method: "post",
				      	            	        		            	     url: "http://localhost:8080/vueTest/print.action",
				      	            	        		            	     responseType: "text"			      	            	        		            	     
				      	            	        		             },500)
				      	            	        		             .then(function(response){
				      	            	        		            	        vue.responseData = response.data;
				      	            	        		             })
				      	            	        		             .catch(function(error){
				      	            	        		            	        alert(error);
				      	            	        		             })
				      	            	        	   }
                        	             },
                        	             watch:{
			                        	            	  price:function(){
				            	            	        	        this.numberCheck(this.price, 1);
				            	            	          },
				            	            	          count:function(){
				            	            	        	        this.numberCheck(this.count, 0);
				            	            	          }
                        	             }
                         });      
                         var xmlHttp;
                         $(function(){
                        	      if(window.ActiveXObject){                        	    	     
                        	    	     xmlHttp = new ActiveXObject("Mircrosoft.XMLHTTP"); 
                        	      }else if(window.XMLHttpRequest){
                        	    	     xmlHttp = new XMLHttpRequest();
                        	      }
                        	     
                        	     
                         });

var vue4 = new Vue({
	               el: "#vue4",
	               data:{
	            	         admin: false,
                             user: true,
                             PWD: null,
                             username: null,
                             redUname: false,
                             redPWD: false,
                             datas:{
                            	 text1: "a",
                            	 text2: "b",
                                 text3: "c",
                            	 text4: "d"
                             },
                             baseUrl: "http://localhost:8080/vueTest",
                             seen:false
	               },
	               methods:{
	            	            check:function(event){
	            	            	       var vm = this;
	            	            	       axios({
	            	            	    	        url : baseURL+"/text",                        	            	            	    	        
	            	            	    	        requestMethod: "post"                        	            	            	    	        
	            	            	       },500)
	            	            	       .then(function(response){
	            	            	    	         alert(response.data);
	            	            	       })
	            	            	       .catch(function(error){
	            	            	    	              alert(error);  
	            	            	       });
	            	            	       if(event){
	            	            	    	   event.preventDefault();
	            	            	    	     alert(event.target);
	            	            	       }
	            	            },
	            	            change:function(val){
	            	            	       if(val === "admin"){
	            	            	    	         this.admin = true;
	            	            	    	         this.user = false;
	            	            	       }else{
	            	            	    	         this.user = true;
	            	            	    	         this.admin = false;
	            	            	       }
	            	            },
	               },
	               watch:{
	            	             
	               }                          
});

                        /*
						 * $.ajax({ url: "/vueTest/ajax.html", type: "post",
						 * headers: {'Content-type':'text/html'}, success:
						 * function(res){ if(res.status == 1){ alert("status ==
						 * 1"); alert(res); }else{ alert(res.message); } } });
						 */

var check = new Vue({
    	          el: "#check",
    	          data:{
    	        	     PWD: null,
    	        	     url: "http://localhost:8080/vueTest/check.action?password="                        	        	     
    	          },
    	          methods:{
    	        	        check:function(){
    	        	        	      var vm = this;// url:
													// "http://localhost:8080/vueTest/check.action?password="+vm.PWD,
    	        	        	      axios({
    	        	        	    	  url: vm.url+vm.PWD,//
    	        	        	    	  requestMethod: "post",
    	        	                      headers: {
    	        	                            'Content-Type': 'application/x-www-form-urlencoded'
    	        	                      }
    	        	                  },500)
    	        	        	      .then(function(response){
    	        	        	    	         if(response.data == "OK"){
    	        	        	    	        	        alert("OK");
    	        	        	    	         }else{
    	        	        	    	        	        alert("SORRY THE PASSWORD INCORRECT!");
    	        	        	    	         }
    	        	        	      })
    	        	        	      .catch(function(){
    	        	        	    	  
    	        	        	      });
    	        	        }
    	          }
});

var trace = new Vue({
	            el:"#trace",
	            data:{
	            	      responseData:""
	            },
	            methods:{
	            	           trace:function(){
	            	        	         var vm = this;
	            	        	         axios({
	            	        	        	        url: baseURL+"text.html",
	            	        	        	        requestMethod: "post"
	            	        	         },500)
	            	        	         .then(function(response){
	            	        	        	       vm.responseData = response.data;
	            	        	         })
	            	        	         .catch(function(error){
	            	        	        	        alert(error);
	            	        	         })
	            	           }   
	            }
});