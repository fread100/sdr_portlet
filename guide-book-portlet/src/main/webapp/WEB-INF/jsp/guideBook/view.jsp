<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>
<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<%@ page import="com.liferay.portal.kernel.util.StringUtil" %>

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%--<script type='text/javascript' src='https://www.x3dom.org/download/x3dom.init.js'> </script>--%>
<%--<link rel='stylesheet' type='text/css' href='https://www.x3dom.org/download/x3dom.css'/>--%>

<style>
    .aui .hide {
        display: none !important;
    }
</style>
<portlet:defineObjects />
<portlet:renderURL var="createBook">
    <portlet:param name="action" value="detail"/>
</portlet:renderURL>

<portlet:renderURL var="simpleDialogExample"
                   windowState="<%=LiferayWindowState.POP_UP.toString()%>">
    <portlet:param name="action" value="popup"/>
</portlet:renderURL>
<portlet:actionURL var="saveURL">
    <portlet:param name="action" value="save"/>
</portlet:actionURL>
<portlet:renderURL var="downloadView">
    <portlet:param name="action" value="downloadView"/>
</portlet:renderURL>
<portlet:renderURL var="uploadView">
    <portlet:param name="action" value="uploadView"/>
</portlet:renderURL>
<portlet:renderURL var="listURL"/>

<aui:form method="post" name="dataViewForm">
<div class="search-form">
    <div class="control-group search-inputbox">
        <%--<aui:select name="dataTypeId" label="" inlineLabel="true" id="dataTypeSelect" >
            <aui:option value="" >DataType</aui:option>
            <c:forEach items="${dataTypeList }" var="vo">
                <aui:option value="${vo.dataTypeId }" >${vo.title }</aui:option>
            </c:forEach>
        </aui:select>--%>
        <div class="input-append">
            <aui:input type="text" inlineField="true" label="" id="searchInput" name="keyword" placeholder="Please enter search title" value="${keyword}" style="width:494px;"/>
        </div>
        <aui:button cssClass="search-button btn-success" value="search" id="searchBtn" onClick="searchView()" />
    </div>
</div>

<liferay-ui:search-container searchContainer="${searchContainer}">
    <liferay-ui:search-container-results results="${searchContainer.results}"
                                         total="${searchContainer.total}" />
    <liferay-ui:search-container-row className="com.sdr.guide.model.Book" modelVar="vo">
        <portlet:renderURL var="rowURL">
            <portlet:param name="bookId" value="${vo.gusetbookId}"/>
            <portlet:param name="action" value="detail"/>
        </portlet:renderURL>
        <portlet:renderURL var="detailBook">
            <portlet:param name="bookId" value="${vo.gusetbookId}"/>
            <portlet:param name="viewPage" value="viewPage"/>
            <portlet:param name="action" value="detail"/>
        </portlet:renderURL>
        <portlet:actionURL var="deleteBook">
            <portlet:param name="bookId" value="${vo.gusetbookId}"/>
            <portlet:param name="action" value="delete"/>
            <portlet:param name="currentURL" value="${currentURL}"/>
        </portlet:actionURL>
        <liferay-ui:search-container-column-text property="title" name="제목" href="${detailBook}"/>
        <liferay-ui:search-container-column-text property="userName" name="작성자"/>
        <liferay-ui:search-container-column-text name="생성날짜">
            <c:if test="${not empty vo.createDate}"><fmt:formatDate pattern = "yyyy-MM-dd HH:mm:ss" value = "${vo.createDate}" /></c:if>
            <c:if test="${empty vo.createDate}"></c:if>
        </liferay-ui:search-container-column-text>
        <liferay-ui:search-container-column-text name="수정날짜" >
            <c:if test="${not empty vo.modifiedDate}"><fmt:formatDate pattern = "yyyy-MM-dd HH:mm:ss" value = "${vo.modifiedDate}" /></c:if>
            <c:if test="${empty vo.modifiedDate}"></c:if>
        </liferay-ui:search-container-column-text>
        <liferay-ui:search-container-column-text name="삭제" value="delete" href="${deleteBook}"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator/>

</liferay-ui:search-container>
<aui:button cssClass="btn btn-primary" value="createBook" onClick="${createBook}" ></aui:button>
<aui:button name="simple-dialog-example"  id="simple-dialog-example"  value="Click Here See Simple Allou UI Dialog" onClick="javascript:showAddNoteDialog()" />
</aui:form>

<aui:button cssClass="btn btn-primary" value="uploadView" onClick="${uploadView}" ></aui:button>
<aui:button cssClass="btn btn-primary" value="downloadView" onClick="${downloadView}" ></aui:button>


<%--<h1>Hello, X3DOM!</h1>
<p>
    This is my first html page with some 3d objects.
</p>
<div style="width:500px;height:400px">
    <x3d width='500px' height='400px'>
        <scene>
            <viewpoint position="-1.94639 1.79771 -2.89271" orientation="0.03886 0.99185 0.12133 3.75685"></viewpoint>
            &lt;%&ndash;<Inline nameSpaceName="Deer" mapDEFToID="true"
                    onclick='redNose();' url="<%=request.getContextPath()%>/x3d/Deer.x3d" />&ndash;%&gt;
            <Inline nameSpaceName="Deer" mapDEFToID="true"
                    onclick='redNose();' url="C:/Users/leegyuseong/x3d/Deer.x3d" />
        </scene>
    </x3d>
</div>
<script>
    console.log('<%=request.getContextPath()%>');
    function redNose()
    {
        if(document.getElementById('Deer__MA_Nose').getAttribute('diffuseColor')!= '1 0 0')
            document.getElementById('Deer__MA_Nose').setAttribute('diffuseColor', '1 0 0');
        else
            document.getElementById('Deer__MA_Nose').setAttribute('diffuseColor', '0 0 0');
    }
</script>--%>

<!-- div modal start-->
<div class="yui3-skin-sam">
    <div id="modal">

    </div>
</div>
<iframe id="editorIframe" name="editorIframe" allowfullscreen src="<%=request.getContextPath()%>/css/test.jsp"
        width="100%" height="950px" style="border:1px solid #eee; box-sizing:border-box;"></iframe>--%>


<%--<div class="modal fade" id="textarea-modal" tabindex="-1" role="dialog" aria-labelledby="textarea-modal" aria-hidden="true">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Export html</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">

                <textarea rows="25" cols="150" class="form-control"></textarea>

            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" title="Download" data-vvveb-action="download" download="index.html">
                    <i class="la la-download"></i> Download
                </button>
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>--%>

<!-- div modal end-->
<script>
    function showAddNoteDialog(){

        YUI().ready(function(A) {
            YUI().use('aui-base','liferay-util-window', function(A) {
                Liferay.Util.Window.getWindow({
                    id:'<portlet:namespace/>popUpDialog',
                    title : '<h3><label for="formsofinteraction"><liferay-ui:message key="confirmationBox"/></label></h3>',
                    uri: '${simpleDialogExample}',
                    dialog: {
                        destroyOnHide: true,
                        cache: false,
                        modal: true,
                        height: 600,
                        width: 400
                    }
                }).after('destroy', function(event) {
                    //alert('DESTROY MODAL!');
                });
                Liferay.provide(
                    window,
                    '<portlet:namespace/>closePopup',
                    function(popupIdToClose) {
                        var popupDialog = Liferay.Util.Window.getById(popupIdToClose);
                        popupDialog.destroy();
                    },
                    ['liferay-util-window']
                );
                Liferay.provide(window, 'refreshPortlet', function() {
                        var curPortlet = '#p_p_id<portlet:namespace/>';
                        Liferay.Portlet.refresh(curPortlet);
                    },
                    ['aui-dialog','aui-dialog-iframe']
                );

            });
        });
        <%--YUI().use('aui-modal', function(Y) {
                var modal = new Y.Modal(
                    {
                        centered: true,
                        headerContent: '<h3><label for="formsofinteraction"><liferay-ui:message key="confirmationBox"/></label></h3>',
                        modal: true,
                        render: '#modal',
                        width: 500
                    }
                ).plug( Y.Plugin.IO,{uri: '${simpleDialogExample}'} ).render();
                modal.addToolbar(
                    [
                        {
                            label: '<liferay-ui:message key="Cancel"/>',
                            on: {
                                click: function() {
                                    modal.hide();
                                }
                            }
                        },
                        {
                            label: '<liferay-ui:message key="Submit"/>',
                            on: {
                                click: function() {
                                    modal.hide();
                                    //document.getElementById("<portlet:namespace/>fm").submit();
                                }
                            }
                        },
                    ]
                );
        });--%>
    }
    function searchView(){
        var f = document.<portlet:namespace/>dataViewForm;
        f.action = '${listURL}';
        f.submit();
    }
</script>

<%--<aui:button-row>
    <aui:button value="create gusetbook" onClick="${createBook}"/>
</aui:button-row>--%>
