<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html> 
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1" /> 
<title>Software Incubation Lab</title>
<link href="css/jquery.mobile.structure-1.3.2.css" rel="stylesheet" type="text/css"/>
<link href="css/jquery.mobile-1.3.2.css" rel="stylesheet" type="text/css"/>
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jquery.mobile-1.3.2.min.js" type="text/javascript"></script>
</head> 
<body> 

<section id="page1" data-role="page">
  <header data-role="header"  data-theme="b" ><h1>山理逸夫图书馆查询</h1></header>
  <div data-role="content" class="content" data-theme="e">
  
        <form method="post" id="loginform" action="getLibrary.action" data-ajax="false">
             
            <div data-role="fieldcontain">
                <label for="sno">学号：</label>
                <input type="text" name="number" id="sno" placeholder="请输入学号">
                <br><br>
                
                <label for="password">密码：</label>
                <input type="password" name="password" id="password" placeholder="请输入密码" >
            </div>
            <br><br>
            
            <div class="ui-grid-a">
            			
                        <div class="ui-block-a">
                            <input type="reset"  data-inline="true" value="重填" id="reset">
                        </div>
                        
                        <div class="ui-block-b">
                            <input type="submit" data-inline="true" value="提交" id="submit">
                        </div>
                        
			</div>
            
        </form>
        <br><br><br><br>
        
  </div>
  <footer data-role="footer" ><h1>©山东理工计算机学院-软件孵化实验室</h1></footer>
</section>

</body>
</html>