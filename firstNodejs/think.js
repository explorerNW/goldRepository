/**
 * http://usejsdoc.org/
 * 
 * @author Mr.Nie
 */

/*var person = function() {
	this.thinking = function(callback) {
		console.log("thinking!------------");
		setTimeout(function() {
			callback();
		}, 5000);
	}, this.anwser = function() {
		console.log("terminated!");
	}
};
var p = new person();
p.thinking(function() {
	console.log("Think 5 senconds!");
	p.anwser();
});*/

var i = {// 将this指向当前对象
	name : 'NieWang',
	f : {
		fn : function() {
			return this.name;
		}
	}
}
console.log(i.f.fn());
var b = i.f.fn;
console.log(b.call(i));
console.log(b.apply(i));

//闭包
var obj = (function(){
	           var i = 100;	
	          return{
	        	        get:function(){
	        	        	     return i;
	        	        },
	        	        put:function(num){
	        	        	     i = num;
	                    },
	                    getI:function(){
	                    	     return this;
	                    }
	          }
}());
var b = obj.getI;
console.log("i = "+b.apply(obj));
console.log(obj.getI());
obj.put(10);
console.log("get : "+obj.get());
var i =100;
function test(){
	       return this.i;
}
var b = test;
console.log(b.apply());
console.log(b instanceof Object);

function person(){
	      this.name = "Nie Wang";
	      this.age = 22;
}

var a = (function(){
	           this.name = "Nie";
	           this.age = 22;
	           return{
	        	        result:function(){
	        	        	     return name+" "+age;
	        	        }
	           };
}());
console.log("a = "+a.result());
var p = new person();
console.log(p.name+" "+p.age);
console.log("p.prototype = "+p.prototype)
var pTest = function p(){};
p.name="nw";
console.log("pTest.prototype = "+pTest.prototype);
