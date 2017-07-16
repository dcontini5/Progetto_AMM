<%-- 
    Document   : profilo
    Created on : 15-Jul-2017, 17:51:33
    Author     : D_con
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Profilo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Davide Contini">
        <meta name="keywords" content="cerca nerdbook social nerd profilo">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        
        <header class="SiteHeader">


             <div id="SiteTitle">
                 <p class="SiteName">Nerdbook</p>
             </div>

             <c:set var="page" value="profilo" scope="request"/>
             <jsp:include page="nav.jsp"/>

             <div id="BackLog">

                <div>
                 <img alt="Micky Myers" src="img/Michael_myers.jpg" width="25" height="25">
                 <p class="Username">Michael Myers</p>
                 <a href="login.html" id="LogLink" class="navbar">Logout</a>
                </div>
             </div>
         </header>
        
       
        
        <div id="ProfBody" class="PageBody">
            
            <div class="Sidebar">
                <div class="Persone">
                    <div class="PersTitle">
                        <h2>Persone</h2>
                    </div>
                    <div>
                        <img alt="tizio_spaventato" src="img/babadook.jpg" width="30" height="30">
                        <p class="Utente">Tizio Spaventato</p>
                    </div>
                    <div>
                        <img alt="Freddy Krugy" src="img/krueger-glove.jpg" width="30" height="30">
                        <p class="Utente">Freddy Krueger</p>
                    </div>
                    <div>
                        <img alt="Jasy Voory" src="img/jason.jpg" width="30" height="30">
                        <p class="Utente">Jason Voorhees</p>
                    </div>
                </div>
                
                <div class="Gruppi">
                    <div class="GrupTitle">
                        <h2>Gruppi</h2>
                    </div>
                    <div>
                        <img alt="Maratona" src="img/runner-clip-art.jpg" width="30" height="30">
                        <p class="Utente">Maratone</p>
                    </div>
                    <div>
                        <img alt="Fisica_tele" src="img/atom.png" width="30" height="30">
                        <p class="Utente">Gli immortali</p>
                    </div>
                   
                </div>
                
             </div>    
            <div id="AggProf">
                
                <div id="ProfPic">
                    <img alt="Micky Myers" src="img/Michael_myers.jpg" width="100" height="100">
                </div>
                
                <form action="servlet.java" method="post" id="AggInfo">
                    
                    <div id="UserInfo">
                        
                        <div class="info">
                            <label for="NameText">Nome:</label>
                            <input type="text" name="NameText" id="NameText"><br>
                        </div>
                        <div class="info">
                            <label for="SurnameText">Cognome:</label>
                            <input type="text" name="SurnameText" id="SurnameText"><br>
                        </div>
                        <div class="info">
                            <label for="BirthDate">Data di Nascita:</label>
                            <input type="date" name="BirthDate" id="BirthDate"><br>
                        </div>
                        <div class="info">
                            <label for="UserPass">Password:</label>
                            <input type="password" name="UserPass" id="UserPass"><br>
                        </div>
                        <div class="info">
                            <label for="ConfPass">Conferma Password:</label>
                            <input type="password" name="ConfPass" id="ConfPass"><br>
                        </div>
                        <div class="info">
                            <label for="UserBio">Descriviti in poche parole:</label>
                            <textarea name="UserBio" id="UserBio"></textarea><br>
                        </div>
                        <div class="info">
                            <label for="UserPic">Url immagine del profilo:</label>
                            <input type="url" name="UserPic" id="UserPic"><br>
                        </div>
                        
                    </div>
                    
                    <button type="submit">Invia</button>
                    
                </form>
                
            </div>
            
        </div>
        
        
    </body>
</html>
