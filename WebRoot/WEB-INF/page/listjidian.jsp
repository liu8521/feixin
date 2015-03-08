<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <style type="text/css">
		body {
			background-color: #EEEEFF;
		}
		body,td,th {
			font-size: 35px;
		}
		.style3 {
			font-size: 35px;
			font-weight: bold;
		}
		.style4 {color: #FF0000}
		.style5 {color: #0000FF}
	</style>
    <title>绩点查询</title>

  </head>
  
  <body>
    <table width="100%">
 
  <tr>
    <td>&nbsp;</td>
  </tr>
   <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>
    	<table width="80%" border="1" align="center" cellspacing="0" cellpadding="1">
        	  <caption>
        	  	<span class="style3">学生基本信息</span>
        	  </caption>
              <tr>
                <th scope="col" align="center" valign="middle" nowrap>学号</th>
                <th scope="col" align="center" valign="middle" nowrap>姓名</th>
                <th scope="col" align="center" valign="middle" nowrap>性别</th>
                <th scope="col" align="center" valign="middle" nowrap>年级</th>
                <th scope="col" align="center" valign="middle" nowrap>专业</th>
                <th scope="col" align="center" valign="middle" nowrap>班级</th>
              </tr>
              <tr>
                <td scope="col" align="center" valign="middle" nowrap>&nbsp;${studentInfo.xh }</td>
                <td scope="col" align="center" valign="middle" nowrap>${studentInfo.xm }</td>
                <td scope="col" align="center" valign="middle" nowrap>&nbsp;${studentInfo.xb}</td>
                <td scope="col" align="center" valign="middle" nowrap>&nbsp;${studentInfo.nj}</td>
                <td scope="col" align="center" valign="middle" nowrap>&nbsp;${studentInfo.zy}</td>
                <td scope="col" align="center" valign="middle" nowrap>&nbsp;${studentInfo.bj}</td>
              </tr>
        </table>
    </td>
  </tr>

    <!-- 空格 -->
  <tr>
    <td>&nbsp;</td>
  </tr>
   <tr>
    <td>&nbsp;</td>
  </tr>

  <tr>
    <td>
        <table width="60%" border="1" align="center" cellspacing="0" cellpadding="1">
          <caption>
          <span class="style3">学分信息</span>
          </caption>
          <tr>
            <th scope="col" align="center" valign="middle" nowrap>总学分</th>
            <th scope="col" align="center" valign="middle" nowrap>总绩点</th>
            <th scope="col" align="center" valign="middle" nowrap>平均绩点</th>
            
          </tr>
          <tr>
            <td scope="col" align="center" valign="middle" nowrap>&nbsp;${struct.totalxuefen }</td>
            <td scope="col" align="center" valign="middle" nowrap>&nbsp;${struct.totaljidian }</td>
            <td scope="col" align="center" valign="middle" nowrap>&nbsp;${struct.averagejidian }</td>
          </tr>
        </table>
    </td>
  </tr>
  
  <tr>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
  </tr>

  <tr>
    <td>&nbsp;</td>
  </tr>
</table>
  </body>
</html>
