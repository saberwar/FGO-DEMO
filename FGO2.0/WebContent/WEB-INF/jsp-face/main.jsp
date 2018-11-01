<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%String path = request.getContextPath(); %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="<%=path%>/css/theme.css" type="text/css"> </head>
<link rel="stylesheet" href="<%=path%>/css/magic.css" />
 <script src="<%=path%>/rightClickMenue/jquery-1.8.2.min.js"></script>
 <script>
 		$(document).ready(function(){
 			 
 			 	$(".row").addClass("magictime spaceInDown");
 		})
 		
         
          	</script>
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
        <div class="col-md-12">
          <h1>My FGO</h1>
          <p class="lead">just for fun</p>
        </div>
      </div>
      <div class="row">
        <div class="col-md-4 p-4">
        	<a href="<%=path %>/Package/package.do">
          <img class="img-fluid d-block rounded-circle mx-auto" src="<%=path%>/img/index/01.jpg">
          <p class="my-4">
            <i>
              <label class="guide-label">仓库</label>
            </i>
          </p>
          <p>放老婆的地方</p>
           </a>
        </div>
       
        	
        <div class="col-md-4 p-4">
        	<a href="#">
          <img class="img-fluid d-block rounded-circle mx-auto" src="<%=path%>/img/index/02.jpg">
          <p class="my-4">
            <i>
               <label class="guide-label">抽卡</label>
            </i>
          </p>
          <p>接老婆回家</p>
           </a>
        </div>
       
        <div class="col-md-4 p-4">
        	<a href="#">
          <img class="img-fluid d-block rounded-circle mx-auto" src="<%=path%>/img/index/03.png">
          <p class="my-4">
            <label class="guide-label">从者数据</label>
          </p>
          <p>自己搜集的一些数据</p>
          </a>
        </div>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
</body>

</html>