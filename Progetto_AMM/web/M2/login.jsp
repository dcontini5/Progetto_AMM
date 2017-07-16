<%-- 
    Document   : login
    Created on : 15-Jul-2017, 17:51:21
    Author     : D_con
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Davide Contini">
        <meta name="keywords" content="cerca nerdbook social nerd login entra">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    
    <body>
        <header id="LogHead">
            
            
            <div id="LogTitle">
                <p class="SiteName">Nerdbook</p>
            </div>
        </header>
        
        
        <div id="LogBody">
            
            <form id="logform" action="servlet.java" method="post">
                
                <div id="InfoLogin">
                    
                    <div class="info">
                    <label for="UserText">Username:</label>
                    <input type="text" name="UserText" id="UserText"><br>
                    </div>
                    <div class="info">
                    <label for="UserPass">Password:</label>
                    <input type="password" name="UserPass" id="UserPass"><br>
                    </div>
                </div>
                
                <button type="submit">Entra</button>
            </form>
            
            
        </div>
    </body>
</html>
