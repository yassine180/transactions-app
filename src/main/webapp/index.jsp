<%@ page import="ma.ensa.transactions_v2.Dao.TransactionDao" %>
<%@ page import="ma.ensa.transactions_v2.Dao.Impl.TransactionDaoImpl" %>
<%@ page import="ma.ensa.transactions_v2.Transaction" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        table {
            width: 80%;
            border-collapse: collapse;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
    </style>
</head>
<body>
<h1>Hi Mr. <%= request.getAttribute("username") %></h1>
<p>Here is your list of transactions:</p>

<table>
    <thead>
    <tr>
        <th>Date</th>
        <th>Type</th>
        <th>Reference</th>
        <th>Debit Account</th>
        <th>Credit Account</th>
        <th>Amount</th>
    </tr>
    </thead>
    <tbody>
    <% TransactionDao dao = new TransactionDaoImpl();
        List<Transaction> transas = dao.selectAll();
        for (Transaction trans : transas) {
    %>
    <tr>
        <td><%= trans.getDate() %></td>
        <td><%= trans.getType() %></td>
        <td><%= trans.getRef() %></td>
        <td><%= trans.getCptDeb() %></td>
        <td><%= trans.getCptCred() %></td>
        <td><%= trans.getMontant() %>$</td>
    </tr>
    <% } %>
    </tbody>
</table>


<br>
<a href="add.jsp">Add Transaction</a>
</body>
</html>