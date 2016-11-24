package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editPost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/includes/header.jsp");
    _jspx_dependants.add("/includes/body.jsp");
    _jspx_dependants.add("/includes/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    String userName = (String) request.getParameter("user");
    if(userName.equals(request.getSession().getAttribute("userName"))){
        response.sendRedirect("index.jsp");
        return;
    }
    String title = (String) request.getParameter("title");
    String content = (String) request.getParameter("content");
    session.setAttribute("title", title);
    String published = (String) request.getParameter("state");

      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>WindyKiss Blog</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"bootstrap/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Theme CSS -->\n");
      out.write("        <link href=\"bootstrap/css/clean-blog.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"bootstrap/vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <!--    <link href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("            <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>-->\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-default navbar-custom navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header page-scroll\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        Menu <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">WindyKiss Blog</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"newPost.jsp\">New Post</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                            if (session.getAttribute("userName") == null) {

                        
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"login.jsp\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
                    } else {

                        
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"draft.jsp\">Your Draft</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"logout.jsp\">Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
                        }
                        
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container -->\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Page Header -->\n");
      out.write("        <!-- Set your background image for this header on the line below. -->\n");
      out.write("        <header class=\"intro-header\" style=\"background-image: url('bootstrap/img/home-bg.jpg')\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1\">\n");
      out.write("                        <div class=\"site-heading\">\n");
      out.write("                            <h1>WindyKiss Blog</h1>\n");
      out.write("                            <hr class=\"small\">\n");
      out.write("                            <span class=\"subheading\">PRJ321_Lab5 Blog by WindyKiss</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1\">\n");
      out.write("            <p>Edit your post</p>\n");
      out.write("            <!-- Contact Form - Enter your email address on line 19 of the mail/contact_me.php file to make this form work. -->\n");
      out.write("            <!-- WARNING: Some web hosts do not allow emails to be sent through forms to common mail hosts like Gmail or Yahoo. It's recommended that you use a private domain email address! -->\n");
      out.write("            <!-- NOTE: To use the contact form, your site must be on a live web host with PHP! The form will not work locally! -->\n");
      out.write("            <form action=\"EditPostServlet\">\n");
      out.write("                <div class=\"row control-group\">\n");
      out.write("                    <div class=\"form-group col-xs-12 floating-label-form-group controls\">\n");
      out.write("                        <label>Title</label>\n");
      out.write("                        <input type=\"text\" value=\"");
      out.print(title);
      out.write("\" class=\"form-control\" placeholder=\"Title\" name=\"title\" required data-validation-required-message=\"Please enter your title.\">\n");
      out.write("                        <p class=\"help-block text-danger\"></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row control-group\">\n");
      out.write("                    <div class=\"form-group col-xs-12 floating-label-form-group controls\">\n");
      out.write("                        <p>Content</p>\n");
      out.write("                        <textarea name=\"content\">\n");
      out.write("                            ");
      out.print(content);
      out.write("\n");
      out.write("                        </textarea>\n");
      out.write("                        <p class=\"help-block text-danger\"></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <div id=\"success\"></div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"form-group col-xs-12\">\n");
      out.write("                        <input type=\"submit\" value=\"Save\" class=\"btn btn-default\"></input>&nbsp;\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        if (published.equalsIgnoreCase("true")) {
                    
      out.write("\n");
      out.write("                    <input type=\"checkbox\" name=\"published\" value=\"Published\" checked=\"");
      out.print(published);
      out.write("\">Published.\n");
      out.write("                    ");

                    } else {
                    
      out.write("\n");
      out.write("                    <input type=\"checkbox\" name=\"published\" value=\"Published\">Published.\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Main Content -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1\">\n");
      out.write("                <ul class=\"list-inline text-center\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"fa-stack fa-lg\">\n");
      out.write("                                <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                                <i class=\"fa fa-twitter fa-stack-1x fa-inverse\"></i>\n");
      out.write("                            </span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"fa-stack fa-lg\">\n");
      out.write("                                <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                                <i class=\"fa fa-facebook fa-stack-1x fa-inverse\"></i>\n");
      out.write("                            </span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <span class=\"fa-stack fa-lg\">\n");
      out.write("                                <i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("                                <i class=\"fa fa-github fa-stack-1x fa-inverse\"></i>\n");
      out.write("                            </span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <p class=\"copyright text-muted\">Copyright &copy; Your Website 2016</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!-- jQuery -->\n");
      out.write("<script src=\"bootstrap/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Bootstrap Core JavaScript -->\n");
      out.write("<script src=\"bootstrap/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- Contact Form JavaScript -->\n");
      out.write("<script src=\"bootstrap/js/jqBootstrapValidation.js\"></script>\n");
      out.write("<script src=\"bootstrap/js/contact_me.js\"></script>\n");
      out.write("<!--MCE-->\n");
      out.write("<!--<script src=\"bootstrap/js/tinymce.min.js\"></script>-->\n");
      out.write(" <script src=\"//cdn.tinymce.com/4/tinymce.min.js\"></script>\n");
      out.write("<script>tinymce.init({selector: 'textarea'});</script>\n");
      out.write("\n");
      out.write("<!-- Theme JavaScript -->\n");
      out.write("<script src=\"bootstrap/js/clean-blog.min.js\"></script>\n");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
