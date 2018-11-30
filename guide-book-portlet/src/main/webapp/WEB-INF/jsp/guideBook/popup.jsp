<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<portlet:actionURL name="save" var="saveURL"/>

<c:if test="${sucessflag eq true}">
    <script>
        Liferay.Util.getOpener().<portlet:namespace />closePopup('<portlet:namespace />popUpDialog');
        Liferay.Util.getOpener().<portlet:namespace />refreshPortlet();
    </script>
</c:if>

<aui:form action="${saveURL}" method="post" name="fmUpdateState" id="fmUpdateState">
    <aui:input name="bookId" type="hidden" value="${book.gusetbookId}"/>
    <%--<aui:input name="<%= SliderConstants.CMD %>" type="hidden" value="<%=SliderConstants.UPDATE%>"/>--%>
    <aui:fieldset label="bookcreate">
        <aui:input name="popup" value="popup" type="hidden"/>
        <aui:input name="title" id="title" value="${book.title}"/>
        <aui:input name="content" id="content" value="${book.content}"/>
        <aui:input name="userName" id="userName" value="${book.userName}">
            <aui:validator name="required" errorMessage="UserName requured"/>
            <%--<liferay-ui:error key = "userName.errorMsg.missing" message="Please userName"/>
            <liferay-ui:error key = "userName.errorMsg.Null" message="Please userName Input"/>--%>
        </aui:input>

        <aui:button-row>
            <aui:button name="saveButton" cssClass="save-btn" type="submit" value="create"/>
            <aui:button name="closeDialog" type="cancel" />
        </aui:button-row>
        <%--<aui:button-row>
            <aui:button name="saveForm" value="create" />

            &lt;%&ndash;<aui:button name="saveButton" cssClass="save-btn" type="submit" value="create"/>&ndash;%&gt;

        </aui:button-row>--%>
    </aui:fieldset>
</aui:form>

<script>
    function closeThis(){
        Liferay.Util.getOpener().<portlet:namespace />closePopup('<portlet:namespace />popUpDialog');
    }
    
    AUI().use('aui-base', 'aui-io-request', function (A) {
        <%--A.one('#<portlet:namespace/>saveForm').on('click', function (event) {
            var A = AUI();
            A.io.request('${saveURL}',{
                    method: 'POST',
                    form: {id: '<portlet:namespace/>fmUpdateState'},
                    on: {
                        success: function () {
                            console.log("sucess");
                            var data = this.get('responseData');
                            console.log(data);
                            Liferay.Util.getOpener().<portlet:namespace />closePopup('<portlet:namespace />popUpDialog');
                            Liferay.Util.getOpener().<portlet:namespace />refreshPortlet();

                        }
                    }
            });
        });--%>
        A.one('#<portlet:namespace/>closeDialog').on('click', function(event) {
            Liferay.Util.getOpener().<portlet:namespace />closePopup('<portlet:namespace />popUpDialog');
        });

    })

</script>