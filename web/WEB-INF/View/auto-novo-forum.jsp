<%-- 
    Document   : auto-novo-forum
    Created on : 23/10/2015, 19:00:49
    Author     : alexandre.hauffe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de automovel</title>
    </head>
    <body>
        <h1>Novo automovel</h1>
        <form action="inserir" method="POST">
            Placa<input type="text" name="placa" id="placa"/>
            Ano de Fabricação<input type="text" name="anoFabricacao" id="anoFabricacao"/>
            <input type="submit" name="salvar" value="salvar"/>
        </form>
    </body>
</html>
