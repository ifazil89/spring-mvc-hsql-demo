<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
	<div class="login_panel">
	<c:set var="errorString" value="${error}"></c:set> 
	
	<c:if test="${not empty error}">		
		<p class="bg-danger">${error}</p>
	</c:if>
	
		<div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">LogIn</h3>
        </div>
        <div class="panel-body">
        	<!-- login form -->
        	 <form:form name="login" action="login" method="POST" modelAttribute="userLogin">
		        <div class="form-group">
		            <label for="userName">UserName</label>
		            <form:input type="text" path="userName" class="form-control" id="userName" placeholder="UserName" 
		            		data-minlength="3" required="true"/>
		            <div class="help-block with-errors"></div>
		        </div>
		        <div class="form-group">
		            <label for="password">Password</label>
		            <form:input type="password" path="password" class="form-control" id="password" placeholder="Password" />
		        </div>
		        <button type="submit" class="btn btn-primary">Login</button>
		        <button type="button" class="btn btn-primary" onclick="signUpClick()">SignUp</button>
		    </form:form>
        	<!-- end login form -->
        </div>
    </div>
		<a href="${pageContext.request.contextPath}/home">Click to Home page</a>
	</div>
</div>