<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

  

    
    
    <style>
    
    .image_style{
        display: block;
        width: auto;
        margin-left: auto;
        margin-right: auto
        }

        .table th,td {
   			text-align: center;   
		}
        
</style>
  </head>
    
    <body>
        <div class="container">
            <div class="row row-content">
              <img src="http://www.chinmayamission.com/wp-content/uploads/2014/07/ccmt-banr.jpg" class="img-responsive image_style" >
            </div>
            <div>    
              <span><br><br>Thank you <b>${name}</b> for your purchase.Your Confirmation Number is: <b>${authorizationCode}.</b>Your ticket details are as shown below.<br></span>
            </div>    
           
            <div class="row row-content">
                <div class="table-responsive">    
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Ticket Code</th>
                                        <th>Adult Tickets</th>
                                        <th>Child Tickets</th>
                                        <th>Youth Tickets</th>
									</tr>
									
									
                                
                                </thead>
                                <c:forEach items="${ticketDetails}" var="ticket">
									    <tr>
									        <td><c:out value="${ticket.getTicketCode()}"/></td>
									        <td><c:out value="${ticket.getAdultTicketCount()}"/></td>
									        <td><c:out value="${ticket.getChildTicketCount()}"/></td>
									        <td><c:out value="${ticket.getYouthTicketCount()}"/></td>  
									    </tr>
									</c:forEach>

                            </table>
                            <p align="center"><b style="font-size:20px">Please print this page for your records and bring it to the event.</b></p>
                </div>    
           
        
        
            </div>
    </div>
    
    </body>
    

  </html>