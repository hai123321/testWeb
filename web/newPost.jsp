<%-- 
    Document   : newPost
    Created on : Nov 11, 2016, 12:43:49 PM
    Author     : WindyKiss
--%>

<%@include file="includes/header.jsp"%>
<div class="container">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
            <p>Create your new post</p>
            <!-- Contact Form - Enter your email address on line 19 of the mail/contact_me.php file to make this form work. -->
            <!-- WARNING: Some web hosts do not allow emails to be sent through forms to common mail hosts like Gmail or Yahoo. It's recommended that you use a private domain email address! -->
            <!-- NOTE: To use the contact form, your site must be on a live web host with PHP! The form will not work locally! -->
            <form action="CreatePostServlet">
                <div class="row control-group">
                    <div class="form-group col-xs-12 floating-label-form-group controls">
                        <label>Title</label>
                        <input type="text" class="form-control" placeholder="Title" name="title" required data-validation-required-message="Please enter your title.">
                        <p class="help-block text-danger"></p>
                    </div>
                </div>

                <div class="row control-group">
                    <div class="form-group col-xs-12 floating-label-form-group controls">
                        <p>Content</p>
                        <textarea name="content"></textarea>
                        <p class="help-block text-danger"></p>
                    </div>
                </div>
                <br>

                <div id="success"></div>
                <div class="row">
                    <div class="form-group col-xs-12">
                        <input type="submit" value="Create" class="btn btn-default"></input>&nbsp;
                    </div>
                    
                    <input type="checkbox" name="published" value="Published">Published.
                </div>
            </form>
        </div>
    </div>
</div>

<hr>

<%@include file="includes/body.jsp"%>

<%@include file="includes/footer.jsp"%>
