<%-- 
    Document   : vehicles
    Created on : 19/11/2025, 6:57:14 p. m.
    Author     : jufeq
--%>

<%@page import="com.juanfedevmaster.webvehiclesapp.models.Vehicle"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vehiculos</title>
        <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
        <script src="https://cdn.datatables.net/2.3.2/js/dataTables.js"></script>
        <link rel="stylesheet" href="https://cdn.datatables.net/2.3.2/css/dataTables.dataTables.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    </head>
    <body>
        <% List<Vehicle> vehicles = (List<Vehicle>) request.getAttribute("vehicleList");%>
        <div class="container text-center mt-5">
            <div class="row">
                <div class="col">

                </div>
                <div class="col-12">
                    <table id="example" class="display">
                        <thead>
                            <tr>
                                <th>Brand</th>
                                <th>Model</th>
                                <th>Year </th>
                                <th>Price</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%for (Vehicle vehicle : vehicles) {%>
                            <tr>
                                <td><%=vehicle.getBrand()%></td>
                                <td><%=vehicle.getModel()%></td>
                                <td><%=vehicle.getYear()%></td>
                                <td><%="$" + vehicle.getPrice()%></td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
                <div class="col">

                </div>
            </div>
        </div>

        <script>
            new DataTable('#example');
        </script>

    </body>
</html>
