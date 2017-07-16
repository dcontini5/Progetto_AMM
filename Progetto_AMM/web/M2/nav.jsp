<%-- 
    Document   : nav.jsp
    Created on : 15-Jul-2017, 12:04:54
    Author     : D_con
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav>
    <ul>
        <li <c:if test="${page=='bacheca'}">class="active"</c:if>><a href="Bacheca" class="navbar">Bacheca</a></li>
        <li <c:if test="${page=='profilo'}">class="active"</c:if>><a href="Profilo" class="navbar">Profilo</a></li>
      
    </ul>
</nav>


