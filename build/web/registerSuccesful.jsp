<%-- 
    Document   : registerSuccesful
    Created on : Nov 10, 2016, 9:53:54 PM
    Author     : WindyKiss
--%>

<%@include file="includes/header.jsp" %>


<%
    String userName = (String) request.getAttribute("userName");

%>

<div class="container">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
            <h1 id="homeHeading"> <%=userName%> Registered Successful</h1>
            <hr>
        </div>
    </div>
</div>


<%@include file="includes/body.jsp" %>



<%@include file="includes/footer.jsp" %>
