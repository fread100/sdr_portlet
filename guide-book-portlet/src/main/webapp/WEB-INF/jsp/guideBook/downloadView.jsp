<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<b>Click link to download files</b>
<br><br>
<c:forEach items="${urlMap}" var="links">
    <a href="${links.value}" target="blank">${links.key}</a><br>
</c:forEach>