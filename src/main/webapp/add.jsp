<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Transaction</title>
    <style>
        form {
            width: 300px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 8px;
            background-color: #4caf50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<h2>Add Transaction:</h2>
<form action="add" method="POST">
    <label for="ref">Reference:</label>
    <input type="text" id="ref" name="ref" required><br><br>

    <label for="cptDeb">Debit Account:</label>
    <input type="text" id="cptDeb" name="cptDeb" required><br><br>

    <label for="cptCred">Credit Account:</label>
    <input type="text" id="cptCred" name="cptCred" required><br><br>

    <label for="montant">Amount:</label>
    <input type="number" id="montant" name="montant" required><br><br>

    <input type="submit" value="Submit">
</form>

<br>
<a href="index.jsp">List Transactions</a>
</body>
</html>
