<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'tableTwo.label', default: 'TableTwo')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#edit-tableTwo" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
                <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="edit-tableTwo" class="content scaffold-edit" role="main">
            <h1><g:message code="default.edit.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${this.tableTwo}">
            <ul class="errors" role="alert">
                <g:eachError bean="${this.tableTwo}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
            </g:hasErrors>
            <g:form resource="${this.tableTwo}" method="PUT">
                <g:hiddenField name="version" value="${this.tableTwo?.version}" />
                <fieldset class="form">
                    <!-- 1. we need to make some fields readonly after they were created -->
                    <!--      desired syntax would be: %{--<f:all bean="tableTwo" readonly="['strName','strType', 'intgNo']"/>--}% -->

                    <!-- 2. we must use individual fields until https://github.com/grails-fields-plugin/grails-fields/issues/259 gets implemented -->
                    <f:field bean="tableTwo" property="strName" widget-readonly="true" />
                    <f:field bean="tableTwo" property="strNote" />
                    <f:field bean="tableTwo" property="strType" widget-readonly="true"/>
                    <f:field bean="tableTwo" property="intgNo"  widget-readonly="true"/>
                    <f:field bean="tableTwo" property="three" />
                    %{--<f:all bean="tableTwo"/>--}%
                </fieldset>
                <fieldset class="buttons">
                    <input class="save" type="submit" value="${message(code: 'default.button.update.label', default: 'Update')}" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>
