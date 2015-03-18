
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="icon" href="<c:url value="/resources/image/badge.png"/> ">
  <title>Orix</title>

  <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/> ">
  <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/> ">
  <link rel="stylesheet" href="<c:url value="/resources/css/general.css"/> ">



</head>
<body>

  <tiles:insertAttribute name="navigation"/>
  <tiles:insertAttribute name="body"/>

</body>
</html>