<%-- 
    Document   : index
    Created on : Nov 10, 2016, 1:13:41 AM
    Author     : WindyKiss
--%>

<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="jdbc.DbContext"%>
<%@include file="includes/header.jsp"%>
<%    String query = "WITH T AS (SELECT *,ROW_NUMBER() OVER (ORDER BY time DESC) AS SNO FROM Posts) SELECT * FROM T WHERE SNO = ";
    int count = 1;
    int max = 0;
    if (request.getParameter("count") != null) {
        count = Integer.parseInt(request.getParameter("count"));
    }


%>
<div class="container">
    <div class="row">
        <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
            <%                for (int i = count; i < count + 4; i++) {
                    String tmpQuery = query + i;
                    DbContext db = new DbContext();
                    try {
                        ResultSet rs = db.executeQuery(tmpQuery);
            %>

            <%
                while (rs.next()) {

                    String userName = rs.getString(1);
                    String title = rs.getString(2);
                    String content = rs.getString(3);
                    Timestamp time = rs.getTimestamp(4);
                    boolean state = rs.getBoolean(5);
                    if (state == true) {

            %>
            <div class="post-preview">
                <a href="editPost.jsp?title=<%=title%>&content=<%=content%>&state=<%=state%>&user=<%=userName%>">
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
                }
            %>


            <!-- Pager -->
            <ul class="pager">

                <li class="next">
                    <%
                        String tmpQuery = "WITH T AS (SELECT *,ROW_NUMBER() OVER (ORDER BY time DESC) AS SNO FROM Posts) SELECT MAX(SNO) FROM T";
                        DbContext db = new DbContext();
                        try {
                            ResultSet rs = db.executeQuery(tmpQuery);
                    %>

                    <%
                        while (rs.next()) {
                            max = rs.getInt(1);
                    %>

                    <%
                            }
                            db.close();
                        } catch (Exception e) {
                        }
                        if (count + 3 > max) {


                    %>

                    <a href="index.jsp?count=<%=count%>">Older Posts &rarr;</a>

                    <%
                    } else {
                    %>
                    <a href="index.jsp?count=<%=(count + 3)%>">Older Posts &rarr;</a>
                    <%
                        }
                    %>

                    <%
                        if (count - 3 < 1) {
                    %>
                    <a href="index.jsp?count=<%=count%>">&larr; Newer Posts</a>
                    <%
                    } else {
                    %>
                    <a href="index.jsp?count=<%=(count - 3)%>">&larr; Newer Posts</a>
                    <%
                        }
                    %>
                </li>
            </ul>
        </div>
    </div>
</div>

<hr>
<%@include file="includes/body.jsp"%>

<%@include file="includes/footer.jsp"%>