<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String campoNum1 = request.getParameter("campoNum1");
	String campoNum2 = request.getParameter("campoNum2");
	int num1 = Integer.parseInt(campoNum1);
	int num2 = Integer.parseInt(campoNum2);
	int total = num1 + num2;
%>

El resultado es <%= total %>