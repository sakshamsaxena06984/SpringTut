<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<html>
<body>
<h2>Hello World!</h2>
<p>it is using for controller /home </p>
<%
String name=(String) request.getAttribute("name");
Integer id=(Integer) request.getAttribute("id");
List<String> l=request.getAttribute("names");
%>
<h2>Name is <%=name%></h2>
<h3>Id is <%=id%></h3>
<%
   for(String s:l){
            out.println(s);
        }
%>
</body>
</html>
