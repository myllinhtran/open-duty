<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" ; charset="UTF-8">
    <title>Schedule Information</title>
</head>
<body>
<form action="createSchedule" method="post">
        <pre>
        ID: <input type="text" name="id" id="id"/><span id="errMsg"></span>
        Start Date: <input type="date" name="startTime" id="startTime"/>
        End Date: <input type="date" name="endTime" id="endTime"/>
        <input type="submit" name="Submit"/>
        </pre>
</form>

<br/>${result}

</body>
</html>