<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FORM TAG</title>
<!-- 处理验证出错时候的CSS样式 -->
<s:head cssStyle="color:red" />
</head>
<body>
	<a href="exception">Exception Demo</a>
	-----
	<br />
	<s:form action="commit">
		<s:textfield name="person.firstName" label="FIRSTNAME " />
		<s:textfield name="person.lastName" label="LASTNAME " />
		<s:textfield name="person.email" label="EMAIL " />
		<s:select list="ages" name="person.age" key="" label="AGE"/>
		<!-- 
		<s:radio list="ages" name="person.age" label="AGE" />
		 -->
		<s:checkboxlist list="ages" name="args" />
		<s:submit value="提交" />
	</s:form>
	-----
	<br />
	<s:form action="validate">
		<s:textfield name="person.firstName" label="FIRSTNAME " />
		<s:textfield name="person.lastName" label="LASTNAME " />
		<s:textfield name="person.email" label="EMAIL " />
		<s:textfield name="person.age" label="AGE " />
		<s:reset value="清空" />
		<s:submit value="提交" />
	</s:form>
	-----
	<br />
	<s:form action="validate">
		<s:textfield key="person.firstName" />
		<s:textfield key="person.lastName" />
		<s:textfield key="person.email" />
		<s:textfield key="person.age" />
		<s:reset value="清空" />
		<s:submit value="提交" />
	</s:form>
</body>
</html>