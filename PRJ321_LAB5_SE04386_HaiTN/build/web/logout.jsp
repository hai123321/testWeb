<%-- 
    Document   : logout
    Created on : Nov 10, 2016, 10:59:51 PM
    Author     : WindyKiss
--%>

<%@include file="includes/header.jsp" %>

<%
    session.invalidate();
%>
<div class="container">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
            <h1 id="homeHeading">Logout Successful</h1>

            <hr>
        </div>
    </div>
</div>

<%@include file="includes/body.jsp" %>



<%@include file="includes/footer.jsp" %>
