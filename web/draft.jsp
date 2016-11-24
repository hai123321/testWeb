<%-- 
    Document   : draft
    Created on : Nov 10, 2016, 11:26:19 PM
    Author     : WindyKiss
--%>

<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="jdbc.DbContext"%>
<%@include file="includes/header.jsp"%>

<div class="container">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
            <%
                DbContext db = new DbContext();
                String user = (String) session.getAttribute("userName");
                String query = "SELECT * FROM Posts WHERE userName='"+ user +"' ORDER BY time DESC";
                try {
                    ResultSet rs = db.executeQuery(query);
            %>

            <%
                while (rs.next()) {
                    String userName = rs.getString(1);
                    String title = rs.getString(2);
                    String content = rs.getString(3);
                    Date time = rs.getDate(4);
                    boolean state = rs.getBoolean(5);
                    if (state == false) {

            %>
            <div class="post-preview">
                <a a href="editPost.jsp?title=<%=title%>&content=<%=content%>&state=<%=state%>&user=<%=userName%>">
                    <h2 class="post-title">
                        <%=title%>
                        <h3 class="post-subtitle">
                            <%=content%>
                        </h3>
                </a>
                <p class="post-meta">Posted by <a href="#"><%=userName%></a> on <%=time%></p>
            </div>
            <hr>
            <%
                        }
                    }
                    db.close();
                } catch (Exception e) {

                }
            %>

            
            <!-- Pager -->
            <ul class="pager">
                <li class="next">
                    <a href="#">Older Posts &rarr;</a>
                </li>
            </ul>
        </div>
    </div>
</div>

<hr>
<%@include file="includes/body.jsp"%>

<%@include file="includes/footer.jsp"%>
