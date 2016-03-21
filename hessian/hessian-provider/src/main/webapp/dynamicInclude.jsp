<%@pagecontentType="text/html;charset=gb2312"%>
<html>
         <head>
                   <title>动态包含</title>
         </head>
         <bodystyle="background-color:lightblue">
 
                   <jsp:include page="header.jsp" flush="true"/><!--动态包含-->
 
                   <tableborder="1" align="center">
                            <tr>
                                     <td>姓名</td><td>性别</td><td>年龄</td><td>爱好</td>
                            </tr>
                            <tr>
                                     <td>a</td><td>b</td><td>c</td><td>d</td>
                            </tr>
                   </table>
         </body>
</html>