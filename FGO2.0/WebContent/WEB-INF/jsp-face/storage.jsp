<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%String path = request.getContextPath(); %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
 
    <link rel="stylesheet" href="<%=path%>/css/theme.css" type="text/css"> 
 <script src="<%=path%>/rightClickMenue/jquery-1.8.2.min.js"></script>
  <script src="<%=path%>/js/storage/server-icon-hover-action.js"></script>
  <script src="<%=path%>/rightClickMenue/jquery.contextMenu.js"></script>
	  <link rel="stylesheet" href="<%=path%>/css/magic.css" />
		<link rel="stylesheet" href="<%=path%>/rightClickMenue/jquery.contextMenu.css" />

<body>
  <nav class="navbar navbar-expand-md bg-primary navbar-dark">
    <div class="container">
      <a class="navbar-brand" href="#">
        <i class="fa d-inline fa-lg fa-cloud"></i>
        <b>FGO</b>
      </a>
      <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar2SupportedContent">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse text-center justify-content-end" id="navbar2SupportedContent">
        <label id="username">${member.name}</label>
       
      </div>
       <img src="<%=path%>/img/index/01.jpg" width="60px" height="60px" style="margin-left: 10px;" />
      
    </div>
  </nav>
  <div class="py-5 text-center bg-light">
    <div class="container">
   
      <div class="row">
      	<div id="stage">
      
        	 <div id="servers">
        	 <c:forEach items="${serverlist }" var="server">
        	<div class="server-image" >
        		<img src="<%=path%>/img/server-icon/${server.id-1}.jpg" id="server-${server.id }" class="img" name="${server.name }" width="100px" height="100px" />
        	</div>
        	</c:forEach>
        </div>
        </div>
       
      
      </div>
    </div>
     
        <div id="server-information">
    	<img src="<%=path%>/img/cancle.png" onclick="$('#server-information').css('display','none')" />
			<table cellspacing="20">
				<thead><tr><td colspan="2"><label style="font-size:30px;"></label></td></tr></thead>
				<tbody>
					<tr>
	<td class="filed"><label class="filed-name">性别</label></td>
	<td class="value"><input type="text" class="server-value" id="gender" readonly="true" value=""></td>
</tr>
					<tr>
	<td class="filed"><label class="filed-name">职介</label></td>
	<td class="value"><input type="text" class="server-value" id="type"  readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">稀有度</label></td>
	<td class="value"><input type="text" class="server-value" id="start"  readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">LV1_ATK</label></td>
	<td class="value"><input type="text" class="server-value" id="LV1_ATK"  readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">LV1_HP</label></td>
	<td class="value"><input type="text" class="server-value" id="LV1_HP"  readonly="true" value=""></td>
</tr>

<tr>
	<td class="filed"><label class="filed-name">LVMAX4_ATK</label></td>
	<td class="value"><input type="text" class="server-value" id="LVMAX4_ATK"  readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">LVMAX4_HP</label></td>
	<td class="value"><input type="text" class="server-value" id="LVMAX4_HP"  readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">maxATK</label></td>
	<td class="value"><input type="text" class="server-value" id="maxATK"  readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">maxHP</label></td>
	<td class="value"><input type="text" class="server-value"  id="maxHP"   readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">出处</label></td>
	<td class="value"><input type="text" class="server-value"  id="Region"  readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">CV</label></td>
	<td class="value"><input type="text" class="server-value"  id="CV"  readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">画师</label></td>
	<td class="value"><input type="text" class="server-value"  id="ILLUST"  readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">宝具</label></td>
	<td class="value"><input type="text" class="server-value"  id="tool" readonly="true" value=""></td>
</tr>
<tr>
	<td class="filed"><label class="filed-name">昵称</label></td>
	<td class="value"><input type="text" class="server-value" id="cutename"  readonly="true" value=""></td>
</tr>
				</tbody>
			</table>
		</div>
    
  </div>
 <script type="text/javascript">
  var path="<%=path%>";
 </script>
  
</body>

</html>