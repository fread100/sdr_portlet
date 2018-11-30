<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<script type="text/javascript">
    function goBack() {
        window.history.back()
    };
</script>
<portlet:renderURL var="saveURL">
    <portlet:param name="action" value="detail"/>
    <portlet:param name="bookId" value="${book.gusetbookId}"/>
</portlet:renderURL>
<table>
    <tr>
        <td>gusetbookId</td>
        <td>${book.gusetbookId}</td>
    </tr>
    <tr>
        <td>title</td>
        <td>${book.title}</td>
    </tr>
    <tr>
        <td>content</td>
        <td>${book.content}</td>
    </tr>
    <tr>
        <td>userName</td>
        <td>${book.userName}</td>
    </tr>
</table>
<aui:button cssClass="btn btn-primary" value="edite" onClick="${saveURL}" ></aui:button>
<a href="#" onclick="goBack()">return to page</a>