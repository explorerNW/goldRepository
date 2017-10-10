<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel = "shortCut Icon" href = "images/userIcon.ico" />
<link rel = "stylesheet" type = "text/css" href = "css/register.css" />
<script type = "text/javascript" src = "jQuery/jQuery-compressed.js"></script>
<script type = "text/javascript" src = "script/register.js"></script>
<title>register page</title>
</head>
<body>           
           <div class = "center">
                    <span>&nbsp;REGISTER</span>
              <form action = "/librarySystem//UserDeal" method = "post" onsubmit = "return check(this);">
                   <table>
                               <tr>
                                       <td><img src = "images/idIMG.png"/></td>
                                       <td>
                                              <input type = "text" id = "UID" name = "UID" placeholder = "学号"  required/>
                                              <div class = "UIDalert"><span></span></div>
                                       </td>                                       
                               </tr>
                               <tr>
                                        <td colspan = 2><input type = "text" name = "Uname" id = "Uname" placeholder = "姓名" required/></td>
                               </tr>
                               <tr>
                                       <td><img alt="" src="images/key.png"/></td>
                                       <td>
                                            <input type = "password" id = "UPWD" name = "UPWD" placeholder = "密码" required/>
                                            <div class = "UPWDalert"><span></span></div>
                                       </td>
                               </tr>
                               <tr>
                                       <td colspan = 2>
                                                <input type = "submit" value = "注册" name = "deal" required/>
                                       </td>
                               </tr>
                   </table>
              </form>     
              </div>             
</body>
</html>