<%-- 
    Document   : Register
    Created on : Nov 10, 2016, 9:23:59 PM
    Author     : WindyKiss
--%>


<%@include file="includes/header.jsp"%>
<%
    String main = "Please register. After you got an Account, You can start write your blog";
    if((request.getAttribute("request")) != null){
        main = (String) request.getAttribute("request");
    }
%>
<div class="container">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
            <p><%=main%></p>
            <!-- Contact Form - Enter your email address on line 19 of the mail/contact_me.php file to make this form work. -->
            <!-- WARNING: Some web hosts do not allow emails to be sent through forms to common mail hosts like Gmail or Yahoo. It's recommended that you use a private domain email address! -->
            <!-- NOTE: To use the contact form, your site must be on a live web host with PHP! The form will not work locally! -->
            <form action="CourseValidServlet">
                <div class="row control-group">
                    <div class="form-group col-xs-12 floating-label-form-group controls">
                        <label>User Name</label>
                        <input type="text" class="form-control" placeholder="User Name" name="userName" auto-validate pattern="^[a-zA-Z0-9]{6,}$">
                        <p class="help-block text-danger"></p>
                    </div>
                </div>
                <div class="row control-group">
                    <div class="form-group col-xs-12 floating-label-form-group controls">
                        <label>Password</label>
                        <input type="password" class="form-control" placeholder="Password" name="password" auto-validate pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,}">
                        <p class="help-block text-danger"></p>
                    </div>
                </div>
                <hr>
                <div id="success"></div>
                <div class="row">
                    <div class="form-group col-xs-12">
                        <input type="submit" value="Register" class="btn btn-default"></input>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<hr>

<%@include file="includes/body.jsp"%>

<%@include file="includes/footer.jsp"%>
