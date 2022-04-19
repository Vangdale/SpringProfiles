<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
    </head>
    <body>
        <form:form action="index" method="post" modelAttribute="datos">
            <label for="Data1">Introduce primer dato</label><br><br>
            <input path="Data1 "type="text" id="Data1" name="Data1"><br><br>

            <label for="Data2">Introduce segundo dato</label><br><br>
            <input path="Data2 "type="text" id="Data2" name="Data2"><br><br>

            <input type="submit" value="Añadir datos">
        </form:form>

        <table>
                    <thead>
                        <tr>
                            <th>Resultado: </th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>${mensaje}</td>
                        </tr>
                    </tbody>
                </table>
    </body>
</html>