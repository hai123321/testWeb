<%-- 
    Document   : loginSuccesful
    Created on : Nov 10, 2016, 10:33:30 PM
    Author     : WindyKiss
--%>

<%
    String userName = (String) request.getAttribute("userName");
    session.setAttribute("userName", userName);
%>
<%@include file="includes/header.jsp" %>


<div class="container">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
            <h1 id="homeHeading"> <%=userName%> Login Successful</h1>

            <hr>
        </div>
    </div>
</div>

<%@include file="includes/body.jsp" %>



<%@include file="includes/footer.jsp" %>
