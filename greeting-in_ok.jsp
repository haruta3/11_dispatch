<%@page  contentType="text/html; charset=UTF-8" %> 

<html>
<head>
    <title>書籍登録画面</title>
   
</head>

<body>
    <h2>■書籍在庫管理システム</h2>
        <h3>　【書籍登録画面】</h3>
        <form action="servlet/ResultServlet">
        <% String t=(String)request.getAttribute("Title");%>
        <% out.println(t); %>
        
        <% String w=(String)request.getAttribute("Writer");%>
        <% out.println(w); %>
        
        <% String p=(String)request.getAttribute("Publisher");%>
        <% out.println(p); %>
        
        <% String p2=(String)request.getAttribute("Price");%>
        <% out.println(p2); %>
        
        <% String g=(String)request.getAttribute("genre");%>
        <% out.println(g); %>
        
        <% String s=(String)request.getAttribute("stock");%>
        <% out.println(s); %>
        
        <% String r=(String)request.getAttribute("remarks");%>
        <% out.println(r); %>
        
            <p>ゆるキャン</p>
        </form>
</body>
</html>
