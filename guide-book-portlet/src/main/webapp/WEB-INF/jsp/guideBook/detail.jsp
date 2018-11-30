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

<portlet:actionURL var="saveURL" name="save"/>

<aui:form action="${saveURL}" method="post">
    <aui:input name="bookId" type="hidden" value="${book.gusetbookId}"/>
    <%--<aui:input name="<%= SliderConstants.CMD %>" type="hidden" value="<%=SliderConstants.UPDATE%>"/>--%>
    <aui:fieldset label="bookcreate">
        <aui:input name="title" value="${book.title}"/>
        <aui:input name="content" value="${book.content}"/>
        <aui:input name="userName" value="${book.userName}"/>
        <liferay-ui:error key = "userName.errorMsg.missing" message="Please userName"/>
        <liferay-ui:error key = "userName.errorMsg.Null" message="Please userName Input"/>
        <aui:button-row>
            <aui:button name="saveButton" cssClass="save-btn" type="submit" value="create"/>
        </aui:button-row>
    </aui:fieldset>
</aui:form>

<a href="#" onclick="goBack()">return to page</a>