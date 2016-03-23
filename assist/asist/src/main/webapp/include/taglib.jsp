<%@page import="com.asist.utils.ResourceProperty"%>
<%@ page import="java.util.Date"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
    //禁用IE缓存
    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setDateHeader("Expires", 0);
    String path = request.getContextPath();
    String temp = request.getServerPort() == 80 ? "" : ":" + request.getServerPort();
    String basePath = ResourceProperty.createResourceProperty().getValue("BASE_PATH");
    if (application.getAttribute("basePath") == null) {
        application.setAttribute("basePath", basePath);
    }
    
    String pageId = new Date().getTime() + "_" + Math.random();
    
    String scheme = request.getScheme();
    String url = request.getRequestURI();
%>