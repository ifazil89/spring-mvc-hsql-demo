<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	
	<h2>List Of Users</h2>
	<h3>Welcome ${userSession.firstName}</h3>
	<table class="table table-bordered">
		<thead><tr><td>Username</td><td>Password</td>
		</tr><thead>
		<tbody>
		<c:forEach items="${users}" var="user">
		<tr><td>${user.userName}</td><td>${user.password}</td>
		</tr>	
		</c:forEach>
		</tbody>
	</table>
	
	 <div class="row">
            <div class="col-xs-3">
                <a href="#" class="img-thumbnail">
                    <img src="../images/125x125.jpg" alt="125x125">
                </a>
            </div>
            <div class="col-xs-3">
                <a href="#" class="thumbnail">
                    <img src="../images/125x125.jpg" alt="125x125">
                </a>
            </div>
            <div class="col-xs-3">
                <a href="#" class="thumbnail">
                    <img src="../images/125x125.jpg" alt="125x125">
                </a>
            </div>
            <div class="col-xs-3">
                <a href="#" class="thumbnail">
                    <img src="../images/125x125.jpg" alt="125x125">
                </a>
            </div>
        </div>
	
</div>
	<div class="row">
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 1</p></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 2</p></div>
            <div class="clearfix visible-sm-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 3</p></div>
            <div class="clearfix visible-md-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 4</p></div>
            <div class="clearfix visible-sm-block"></div>
            <div class="clearfix visible-lg-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 5</p></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 6</p></div>
            <div class="clearfix visible-sm-block"></div>
            <div class="clearfix visible-md-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 7</p></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 8</p></div>
            <div class="clearfix visible-sm-block"></div>
            <div class="clearfix visible-lg-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 9</p></div>
            <div class="clearfix visible-md-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 10</p></div>
            <div class="clearfix visible-sm-block"></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 11</p></div>
            <div class="col-sm-6 col-md-4 col-lg-3"><p>Box 12</p></div>
        </div>
